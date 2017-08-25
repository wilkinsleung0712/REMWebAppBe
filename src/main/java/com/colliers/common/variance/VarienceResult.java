package com.colliers.common.variance;

public class VarienceResult {
    private String AcctNum;
    private String AcctDescription;
    private String period;
    private double actualMTD;
    private double budgetMTD;
    private double varianceDifference;
    private double variancePrecentage;
    private String comments;

    public VarienceResult() {
    }

    public VarienceResult(String acctNum, String acctDescription, String period, double actualMTD, double budgetMTD, double varianceDifference, double variancePrecentage, String comments) {
        AcctNum = acctNum;
        AcctDescription = acctDescription;
        this.period = period;
        this.actualMTD = actualMTD;
        this.budgetMTD = budgetMTD;
        this.varianceDifference = varianceDifference;
        this.variancePrecentage = variancePrecentage;
        this.comments = comments;
    }

    public String getAcctNum() {
        return AcctNum;
    }

    public void setAcctNum(String acctNum) {
        AcctNum = acctNum;
    }

    public String getAcctDescription() {
        return AcctDescription;
    }

    public void setAcctDescription(String acctDescription) {
        AcctDescription = acctDescription;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public double getActualMTD() {
        return actualMTD;
    }

    public void setActualMTD(double actualMTD) {
        this.actualMTD = actualMTD;
    }

    public double getBudgetMTD() {
        return budgetMTD;
    }

    public void setBudgetMTD(double budgetMTD) {
        this.budgetMTD = budgetMTD;
    }

    public double getVarianceDifference() {
        return varianceDifference;
    }

    public void setVarianceDifference(double varianceDifference) {
        this.varianceDifference = varianceDifference;
    }

    public double getVariancePrecentage() {
        return variancePrecentage;
    }

    public void setVariancePrecentage(double variancePrecentage) {
        this.variancePrecentage = variancePrecentage;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "VarienceResult{" +
                "AcctNum='" + AcctNum + '\'' +
                ", AcctDescription='" + AcctDescription + '\'' +
                ", period='" + period + '\'' +
                ", actualMTD=" + actualMTD +
                ", budgetMTD=" + budgetMTD +
                ", varianceDifference=" + varianceDifference +
                ", variancePrecentage=" + variancePrecentage +
                ", comments='" + comments + '\'' +
                '}';
    }
}
