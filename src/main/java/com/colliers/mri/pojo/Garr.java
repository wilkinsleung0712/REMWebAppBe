package com.colliers.mri.pojo;

public class Garr extends GarrKey {
    private String endacct;

    public String getEndacct() {
        return endacct;
    }

    public void setEndacct(String endacct) {
        this.endacct = endacct == null ? null : endacct.trim();
    }
}