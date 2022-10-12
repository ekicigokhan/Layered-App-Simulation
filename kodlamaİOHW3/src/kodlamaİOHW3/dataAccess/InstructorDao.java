package kodlama›OHW3.dataAccess;

import java.util.ArrayList;

import kodlama›OHW3.entities.Instructor;

public interface InstructorDao {
	void add(Instructor instructor);
	ArrayList<Instructor> getInstructors();
}
