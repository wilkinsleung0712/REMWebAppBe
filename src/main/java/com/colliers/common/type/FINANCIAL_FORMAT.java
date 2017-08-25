package com.colliers.common.type;

public enum FINANCIAL_FORMAT {
    CI_DETACC("CI200100", "CI220000");

    private String beginAcctCode;
    private String endAcctCode;

    private String beginAcctCodeNumberic;
    private String endAcctCodeNumberic;

    FINANCIAL_FORMAT(String beginAcctCode, String endAcctCode) {
        this.beginAcctCode = beginAcctCode;
        this.endAcctCode = endAcctCode;
        this.beginAcctCodeNumberic = this.beginAcctCode.substring(2);
        this.endAcctCodeNumberic = this.endAcctCode.substring(2);
    }

    public String getBeginAcctCode() {
        return beginAcctCode;
    }

    public String getEndAcctCode() {
        return endAcctCode;
    }

    public String getBeginAcctCodeNumberic() {
        return beginAcctCodeNumberic;
    }

    public String getEndAcctCodeNumberic() {
        return endAcctCodeNumberic;
    }
}
