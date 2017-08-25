package com.colliers.mri.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Budgets extends BudgetsKey {
    private BigDecimal activity;

    private Date lastdate;

    private String userid;

    private String locked;

    public BigDecimal getActivity() {
        return activity;
    }

    public void setActivity(BigDecimal activity) {
        this.activity = activity;
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

    public String getLocked() {
        return locked;
    }

    public void setLocked(String locked) {
        this.locked = locked == null ? null : locked.trim();
    }
}