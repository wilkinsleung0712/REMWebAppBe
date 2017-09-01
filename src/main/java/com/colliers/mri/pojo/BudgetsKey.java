package com.colliers.mri.pojo;

public class BudgetsKey {
    private String acctnum;

    private String entityid;

    private String department;

    private String basis;

    private String budtype;

    private String endPeriod;

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

    public String getBudtype() {
        return budtype;
    }

    public void setBudtype(String budtype) {
        this.budtype = budtype == null ? null : budtype.trim();
    }

    public String getPeriod() {
        return endPeriod;
    }

    public void setPeriod(String endPeriod) {
        this.endPeriod = endPeriod == null ? null : endPeriod.trim();
    }
}