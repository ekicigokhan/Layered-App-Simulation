package kodlama�OHW3.dataAccess;

import java.util.ArrayList;

import kodlama�OHW3.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {
	@Override
	public void add(Instructor instructor) {
		System.out.println("E�itmen H�BERNATE veritaban�na eklendi : " + instructor.getInstructorName());

	}

	@Override
	public ArrayList<Instructor> getInstructors() {
		ArrayList<Instructor> instructors = new ArrayList<>();
		instructors.add(new Instructor("T�m�"));
		instructors.add(new Instructor("Engin Demiro�"));
		return instructors;
	}
}
