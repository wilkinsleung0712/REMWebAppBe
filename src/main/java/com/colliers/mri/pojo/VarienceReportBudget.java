package com.colliers.mri.pojo;

public class VarienceReportBudget extends Budgets {
    private String noteType;
    private String noteText;

    public VarienceReportBudget() {
        super();
    }

    public String getNoteText() {
        return noteText;
    }

    public void setNoteText(String noteText) {
        this.noteText = noteText;
    }

    public String getNoteType() {
        return noteType;
    }

    public void setNoteType(String noteType) {
        this.noteType = noteType;
    }
}
