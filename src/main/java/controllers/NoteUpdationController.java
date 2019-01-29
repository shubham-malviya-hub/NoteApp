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
public class NoteUpdationController {
	@RequestMapping(method = RequestMethod.PUT, value="/editnote")
	@ResponseBody
	public String updateNote(@RequestBody Note note) {
		NoteServices noteServiceObj = new NoteServiceImpl();
		note=noteServiceObj.updateNote(note);
		if(note != null) {
			
		} else {
			
		}
		return null;
	}
}
