package com.cts.unoadm.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import com.cts.unoadm.exception.StudentAdmissionException;
import com.cts.unoadm.vo.StudentAdmission;
import com.cts.unoadm.util.ApplicationUtil;
import com.cts.unoadm.dao.StudentAdmissionDAO;


public class StudentAdmissionService {
	
	/**
	 * @return List<StudentAdmission>
	 */
	public static List<StudentAdmission> buildStudentAdmissionsList(List<String> studentAdmissionRecords) {
		List<StudentAdmission> studentAdmissionList = new ArrayList<StudentAdmission>();
		
		//Code here
		for(String line:studentAdmissionRecords) {
			String[] words = line.split(",");
			String admissionId = words[0].trim();
			String studentCode = words[1].trim();
			Date dateOfCounseling = ApplicationUtil.convertStringToDate(words[2].trim());
			String departmentName = words[3].trim();
			Date dateOfAdmission = ApplicationUtil.convertStringToDate(words[4].trim());
			String preferCollegeHostel = words[5].trim();
			String firstGraduate = words[6].trim();
			String managerApproval = words[7].trim();
			double[] fees = calculateTotalCollegeFee(preferCollegeHostel, firstGraduate, departmentName);
			double admissionFee = fees[0];
			double tuitionFee = fees[1];
			double hostelFee = fees[2];
			double totalCollegeFee = fees[3];

			String finalStatusOfAdmission = "AdmissionSuccessfull";
			StudentAdmission stdObj = new StudentAdmission(
					admissionId, 
					studentCode, 
					dateOfCounseling,
					departmentName,
					dateOfAdmission, 
					preferCollegeHostel, 
					firstGraduate, 
					managerApproval,
					admissionFee, 
					tuitionFee, 
					hostelFee, 
					totalCollegeFee,
					finalStatusOfAdmission
				);
			studentAdmissionList.add(stdObj);
		}
		return studentAdmissionList;
	}


	public boolean addStudentAdmissionDetails(String inputFeed) throws StudentAdmissionException {
		
		//Code here
		List<String> parsedRecords = ApplicationUtil.readFile(inputFeed);
		List<StudentAdmission> studentAdmissionRecords = StudentAdmissionService.buildStudentAdmissionsList(parsedRecords); 
		//StudentAdmissionDAO s=new StudentAdmissionDAO();
		return new StudentAdmissionDAO().addStudentAdmissionDetails(studentAdmissionRecords);
	}


	public static double[] calculateTotalCollegeFee(String preferCollegeHostel, String firstGraduate, String departmentName) {
		double[] studentAdmissionCosts = new double[4];

		//Code here..
		studentAdmissionCosts[0] = 30000d;
		studentAdmissionCosts[1] = 0d;
		studentAdmissionCosts[2] = 0d;
		studentAdmissionCosts[3] = 0d;
		if(departmentName.equalsIgnoreCase("EEE") || departmentName.equalsIgnoreCase("CSE") || departmentName.equalsIgnoreCase("IT")) {
			studentAdmissionCosts[1] = 45000d;
		} else if(departmentName.equalsIgnoreCase("ECE") || departmentName.equalsIgnoreCase("CIVIL")) {
			studentAdmissionCosts[1] = 50000d;
		} else if(departmentName.equalsIgnoreCase("MECH")) {
			studentAdmissionCosts[1] = 55000d;
		}

		if(preferCollegeHostel.equalsIgnoreCase("YES")) {
			studentAdmissionCosts[2] = 75000d;
		}

		studentAdmissionCosts[3] = studentAdmissionCosts[0] + studentAdmissionCosts[1] + studentAdmissionCosts[2];

		if(firstGraduate.equalsIgnoreCase("YES")) {
			studentAdmissionCosts[3] -= 20000d;
		}
		
		return studentAdmissionCosts;
	}

	public boolean searchStudentAdmission(String admissionId) throws StudentAdmissionException {
		boolean status = false;
		
		//Code here..
		List<StudentAdmission> fetchedAdmissions = new StudentAdmissionDAO().getAllStudentAdmissionDetails();

		for(StudentAdmission stdAdm:fetchedAdmissions) {
			if(stdAdm.getAdmissionId().equalsIgnoreCase(admissionId)) {
				status = true;
				System.out.println(stdAdm.toString());
			}
		}
		
		return status;
	}
}


	
