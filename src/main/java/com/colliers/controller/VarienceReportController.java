package com.colliers.controller;

import com.colliers.common.ColliersMRIResult;
import com.colliers.common.type.BASIS;
import com.colliers.common.type.BUDTYPE;
import com.colliers.common.type.FINANCIAL_FORMAT;
import com.colliers.common.type.NOTE_TYPE;
import com.colliers.common.utils.ExceptionUtils;
import com.colliers.common.variance.VarienceReportResult;
import com.colliers.common.variance.VarienceRequestParams;
import com.colliers.mri.pojo.Budgets;
import com.colliers.mri.pojo.Budnote;
import com.colliers.mri.pojo.BudnoteKey;
import com.colliers.service.VarienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/report/varience", produces = {"application/json"})
@RestController
public class VarienceReportController {

    @Autowired
    private VarienceService varienceService;

    @PostMapping("/data")
    public ColliersMRIResult getVarienceReportDataSet(@RequestBody VarienceRequestParams requestParams) {
        ColliersMRIResult result = null;

        try {
            // lets validate our request data
            // lets construct the request argument
            VarienceReportResult varienceReportResult =
                    this.varienceService.getVarienceReportResult(
                            requestParams.getBuildingList(),
                            requestParams.getBeginPeriod(),
                            requestParams.getEndPeriod(),
                            BASIS.A,
                            FINANCIAL_FORMAT.CI_DETACC,
                            BUDTYPE.APP);
            result = ColliersMRIResult.ok(varienceReportResult);
        } catch (Exception ex) {
            result.build(500, ExceptionUtils.getStackTrace(ex));
        }
        return result;
    }

    @PostMapping("/notes/add")
    public ColliersMRIResult addVarienceNote(@RequestBody Budnote requestParams) {
        ColliersMRIResult result = null;

        try {
            // lets validate our request data
            // lets construct the request argument
            boolean status =
                    this.varienceService.AddNotesToVarianceData(
                            requestParams.getAcctnum(),
                            requestParams.getEntityid(),
                            requestParams.getDepartment(),
                            BASIS.A,
                            requestParams.getBegpd(),
                            requestParams.getEndpd(),
                            NOTE_TYPE.V,
                            requestParams.getUserid(),
                            requestParams.getNotetext());
            result = ColliersMRIResult.ok(status);
        } catch (Exception ex) {
            result.build(500, ExceptionUtils.getStackTrace(ex));
        }
        return result;
    }
}
