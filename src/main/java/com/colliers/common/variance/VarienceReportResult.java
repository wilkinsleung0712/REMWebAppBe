package com.colliers.common.variance;

import java.util.ArrayList;
import java.util.List;

public class VarienceReportResult {

    private List<VarienceCategoryResult> categoryResultList;

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

    @Override
    public String toString() {
        return "VarienceReportResult{" +
                "categoryResultList=" + categoryResultList +
                '}';
    }
}
