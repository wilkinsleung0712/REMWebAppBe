package com.colliers.mri.pojo;

import java.util.Date;

public class Gacc {
    private String acctnum;

    private String acctname;

    private String type;

    private Date lastdate;

    private String userid;

    private String m1099acct;

    private String dprstr;

    private String pexchtype;

    private String ownertax;

    private String subwith;

    private String acctbasis;

    private String legalacct;

    public String getAcctnum() {
        return acctnum;
    }

    public void setAcctnum(String acctnum) {
        this.acctnum = acctnum == null ? null : acctnum.trim();
    }

    public String getAcctname() {
        return acctname;
    }

    public void setAcctname(String acctname) {
        this.acctname = acctname == null ? null : acctname.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Date getLastdate() {
        return lastdate;
    }

    public void setLastdate(Date lastdate) {
        this.lastdate = lastdate;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getM1099acct() {
        return m1099acct;
    }

    public void setM1099acct(String m1099acct) {
        this.m1099acct = m1099acct == null ? null : m1099acct.trim();
    }

    public String getDprstr() {
        return dprstr;
    }

    public void setDprstr(String dprstr) {
        this.dprstr = dprstr == null ? null : dprstr.trim();
    }

    public String getPexchtype() {
        return pexchtype;
    }

    public void setPexchtype(String pexchtype) {
        this.pexchtype = pexchtype == null ? null : pexchtype.trim();
    }

    public String getOwnertax() {
        return ownertax;
    }

    public void setOwnertax(String ownertax) {
        this.ownertax = ownertax == null ? null : ownertax.trim();
    }

    public String getSubwith() {
        return subwith;
    }

    public void setSubwith(String subwith) {
        this.subwith = subwith == null ? null : subwith.trim();
    }

    public String getAcctbasis() {
        return acctbasis;
    }

    public void setAcctbasis(String acctbasis) {
        this.acctbasis = acctbasis == null ? null : acctbasis.trim();
    }

    public String getLegalacct() {
        return legalacct;
    }

    public void setLegalacct(String legalacct) {
        this.legalacct = legalacct == null ? null : legalacct.trim();
    }
}