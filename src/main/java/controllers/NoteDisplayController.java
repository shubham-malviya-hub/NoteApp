/**
 * 
 */
package controllers;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import beans.Note;
import services.NoteServiceImpl;
import services.NoteServices;

/**
 * @author Shubham
 *
 */
@Controller
public class NoteDisplayController {
	
	@RequestMapping(method = RequestMethod.GET, value="/allnotes")
	@ResponseBody
	public List<Note> getAllNotes(){
		NoteServices noteServiceObj = new NoteServiceImpl();
		List<Note>noteList = noteServiceObj.getAllNotes();
		if(noteList != null) {
			
		} else {
			
		}
		return null;
	}
}
