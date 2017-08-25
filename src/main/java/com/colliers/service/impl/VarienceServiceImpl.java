package com.colliers.service.impl;

import com.colliers.common.type.BASIS;
import com.colliers.common.type.FINANCIAL_FORMAT;
import com.colliers.common.utils.VarienceUtils;
import com.colliers.common.utils.dao.CustomDaoImpl;
import com.colliers.common.variance.VarienceCategoryResult;
import com.colliers.common.variance.VarienceReportResult;
import com.colliers.common.variance.VarienceResult;
import com.colliers.mri.mapper.BudgetsMapper;
import com.colliers.mri.mapper.GlsumMapper;
import com.colliers.mri.mapper.VarienceReportMapper;
import com.colliers.mri.pojo.Budgets;
import com.colliers.mri.pojo.BudgetsExample;
import com.colliers.mri.pojo.Glsum;
import com.colliers.mri.pojo.GlsumExample;
import com.colliers.service.VarienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VarienceServiceImpl implements VarienceService {

    @Autowired
    private GlsumMapper glsumMapper;
    @Autowired
    private BudgetsMapper budgetsMapper;
    @Autowired
    private CustomDaoImpl customDao;

    public VarienceServiceImpl() {
    }

    @Override
    public VarienceReportResult getVarienceReportResult(List<String> entityIdSet, String period, BASIS basis, FINANCIAL_FORMAT finFormat) {

        VarienceReportResult varReportResult = new VarienceReportResult();
        //1.get all individual building
        for (String entityId : entityIdSet) {

            VarienceCategoryResult varCatResult = new VarienceCategoryResult();

            // get a unique list of acct number from both Budgets and GLSUM
            List<String> acctNumList = this.customDao.selectVarienceAccountCodeList(entityId, basis.getBasisCode(), period, finFormat.getBeginAcctCodeNumberic(), finFormat.getEndAcctCodeNumberic());


            List<VarienceResult> varienceResults = acctNumList.stream().map(acctNum -> {
                GlsumExample glsumExample = new GlsumExample();
                GlsumExample.Criteria glsumCriteria = glsumExample.createCriteria();
                glsumCriteria
                        .andEntityidEqualTo(entityId)
                        .andPeriodEqualTo(period)
                        .andBasisEqualTo(basis.getBasisCode())
                        .andAcctnumEqualTo(acctNum)
                        .andAcctnumBetween(finFormat.getBeginAcctCode(), finFormat.getEndAcctCode());
                glsumExample.setDistinct(true);
                List<Glsum> glsumsData = this.glsumMapper.selectByExample(glsumExample);

                // get a unique of budget code from Budgets
                BudgetsExample budgetsExample = new BudgetsExample();
                BudgetsExample.Criteria budgetsExampleCriteria = budgetsExample.createCriteria();
                budgetsExampleCriteria
                        .andEntityidEqualTo(entityId)
                        .andPeriodEqualTo(period)
                        .andBasisEqualTo(basis.getBasisCode())
                        .andAcctnumEqualTo(acctNum)
                        .andAcctnumBetween(finFormat.getBeginAcctCode(), finFormat.getEndAcctCode());
                budgetsExample.setDistinct(true);
                List<Budgets> budgetsData = this.budgetsMapper.selectByExample(budgetsExample);

                // we expect only one data row record from each list
                // lets construct a VarienceResult data type
                //System.out.println("glsumsData size: " + glsumsData.size());
                //System.out.println("budgetsData size: " + budgetsData.size());
                VarienceResult varResult = VarienceUtils.CalculateVarienceResult(period, acctNum, glsumsData, budgetsData);
                //2.fullfill each VarienceResult
                return varResult;
                //3.add varienceResult to correct varience category
//                varCatResult.addVarienceResultToCategory(varResult);
            }).collect(Collectors.toList());

            // populating data to the varCatResult
            varCatResult.setData(varienceResults);
            varCatResult.setCategory("unknown");
            varCatResult.setPeriod(period);
            varCatResult.setEntityId(entityId);

            // simple calculation for total value within category
            double totalActualMTD = varienceResults.stream().mapToDouble(value ->
                    value.getActualMTD()).sum();
            double totalBudgetMTD = varienceResults.stream().mapToDouble(value -> value.getBudgetMTD()).sum();
            double totalVarienceMTD = totalActualMTD - totalBudgetMTD;
            double totalVariencePercentage = (totalVarienceMTD / totalBudgetMTD) * 100;
            varCatResult.setTotalActualMTD(totalActualMTD);
            varCatResult.setTotalBudgetMTD(totalBudgetMTD);
            varCatResult.setTotalVarienceDifference(totalVarienceMTD);
            varCatResult.setTotalVariencePercentage(totalVariencePercentage);

            // adding our calculated result category to our report list
            varReportResult.addVarienceCategoryToList(varCatResult);
        }


        //4. add category to the report result
        return varReportResult;
    }


}
