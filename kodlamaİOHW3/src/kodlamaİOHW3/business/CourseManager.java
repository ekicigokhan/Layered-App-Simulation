package kodlama›OHW3.business;

import java.util.ArrayList;

import kodlama›OHW3.core.logging.ILogger;
import kodlama›OHW3.dataAccess.CourseDao;
import kodlama›OHW3.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private ILogger[] loggers;
	private ArrayList<Course> courses;

	public CourseManager(CourseDao courseDao, ILogger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
		this.courses = courseDao.getCourseInfos();

	}

	private boolean isThereCourse(Course course) throws Exception { // boolean default olarak false gelir.
		for (Course inDbCourse : courses) {
			if (inDbCourse.getCourseName().equalsIgnoreCase(course.getCourseName()) || course.getCoursePrice() < 0) {
				throw new Exception("This course name defined anyway and course price cannot be less than 0 TL!");
			}
		}

		return true;

	}

	public void add(Course course) throws Exception {

		if (isThereCourse(course)) {
		
			courseDao.add(course);
		}

		for (ILogger iLogger : loggers) {
			iLogger.log(course.getCourseName());
		}
	}
}
