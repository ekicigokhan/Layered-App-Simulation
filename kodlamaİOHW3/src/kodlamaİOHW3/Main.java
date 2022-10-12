package kodlama›OHW3;

import java.util.ArrayList;
import java.util.List;

import kodlama›OHW3.business.CategoryManager;
import kodlama›OHW3.business.CourseManager;
import kodlama›OHW3.business.InstructorManager;
import kodlama›OHW3.core.logging.DatabaseLogger;
import kodlama›OHW3.core.logging.FileLogger;
import kodlama›OHW3.core.logging.ILogger;
import kodlama›OHW3.core.logging.MailLogger;
import kodlama›OHW3.dataAccess.HibernateCategoryDao;
import kodlama›OHW3.dataAccess.HibernateCourseDao;
import kodlama›OHW3.dataAccess.HibernateInstructorDao;
import kodlama›OHW3.dataAccess.InstructorDao;
import kodlama›OHW3.dataAccess.JdbcCategoryDao;
import kodlama›OHW3.dataAccess.JdbcCourseDao;
import kodlama›OHW3.dataAccess.JdbcInstructorDao;
import kodlama›OHW3.entities.Category;
import kodlama›OHW3.entities.Course;
import kodlama›OHW3.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {

		// Category Manager
		ILogger[] loggerCategories = { new DatabaseLogger(), new MailLogger(), new FileLogger() };

		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggerCategories);

		categoryManager.add(new Category("Random New Category"));
		
		System.out.println("------------------------------------------------------");
		
		//categoryManager.add(new Category("JAVA")); HATA VERECEK OLAN KOD.

		// Course Manager
		ILogger[] loggerCourses = { new DatabaseLogger(), new MailLogger(), new FileLogger() };

		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggerCourses);

		courseManager.add(new Course("Random New Course", 100));
		
		System.out.println("------------------------------------------------------");
		
		//courseManager.add(new Course("Python", -10)); HATA VERECEK OLAN KOD.

		// Instructor Manager
		ILogger[] loggerInstructors = { new DatabaseLogger(), new MailLogger(), new FileLogger() };

		InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(), loggerInstructors);

		instructorManager.add(new Instructor("T¸m¸"));
		
		System.out.println("------------------------------------------------------");
		
		instructorManager.add(new Instructor("Engin Demiro"));

	}

}
