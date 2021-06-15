package com.dao;

import java.util.ArrayList;
import java.util.List;

import com.exception.InvalidStudentException;
import com.model.Student;

public class StudentDAO {

	List<Student> studentList = new ArrayList<>();
	
	public void addStudent(Student studentObj)
	{
		studentList.add(studentObj);
	}
	
	public Student viewStudentById(int studentid) throws InvalidStudentException{
		if(studentList.isEmpty())
		{
			throw new InvalidStudentException("Student list is empty");
		}
		else
		{
			for(Student s : studentList)
			{
				if(s.getStudentId().equals(studentid))
				{
				    return s;
				}
			}
		}
		return null;
	}
}
