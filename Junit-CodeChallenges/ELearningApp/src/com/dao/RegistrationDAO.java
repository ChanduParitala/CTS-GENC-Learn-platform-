package com.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.model.Course;
import com.model.Registration;
import com.model.Student;

public class RegistrationDAO {
	
	List<Registration> regList = new ArrayList<>();
	
	public void registerStudentToCourse(Student student,Course course,LocalDate dor){
		
		Registration r = new Registration(student,course,dor,'X');
		
		int count=0;
		
		for(Registration reg : regList)
		{
			if(reg.getCourseObj().courseId==course.courseId)
			{
			    count++;
			}
		}
		if(course.getMaxstrengthpermitted()>count)
		{
			regList.add(r);		
		}
	
	}

}
