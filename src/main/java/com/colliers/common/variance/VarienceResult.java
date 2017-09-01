package com.colliers.common.variance;

import com.colliers.common.type.NOTE_TYPE;

public class VarienceResult {
    private String AcctNum;
    private String AcctDescription;
    private String endPeriod;
    private double actualMTD;
    private double budgetMTD;
    private double varianceDifference;
    private double variancePrecentage;
    private String comments;
    private String noteType;

    public VarienceResult() {
    }

    public VarienceResult(String acctNum, String acctDescription, String endPeriod, double actualMTD, double budgetMTD, double varianceDifference, double variancePrecentage, String comments, String noteType) {
        AcctNum = acctNum;
        AcctDescription = acctDescription;
        this.endPeriod = endPeriod;
        this.actualMTD = actualMTD;
        this.budgetMTD = budgetMTD;
        this.varianceDifference = varianceDifference;
        this.variancePrecentage = variancePrecentage;
        this.comments = comments;
        this.noteType = noteType;
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
        return endPeriod;
    }

    public void setPeriod(String endPeriod) {
        this.endPeriod = endPeriod;
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

    public String getEndPeriod() {
        return endPeriod;
    }

    public void setEndPeriod(String endPeriod) {
        this.endPeriod = endPeriod;
    }

    public String getNoteType() {
        return noteType;
    }

    public void setNoteType(String noteType) {
        this.noteType = noteType;
    }

    @Override
    public String toString() {
        return "VarienceResult{" +
                "AcctNum='" + AcctNum + '\'' +
                ", AcctDescription='" + AcctDescription + '\'' +
                ", endPeriod='" + endPeriod + '\'' +
                ", actualMTD=" + actualMTD +
                ", budgetMTD=" + budgetMTD +
                ", varianceDifference=" + varianceDifference +
                ", variancePrecentage=" + variancePrecentage +
                ", comments='" + comments + '\'' +
                ", noteType='" + noteType + '\'' +
                '}';
    }
}
