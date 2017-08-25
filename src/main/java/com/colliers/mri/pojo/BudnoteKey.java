package com.colliers.mri.pojo;

public class BudnoteKey {
    private String acctnum;

    private String entityid;

    private String budtype;

    private String endpd;

    private String basis;

    private String notetype;

    private String department;

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

    public String getBudtype() {
        return budtype;
    }

    public void setBudtype(String budtype) {
        this.budtype = budtype == null ? null : budtype.trim();
    }

    public String getEndpd() {
        return endpd;
    }

    public void setEndpd(String endpd) {
        this.endpd = endpd == null ? null : endpd.trim();
    }

    public String getBasis() {
        return basis;
    }

    public void setBasis(String basis) {
        this.basis = basis == null ? null : basis.trim();
    }

    public String getNotetype() {
        return notetype;
    }

    public void setNotetype(String notetype) {
        this.notetype = notetype == null ? null : notetype.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }
}