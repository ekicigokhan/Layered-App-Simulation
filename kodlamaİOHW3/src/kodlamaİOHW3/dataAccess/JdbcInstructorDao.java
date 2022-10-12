package kodlamaÝOHW3.dataAccess;

import java.util.ArrayList;

import kodlamaÝOHW3.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {
	@Override
	public void add(Instructor instructor) {
		System.out.println("Eðitmen JDBC veritabanýna eklendi : " + instructor.getInstructorName());

	}

	@Override
	public ArrayList<Instructor> getInstructors() {
		ArrayList<Instructor> instructors = new ArrayList<>();
		instructors.add(new Instructor("Tümü"));
		instructors.add(new Instructor("Engin Demiroð"));
		return instructors;
	}

}
