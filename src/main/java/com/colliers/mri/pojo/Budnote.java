package com.colliers.mri.pojo;

import java.util.Date;

public class Budnote extends BudnoteKey {
    private String begpd;

    private Date lastdate;

    private String userid;

    private String recuserid;

    private String notetext;

    public String getBegpd() {
        return begpd;
    }

    public void setBegpd(String begpd) {
        this.begpd = begpd == null ? null : begpd.trim();
    }

    public Date getLastdate() {
        return lastdate;
    }

    public void setLastdate(Date lastdate) {
        this.lastdate = lastdate;
    }

    public String getUserid() {
        return userid.toUpperCase();
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getRecuserid() {
        return recuserid;
    }

    public void setRecuserid(String recuserid) {
        this.recuserid = recuserid == null ? null : recuserid.trim();
    }

    public String getNotetext() {
        return notetext;
    }

    public void setNotetext(String notetext) {
        this.notetext = notetext == null ? null : notetext.trim();
    }
}