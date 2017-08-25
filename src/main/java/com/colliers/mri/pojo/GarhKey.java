package com.colliers.mri.pojo;

public class GarhKey {
    private String groupid;

    private String ledgcode;

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
}