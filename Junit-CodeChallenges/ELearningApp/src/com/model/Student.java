package com.model;

public class Student {
	
	private String studentId;
	private String studentName;
	private String phoneNumber;
	private String emailId;
	
	public Student(String studentId, String studentName, String phoneNumber, String emailId) {		
		this.studentId = studentId;
		this.studentName = studentName;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
}
