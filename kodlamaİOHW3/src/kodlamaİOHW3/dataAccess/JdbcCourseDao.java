package kodlamaİOHW3.dataAccess;

import java.util.ArrayList;

import kodlamaİOHW3.entities.Course;

public class JdbcCourseDao implements CourseDao {
	@Override
	public void add(Course course) {
		System.out.println("Kurs JDBC veritabanına eklendi : " + course.getCourseName() + " Kurs fiyatı : " + course.getCoursePrice());

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
