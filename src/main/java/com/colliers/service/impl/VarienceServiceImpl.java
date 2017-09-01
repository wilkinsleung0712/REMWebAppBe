package com.colliers.service.impl;

import com.colliers.common.type.BASIS;
import com.colliers.common.type.BUDTYPE;
import com.colliers.common.type.FINANCIAL_FORMAT;
import com.colliers.common.type.NOTE_TYPE;
import com.colliers.common.utils.ExceptionUtils;
import com.colliers.common.utils.VarienceUtils;
import com.colliers.common.utils.dao.CustomDaoImpl;
import com.colliers.common.variance.VarienceCategoryResult;
import com.colliers.common.variance.VarienceReportResult;
import com.colliers.common.variance.VarienceResult;
import com.colliers.mri.mapper.BudgetsMapper;
import com.colliers.mri.mapper.BudnoteMapper;
import com.colliers.mri.mapper.GlsumMapper;
import com.colliers.mri.mapper.VarienceReportMapper;
import com.colliers.mri.pojo.*;
import com.colliers.service.VarienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class VarienceServiceImpl implements VarienceService {

    @Autowired
    private GlsumMapper glsumMapper;
    @Autowired
    private BudgetsMapper budgetsMapper;
    @Autowired
    private CustomDaoImpl customDao;

    @Autowired
    private BudnoteMapper budnoteMapper;

    public VarienceServiceImpl() {
    }

    @Override
    public VarienceReportResult getVarienceReportResult(List<String> entityIdSet,
                                                        String beginPeriod,
                                                        String endPeriod,
                                                        BASIS basis,
                                                        FINANCIAL_FORMAT finFormat,
                                                        BUDTYPE budType) {

        VarienceReportResult varReportResult = new VarienceReportResult();
        List<VarienceResult> varienceResults = new ArrayList<>();

        //1.get all individual building
        for (String entityId : entityIdSet) {

            // budget data should only do once per building id
            List<VarienceReportBudget> budgetsData = this.customDao.selectVarienceBudgetResult(
                    entityId,
                    basis.getBasisCode(),
                    beginPeriod,
                    endPeriod,
                    finFormat.getBeginAcctCodeNumberic(),
                    finFormat.getEndAcctCodeNumberic(),
                    budType.getDescription());

            VarienceCategoryResult varCatResult = new VarienceCategoryResult();

            // get a unique list of acct number from both Budgets and GLSUM
            List<String> acctNumList = this.customDao.selectVarienceAccountCodeList(entityId, basis.getBasisCode(), beginPeriod, endPeriod, finFormat.getBeginAcctCodeNumberic(), finFormat.getEndAcctCodeNumberic());

            GlsumExample glsumExample = new GlsumExample();
            GlsumExample.Criteria glsumCriteria = glsumExample.createCriteria();
            glsumCriteria
                    .andEntityidEqualTo(entityId)
                    .andPeriodBetween(beginPeriod, endPeriod)
                    .andBasisEqualTo(basis.getBasisCode())
                    .andAcctnumIn(acctNumList)
                    .andAcctnumBetween(finFormat.getBeginAcctCode(), finFormat.getEndAcctCode());
            glsumExample.setDistinct(true);
            List<Glsum> glsumsData = this.glsumMapper.selectByExample(glsumExample);

            // get a unique of budget code from Budgets
            for (String acctNum : acctNumList) {
                Optional<VarienceResult> varResult = VarienceUtils
                        .CalculateVarienceResult(entityId, endPeriod, acctNum, glsumsData, budgetsData);
                //2.fullfill each VarienceResult
                if (varResult.isPresent()) {
                    varienceResults.add(varResult.get());
                }
            }

            // populating data to the varCatResult
            varCatResult.setData(varienceResults);
            varCatResult.setCategory("unknown");
            varCatResult.setPeriod(endPeriod);
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
            varReportResult.setBasis(basis);
            varReportResult.setBeginPeriod(beginPeriod);
            varReportResult.setEndPeriod(endPeriod);
        }


        //4. add category to the report result
        return varReportResult;
    }

    @Override
    public boolean AddNotesToVarianceData(String acctNum,
                                          String entityId,
                                          String department,
                                          BASIS basis,
                                          String beginPeriod,
                                          String endPerid,
                                          NOTE_TYPE noteType,
                                          String userId,
                                          String noteText) {

        try {


            BudnoteExample budnoteExample = new BudnoteExample();
            BudnoteExample.Criteria criteria = budnoteExample.createCriteria();

            criteria.andEntityidEqualTo(entityId)
//                    .andAcctnumLike(acctNum);
                    .andBasisEqualTo(basis.getBasisCode())
                    .andBudtypeEqualTo(BUDTYPE.APP.getDescription())
                    .andEndpdEqualTo(endPerid)
                    .andNotetypeEqualTo(noteType.getNoteTypeCode());
            List<Budnote> budnotes = this.budnoteMapper.selectByExampleWithBLOBs(budnoteExample);

            Optional<Budnote> budnoteOptional = budnotes.stream().filter(budnote -> budnote.getAcctnum().trim().equals(acctNum.trim())).findFirst();
            Budnote budnote = null;
            if (budnoteOptional.isPresent()) {
                budnote = budnoteOptional.get();
                // we know we can update the note text
                budnote.setNotetext(noteText);
                budnote.setNotetype(noteType.getNoteTypeCode());
                budnote.setUserid(userId);
                budnote.setLastdate(new Date());
                this.budnoteMapper.updateByPrimaryKeyWithBLOBs(budnote);
            } else {
                // we know its never been inserted so we do insert
                budnote = new Budnote();
                budnote.setEntityid(entityId);
                budnote.setAcctnum(acctNum);
                budnote.setBasis(basis.getBasisCode());
                budnote.setNotetext(noteText);
                budnote.setNotetype(noteType.getNoteTypeCode());
                budnote.setUserid(userId);
                budnote.setBegpd(endPerid);
                budnote.setEndpd(endPerid);
                budnote.setDepartment(department);
                budnote.setBudtype(BUDTYPE.APP.getDescription());
                budnote.setLastdate(new Date());
                this.budnoteMapper.insert(budnote);
            }

            return true;
        } catch (Exception ex) {
            System.err.println(ExceptionUtils.getStackTrace(ex));
        }
        return false;
    }


}
