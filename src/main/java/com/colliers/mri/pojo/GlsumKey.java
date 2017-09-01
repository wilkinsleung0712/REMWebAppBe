package com.colliers.mri.pojo;

public class GlsumKey {
    private String acctnum;

    private String entityid;

    private String department;

    private String basis;

    private String endPeriod;

    private String balfor;

    public String getAcctnum() {
        return acctnum;
    }

    public void setAcctnum(String acctnum) {
        this.acctnum = acctnum == null ? null : acctnum.trim();
    }

    public String getEntityid() {
        return entityid;
    }

    public void setEntityid(String entityid) {
        this.entityid = entityid == null ? null : entityid.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getBasis() {
        return basis;
    }

    public void setBasis(String basis) {
        this.basis = basis == null ? null : basis.trim();
    }

    public String getPeriod() {
        return endPeriod;
    }

    public void setPeriod(String endPeriod) {
        this.endPeriod = endPeriod == null ? null : endPeriod.trim();
    }

    public String getBalfor() {
        return balfor;
    }

    public void setBalfor(String balfor) {
        this.balfor = balfor == null ? null : balfor.trim();
    }
}