package com.leuenroo.persistentdata.DB;



public class Note {
    private long id;
    private String note;
    private String date;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String nt) {
        this.note = nt;
    }

    // Will be used by the ArrayAdapter in the ListView
    @Override
    public String toString() {
        return note;
    }
}