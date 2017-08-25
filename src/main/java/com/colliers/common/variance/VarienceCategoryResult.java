package com.colliers.common.variance;

import java.util.ArrayList;
import java.util.List;

public class VarienceCategoryResult {
    private String entityId;
    private String period;
    private String category;
    private List<VarienceResult> data;
    private Double totalActualMTD;
    private Double totalBudgetMTD;
    private Double totalVarienceDifference;
    private Double totalVariencePercentage;

    public VarienceCategoryResult() {
        data = new ArrayList<>();
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<VarienceResult> getData() {
        return data;
    }

    public void setData(List<VarienceResult> data) {
        this.data = data;
    }

    public Double getTotalActualMTD() {
        return totalActualMTD;
    }

    public void setTotalActualMTD(Double totalActualMTD) {
        this.totalActualMTD = totalActualMTD;
    }

    public Double getTotalBudgetMTD() {
        return totalBudgetMTD;
    }

    public void setTotalBudgetMTD(Double totalBudgetMTD) {
        this.totalBudgetMTD = totalBudgetMTD;
    }

    public Double getTotalVarienceDifference() {
        return totalVarienceDifference;
    }

    public void setTotalVarienceDifference(Double totalVarienceDifference) {
        this.totalVarienceDifference = totalVarienceDifference;
    }

    public Double getTotalVariencePercentage() {
        return totalVariencePercentage;
    }

    public void setTotalVariencePercentage(Double totalVariencePercentage) {
        this.totalVariencePercentage = totalVariencePercentage;
    }

    @Override
    public String toString() {
        return "VarienceCategoryResult{" +
                "entityId='" + entityId + '\'' +
                ", period='" + period + '\'' +
                ", category='" + category + '\'' +
                ", data=" + data +
                ", totalActualMTD=" + totalActualMTD +
                ", totalBudgetMTD=" + totalBudgetMTD +
                ", totalVarienceDifference=" + totalVarienceDifference +
                ", totalVariencePercentage=" + totalVariencePercentage +
                '}';
    }
}
