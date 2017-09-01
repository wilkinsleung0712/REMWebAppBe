package com.colliers.common.type;

public enum BUDTYPE {

    APP("APP"),
    FOR("FOR");

    private String description;

    BUDTYPE(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
