package com.colliers.service;

import com.colliers.common.type.BASIS;
import com.colliers.common.type.FINANCIAL_FORMAT;
import com.colliers.common.variance.VarienceReportResult;

import java.util.List;

public interface VarienceService {
    public VarienceReportResult getVarienceReportResult(List<String> entityIdSet,
                                                        String period,
                                                        BASIS basis,
                                                        FINANCIAL_FORMAT finFormat);
}
