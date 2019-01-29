/**
 * 
 */
package controllers;

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
public class NoteDeleteController {
	@RequestMapping(method = RequestMethod.DELETE, value="/deletenote")
	@ResponseBody
	public String deleteNote(@RequestBody Note note) {
		NoteServices noteServiceObj = new NoteServiceImpl();
		note=noteServiceObj.deleteNote(note);;
		if(note != null) {
			
		} else {
			
		}
		return null;
	}
}
