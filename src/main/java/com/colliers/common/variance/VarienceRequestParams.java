package com.colliers.common.variance;

import org.apache.commons.lang3.StringUtils;

import java.util.List;

public class VarienceRequestParams {
    private List<String> buildingList;
    private String endPeriod;
    private String beginPeriod;
    private String basis;
    private String finFormat;
    private String budType;

    public VarienceRequestParams() {
    }

    public VarienceRequestParams(List<String> buildingList, String endPeriod, String beginPeriod, String basis, String finFormat,String budType) {
        this.buildingList = buildingList;
        this.endPeriod = endPeriod;
        this.beginPeriod = beginPeriod;
        this.basis = basis;
        this.finFormat = finFormat;
        this.budType = budType;
    }

    public VarienceRequestParams(List<String> buildingList, String endPeriod, String basis, String finFormat,String budType) {
        this.buildingList = buildingList;
        this.endPeriod = endPeriod;
        // if beginPeriod did not specify we will make it the same as endPeriod
        this.beginPeriod = endPeriod;
        this.basis = basis;
        this.finFormat = finFormat;
        this.budType = budType;
    }

    public List<String> getBuildingList() {
        return buildingList;
    }

    public void setBuildingList(List<String> buildingList) {
        this.buildingList = buildingList;
    }

    public String getPeriod() {
        return endPeriod;
    }

    public String getBeginPeriod() {
        return (StringUtils.isEmpty(this.beginPeriod)||StringUtils.isBlank(beginPeriod))? endPeriod:beginPeriod;
    }

    public void setBeginPeriod(String beginPeriod) {
        this.beginPeriod = beginPeriod;
    }

    public String getBasis() {
        return basis;
    }

    public void setBasis(String basis) {
        this.basis = basis;
    }

    public String getFinFormat() {
        return finFormat;
    }

    public void setFinFormat(String finFormat) {
        this.finFormat = finFormat;
    }

    public String getEndPeriod() {
        return endPeriod;
    }

    public void setEndPeriod(String endPeriod) {
        this.endPeriod = endPeriod;
    }

    public String getBudType() {
        return budType;
    }

    public void setBudType(String budType) {
        this.budType = budType;
    }

    @Override
    public String toString() {
        return "VarienceRequestParams{" +
                "buildingList=" + buildingList +
                ", endPeriod='" + endPeriod + '\'' +
                ", beginPeriod='" + beginPeriod + '\'' +
                ", basis='" + basis + '\'' +
                ", finFormat='" + finFormat + '\'' +
                '}';
    }
}
