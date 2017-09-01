package com.colliers.common.type;

public enum NOTE_TYPE {
    V("Variance", "V"),
    B("Budget", "B");

    private String description;
    private String noteTypeCode;

    NOTE_TYPE(String description, String noteTypeCode) {
        this.description = description;
        this.noteTypeCode = noteTypeCode;
    }

    public String getDescription() {
        return description;
    }

    public String getNoteTypeCode() {
        return noteTypeCode;
    }

    @Override
    public String toString() {
        return "NOTE_TYPE{" +
                "description='" + description + '\'' +
                ", noteTypeCode='" + noteTypeCode + '\'' +
                '}';
    }
}
