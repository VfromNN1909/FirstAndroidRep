package com.vladimirvlasoff.notes;

public class NoteData {

    private String noteName;
    private String noteText;

    public NoteData(String noteName, String noteText) {
        this.noteName = noteName;
        this.noteText = noteText;
    }

    public String getNoteName() {
        return noteName;
    }

    public String getNoteText() {
        return noteText;
    }


    public void setNoteName(String noteName) {
        this.noteName = noteName;
    }

    public void setNoteText(String noteText) {
        this.noteText = noteText;
    }
}
