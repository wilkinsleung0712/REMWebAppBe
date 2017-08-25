package com.colliers.common.variance;

import java.util.List;

public class VarienceRequestParams {
    private List<String> buildingList;
    private String period;
    private String basis;
    private String finFormat;

    public VarienceRequestParams() {
    }

    public VarienceRequestParams(List<String> buildingList, String period, String basis, String finFormat) {
        this.buildingList = buildingList;
        this.period = period;
        this.basis = basis;
        this.finFormat = finFormat;
    }

    public List<String> getBuildingList() {
        return buildingList;
    }

    public void setBuildingList(List<String> buildingList) {
        this.buildingList = buildingList;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
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

    @Override
    public String toString() {
        return "VarienceRequestParams{" +
                "buildingList=" + buildingList +
                ", period='" + period + '\'' +
                ", basis='" + basis + '\'' +
                ", finFormat='" + finFormat + '\'' +
                '}';
    }
}
