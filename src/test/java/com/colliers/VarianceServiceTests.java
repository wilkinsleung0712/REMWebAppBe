package com.colliers;

import com.colliers.common.type.BASIS;
import com.colliers.common.type.FINANCIAL_FORMAT;
import com.colliers.common.variance.VarienceCategoryResult;
import com.colliers.common.variance.VarienceReportResult;
import com.colliers.common.variance.VarienceResult;
import com.colliers.service.VarienceService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VarianceServiceTests {
    @Autowired
    private VarienceService varienceService;

    @Test
    public void VarienceDataTest() throws Exception {
        List<String> entityList = new ArrayList<>();
        entityList.add("201122");
        VarienceReportResult varienceReportResult = this.varienceService.getVarienceReportResult(entityList, "201405", BASIS.A, FINANCIAL_FORMAT.CI_DETACC);
        Assert.assertFalse(varienceReportResult==null);
        List<VarienceCategoryResult> categoryResultList = varienceReportResult.getCategoryResultList();
        List<VarienceResult> data = categoryResultList.get(0).getData();
        Assert.assertTrue("This should be 5 line",data.size() == 5);
        Assert.assertEquals("CI200100",data.get(0).getAcctNum());
        Assert.assertEquals("CI200110",data.get(1).getAcctNum());
        Assert.assertEquals("CI200190",data.get(2).getAcctNum());
        Assert.assertEquals("CI200310",data.get(3).getAcctNum());
        Assert.assertEquals("CI200350",data.get(4).getAcctNum());
        Assert.assertEquals(Double.valueOf(146491.06),categoryResultList.get(0).getTotalActualMTD());
        Assert.assertEquals(Double.valueOf(132374.71),categoryResultList.get(0).getTotalBudgetMTD());
    }
}
