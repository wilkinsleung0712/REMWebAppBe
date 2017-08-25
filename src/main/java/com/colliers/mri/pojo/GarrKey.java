package com.colliers.mri.pojo;

public class GarrKey {
    private String groupid;

    private String ledgcode;

    private String begacct;

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid == null ? null : groupid.trim();
    }

    public String getLedgcode() {
        return ledgcode;
    }

    public void setLedgcode(String ledgcode) {
        this.ledgcode = ledgcode == null ? null : ledgcode.trim();
    }

    public String getBegacct() {
        return begacct;
    }

    public void setBegacct(String begacct) {
        this.begacct = begacct == null ? null : begacct.trim();
    }
}