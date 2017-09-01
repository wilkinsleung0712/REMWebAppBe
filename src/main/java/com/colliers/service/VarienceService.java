package com.colliers.service;

import com.colliers.common.type.BASIS;
import com.colliers.common.type.BUDTYPE;
import com.colliers.common.type.FINANCIAL_FORMAT;
import com.colliers.common.type.NOTE_TYPE;
import com.colliers.common.variance.VarienceReportResult;

import java.util.List;

public interface VarienceService {
    VarienceReportResult getVarienceReportResult(List<String> entityIdSet,
                                                 String beginPeriod,
                                                 String endPeriod,
                                                 BASIS basis,
                                                 FINANCIAL_FORMAT finFormat,
                                                 BUDTYPE budtype);


    boolean AddNotesToVarianceData(String acctNum,
                                   String entityId,
                                   String department,
                                   BASIS basis,
                                   String beginPeriod,
                                   String endPerid,
                                   NOTE_TYPE noteType,
                                   String userId,
                                   String noteText);
}
