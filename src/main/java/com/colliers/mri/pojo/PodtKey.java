package com.colliers.mri.pojo;

public class PodtKey {
    private String ponum;

    private Short linenmbr;

    public String getPonum() {
        return ponum;
    }

    public void setPonum(String ponum) {
        this.ponum = ponum == null ? null : ponum.trim();
    }

    public Short getLinenmbr() {
        return linenmbr;
    }

    public void setLinenmbr(Short linenmbr) {
        this.linenmbr = linenmbr;
    }
}