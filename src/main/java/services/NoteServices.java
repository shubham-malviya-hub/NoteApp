package services;

import java.util.List;

import beans.Note;

public interface NoteServices {
	public Note createNote(Note note);
	public Note updateNote(Note note);
	public List<Note> getAllNotes();
	public Note deleteNote(Note note);
}
