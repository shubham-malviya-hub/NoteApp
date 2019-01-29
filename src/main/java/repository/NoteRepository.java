/**
 * 
 */
package repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import beans.Note;
/**
 * @author Shubham
 *
 */
public interface NoteRepository extends CrudRepository<Note, Long>{
	public Note save(Note note);
	public List<Note> findAll();
	public void delete(Note note);
}
