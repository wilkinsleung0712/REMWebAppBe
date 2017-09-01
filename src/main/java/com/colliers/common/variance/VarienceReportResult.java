package com.colliers.common.variance;

import com.colliers.common.type.BASIS;

import java.util.ArrayList;
import java.util.List;

public class VarienceReportResult {

    private List<VarienceCategoryResult> categoryResultList;
    private BASIS basis;
    private String beginPeriod;
    private String endPeriod;

    public VarienceReportResult() {
        categoryResultList = new ArrayList<>();
    }

    public VarienceReportResult(List<VarienceCategoryResult> categoryResultList) {
        this.categoryResultList = categoryResultList;
    }

    public List<VarienceCategoryResult> getCategoryResultList() {
        return categoryResultList;
    }

    public void setCategoryResultList(List<VarienceCategoryResult> categoryResultList) {
        this.categoryResultList = categoryResultList;
    }

    public void addVarienceCategoryToList(VarienceCategoryResult result) {
        this.categoryResultList.add(result);
    }

    public String getBasis() {
        return basis.getBasisCode();
    }

    public void setBasis(BASIS basis) {
        this.basis = basis;
    }

    public String getBeginPeriod() {
        return beginPeriod;
    }

    public void setBeginPeriod(String beginPeriod) {
        this.beginPeriod = beginPeriod;
    }

    public String getEndPeriod() {
        return endPeriod;
    }

    public void setEndPeriod(String endPeriod) {
        this.endPeriod = endPeriod;
    }
    
    @Override
    public String toString() {
        return "VarienceReportResult{" +
                "categoryResultList=" + categoryResultList +
                ", basis=" + basis +
                ", beginPeriod='" + beginPeriod + '\'' +
                ", endPeriod='" + endPeriod + '\'' +
                '}';
    }

}
