package com.colliers.mri.pojo;

import java.math.BigDecimal;

public class Glsum extends GlsumKey {
    private BigDecimal activity;

    public BigDecimal getActivity() {
        return activity;
    }

    public void setActivity(BigDecimal activity) {
        this.activity = activity;
    }
}