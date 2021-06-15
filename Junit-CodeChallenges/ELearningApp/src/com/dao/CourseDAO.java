package com.dao;

import java.util.ArrayList;
import java.util.List;

import com.exception.InvalidCourseException;
import com.model.Course;

public class CourseDAO {
	
	List<Course> courseList = new ArrayList<>();
	
	public void addCourse(Course courseObj){
		courseList.add(courseObj);
	}
	
	public List<Course> viewCourseByFees(float fees) throws InvalidCourseException {
		List<Course> temp=new ArrayList<>();
		for(Course c : courseList){
			if(c.getFees()>=fees)
		{
		    temp.add(c);
		}
		}
		if(temp==null) //to check of the size of the list is 0
		{
			throw new InvalidCourseException("No course with fees greater than "+fees);
		}
		else
		{
			return temp;
		}
	}

}
