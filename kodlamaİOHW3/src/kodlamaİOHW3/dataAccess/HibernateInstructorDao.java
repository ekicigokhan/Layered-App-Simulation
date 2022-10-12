package kodlamaÝOHW3.dataAccess;

import java.util.ArrayList;

import kodlamaÝOHW3.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {
	@Override
	public void add(Instructor instructor) {
		System.out.println("Eðitmen HÝBERNATE veritabanýna eklendi : " + instructor.getInstructorName());

	}

	@Override
	public ArrayList<Instructor> getInstructors() {
		ArrayList<Instructor> instructors = new ArrayList<>();
		instructors.add(new Instructor("Tümü"));
		instructors.add(new Instructor("Engin Demiroð"));
		return instructors;
	}
}
