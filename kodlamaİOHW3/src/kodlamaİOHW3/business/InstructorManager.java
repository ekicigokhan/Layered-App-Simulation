package kodlama›OHW3.business;

import java.util.ArrayList;

import kodlama›OHW3.core.logging.ILogger;
import kodlama›OHW3.dataAccess.InstructorDao;
import kodlama›OHW3.entities.Instructor;

public class InstructorManager {

	private InstructorDao instructorDao;
	private ILogger[] loggers;
	private ArrayList<Instructor> instructors;

	public InstructorManager(InstructorDao instructorDao, ILogger[] loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
		this.instructors = instructorDao.getInstructors();
	}
	public void add(Instructor instructor) {
		
	instructorDao.add(instructor);
		
		for (ILogger iLogger : loggers) {
			iLogger.log(instructor.getInstructorName());	
		}
	}
}
