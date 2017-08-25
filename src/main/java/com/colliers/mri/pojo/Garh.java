package com.colliers.mri.pojo;

import java.util.Date;

public class Garh extends GarhKey {
    private String descrptn;

    private Date lastdate;

    private String userid;

    public String getDescrptn() {
        return descrptn;
    }

    public void setDescrptn(String descrptn) {
        this.descrptn = descrptn == null ? null : descrptn.trim();
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
}