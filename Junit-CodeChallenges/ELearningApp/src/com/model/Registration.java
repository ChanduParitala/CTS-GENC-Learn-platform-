package com.model;

import java.time.LocalDate;

public class Registration {

	private Student studentObj;
	private Course courseObj;
	private LocalDate dateOfRegistration;
	private char grade;
	
	
	public Registration(Student studentObj, Course courseObj, LocalDate dateOfRegistration, char grade) {
		this.studentObj = studentObj;
		this.courseObj = courseObj;
		this.dateOfRegistration = dateOfRegistration;
		this.grade = grade;
	}

	public Student getStudentObj() {
		return studentObj;
	}

	public void setStudentObj(Student studentObj) {
		this.studentObj = studentObj;
	}

	public Course getCourseObj() {
		return courseObj;
	}

	public void setCourseObj(Course courseObj) {
		this.courseObj = courseObj;
	}

	public LocalDate getDateOfRegistration() {
		return dateOfRegistration;
	}

	public void setDateOfRegistration(LocalDate dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	public void calculateGrade(int mark){
		
		if(mark >= 90)
		{
			setGrade('O');
		}
		else if(mark >= 70)
		{
		    setGrade('A');
		}
		else
		{
			setGrade('B');		
		}
	}
}
