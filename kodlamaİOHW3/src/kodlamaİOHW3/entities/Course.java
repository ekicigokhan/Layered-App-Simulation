package kodlama›OHW3.entities;

public class Course {
	private String courseName;
	private double coursePrice;

	public Course(String courseName, double coursePrice) {
		
		this.courseName = courseName;
		this.coursePrice = coursePrice;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public double getCoursePrice() {
		return coursePrice;
	}

	public void setCoursePrice(int coursePrice) {
		this.coursePrice = coursePrice;
	}
	
	
	
	
}
