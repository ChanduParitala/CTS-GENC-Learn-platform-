

package com.cts.unoadm.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.cts.unoadm.exception.StudentAdmissionException;
import com.cts.unoadm.vo.StudentAdmission;
import com.cts.unoadm.util.ApplicationUtil;
import com.cts.unoadm.util.DBConnectionManager;


public class StudentAdmissionDAO {
		
		@SuppressWarnings("finally")
		public boolean addStudentAdmissionDetails(List<StudentAdmission> stdAdmissions) throws StudentAdmissionException {
		boolean recordsAdded = false;
		//code here
		try(Connection con = DBConnectionManager.getInstance().getConnection()) {
			for(StudentAdmission stdAdmObj:stdAdmissions) {
				String sql = "INSERT INTO `students` VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?);";
				PreparedStatement prepState = con.prepareStatement(sql);
				prepState.setString(1, stdAdmObj.getAdmissionId());
				
				prepState.setString(2, stdAdmObj.getStudentCode());
				prepState.setDate(3, ApplicationUtil.convertUtilToSqlDate(stdAdmObj.getDateOfCounseling()));
				prepState.setString(4, stdAdmObj.getDepartmentName());
				prepState.setDate(5, ApplicationUtil.convertUtilToSqlDate(stdAdmObj.getDateOfAdmission()));
				prepState.setString(6, stdAdmObj.getPreferCollegeHostel());
				prepState.setString(7, stdAdmObj.getFirstGraduate());
				prepState.setString(8, stdAdmObj.getManagerApproval());
				prepState.setFloat(9, (float)stdAdmObj.getAdmissionFee());
				prepState.setFloat(10, (float)stdAdmObj.getTuitionFee());
				prepState.setFloat(11, (float)stdAdmObj.getHostelFee());
				prepState.setFloat(12, (float)stdAdmObj.getTotalCollegeFee());
				prepState.setString(13, stdAdmObj.getFinalStatusOfAdmission());
				prepState.execute();
			}
			recordsAdded = true;
		} catch(SQLException e) {
		
			throw new StudentAdmissionException(e.getMessage(), e.getCause());
		} finally {
			
			return recordsAdded;
		} 
	}


	@SuppressWarnings("finally")
	public List<StudentAdmission> getAllStudentAdmissionDetails() throws StudentAdmissionException {
		
		List<StudentAdmission> stdAdmissions = new ArrayList<StudentAdmission>();

		//code here
		try(Connection con = DBConnectionManager.getInstance().getConnection()) {
			String sql = "SELECT * FROM `students`";
			PreparedStatement prepState = con.prepareStatement(sql);
			ResultSet resSet = prepState.executeQuery();
			while(resSet.next()) {
				String admissionId = resSet.getString(1);
				String studentCode = resSet.getString(2);
				Date dateOfCounseling = ApplicationUtil.convertStringToDate(resSet.getString(3));
				String departmentName = resSet.getString(4);
				Date dateOfAdmission = ApplicationUtil.convertStringToDate(resSet.getString(5));
				String preferCollegeHostel = resSet.getString(6);
				String firstGraduate = resSet.getString(7);
				String managerApproval = resSet.getString(8);
				double admissionFee = resSet.getDouble(9);
				double tuitionFee = resSet.getDouble(10);
				double hostelFee = resSet.getDouble(11);
				double totalCollegeFee = resSet.getDouble(12);
				String finalStatusOfAdmission = resSet.getString(13);
				StudentAdmission stdAdmObj = new StudentAdmission(admissionId, studentCode, dateOfCounseling, departmentName, dateOfAdmission, preferCollegeHostel, firstGraduate, managerApproval, admissionFee, tuitionFee, hostelFee, totalCollegeFee,finalStatusOfAdmission);
				stdAdmissions.add(stdAdmObj);
			}
			resSet.close();
		} catch(SQLException e) {
			throw new StudentAdmissionException(e.getMessage(), e.getCause());
		} finally {
			return stdAdmissions;
		}

	}
}
