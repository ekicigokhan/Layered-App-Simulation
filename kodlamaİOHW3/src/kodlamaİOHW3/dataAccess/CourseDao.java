package kodlama›OHW3.dataAccess;

import java.util.ArrayList;

import kodlama›OHW3.entities.Course;

public interface CourseDao {
	void add(Course course);
	ArrayList<Course> getCourseInfos();  
}
