package com.dao;

import java.util.List;

import com.exception.InvalidCourseException;
import com.exception.InvalidStudentException;
import com.model.Course;
import com.model.Student;

public class Academy {

	final StudentDAO studentDAO=new StudentDAO();
	final CourseDAO courseDAO = new CourseDAO();
	
	public void addStudent(Student studentObj){
		studentDAO.addStudent(studentObj);
	}
	
	public Student viewStudentById(int studentid) throws InvalidStudentException{
		return studentDAO.viewStudentById(studentid);
	}
	
	public void addCourse(Course courseObj){
		courseDAO.addCourse(courseObj);
	}
	
	public List<Course> viewCourseByFees(float fees) throws InvalidCourseException {
		return courseDAO.viewCourseByFees(fees);
	}
	
	
}
