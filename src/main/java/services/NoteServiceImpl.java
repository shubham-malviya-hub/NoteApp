package services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import beans.Note;
import repository.NoteRepository;

public class NoteServiceImpl implements NoteServices{
	private NoteRepository noteRepository;
	@Override
	public Note createNote(Note note) {
		try {
		    noteRepository.save(note);
		    return note;
		} catch(Exception e) {
			return null;
		}
		
	}

	@Override
	public Note updateNote(Note note) {
		try {
		    noteRepository.save(note);
		    return note;
		} catch(Exception e) {
			return null;
		}
	}

	@Override
	public List<Note> getAllNotes() {
		List<Note> listOfNotes = new ArrayList<Note>();
		listOfNotes=noteRepository.findAll();
		return listOfNotes;
	}

	@Override
	public Note deleteNote(Note note) {
		try {
		    noteRepository.delete(note);
		    return note;
		} catch(Exception e) {
			return null;
		}
		
	}
	
}
