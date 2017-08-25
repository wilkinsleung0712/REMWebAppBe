package com.colliers.common.type;

public enum BASIS {
    A("Accrual","A"),
    C("Cash","C");

    private String description;
    private String basisCode;

    BASIS(String description, String basisCode) {
        this.description = description;
        this.basisCode = basisCode;
    }

    public String getDescription() {
        return description;
    }

    public String getBasisCode() {
        return basisCode;
    }

    @Override
    public String toString() {
        return "BASIS{" +
                "description='" + description + '\'' +
                ", basisCode='" + basisCode + '\'' +
                '}';
    }
}
