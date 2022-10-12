package kodlama�OHW3.dataAccess;

import java.util.ArrayList;

import kodlama�OHW3.entities.Course;

public class HibernateCourseDao implements CourseDao {
	@Override
	public void add(Course course) {
		System.out.println("Kurs H�BERNATE veritaban�na eklendi : " + course.getCourseName()+ " Kurs fiyat� : "+course.getCoursePrice() );
		
	}
	
	@Override
	public ArrayList<Course> getCourseInfos() {
		ArrayList<Course> courses = new ArrayList<>();
		courses.add(new Course("Python",-10));
		courses.add(new Course("Java",200));
		courses.add(new Course("C++",300));
		courses.add(new Course("C#",400));
		return courses;
	}
}
