package com.colliers.mri.pojo;

public class PohdWithBLOBs extends Pohd {
    private String addldesc;

    private String voidcomm;

    private String comments;

    public String getAddldesc() {
        return addldesc;
    }

    public void setAddldesc(String addldesc) {
        this.addldesc = addldesc == null ? null : addldesc.trim();
    }

    public String getVoidcomm() {
        return voidcomm;
    }

    public void setVoidcomm(String voidcomm) {
        this.voidcomm = voidcomm == null ? null : voidcomm.trim();
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }
}