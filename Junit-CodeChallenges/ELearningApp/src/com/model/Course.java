package com.model;

public class Course {

	public int courseId;
	private String courseName;
	private float fees;
	private int duration = 10;
	private String trainerIncharge;
	static final int MAXSTRENGTHPERMITTED = 100;
	static String academyName="Akshara Acadey";
	
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getTrainerIncharge() {
		return trainerIncharge;
	}
	public void setTrainerIncharge(String trainerIncharge) {
		this.trainerIncharge = trainerIncharge;
	}
	public static int getMaxstrengthpermitted() {
		return MAXSTRENGTHPERMITTED;
	}

}
