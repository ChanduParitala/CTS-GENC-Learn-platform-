package com.cts.unoadm.util;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.stream.Stream;
import java.util.concurrent.TimeUnit;


import com.cts.unoadm.exception.StudentAdmissionException;

public class ApplicationUtil {

	/**
	 * @param fileName
	 * @return List<String>
	 * @throws StudentAdmissionException
	 */
	public static List<String> readFile(String fileName) throws StudentAdmissionException {
		List<String> studentAdmissionList = new ArrayList<String>();
		  //Code here..
		  	try(Stream<String> lines = Files.lines(Paths.get(fileName))) {
			lines.forEach((line)->
			{
				String[] words = line.split(",");
				Date dOC = ApplicationUtil.convertStringToDate(words[2].trim());
				Date dOA = ApplicationUtil.convertStringToDate(words[4].trim());
				if(ApplicationUtil.checkIfValidAdmission(dOC, dOA, words[7].trim()))
				  studentAdmissionList.add(line.trim());
			});
		} catch(IOException e) {
			throw new StudentAdmissionException(e.getMessage(), e.getCause());
		}
		
		return studentAdmissionList;
	}

		
	

	/**
	 * @param util
	 *            Date
	 * @return sql Date
	 */
	public static java.sql.Date convertUtilToSqlDate(java.util.Date uDate) {
		
		
		
		//Code here..
		
		return new java.sql.Date(uDate.getTime());

		
		//return sDate;
	}

	/**
	 * @param inDate
	 * @return Date
	 */
	public static Date convertStringToDate(String inDate) {
		
		//Code here..
		SimpleDateFormat sDf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = sDf.parse(inDate);
		} catch(ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	public static boolean checkIfValidAdmission(Date dtOfCounseling, Date dtOfAdmission, String manager) {
		boolean admissionValidity = false;

		// Code here..
		long diff = ((dtOfAdmission.getTime()-dtOfCounseling.getTime())/(1000*60*60*24));

	if(manager.equalsIgnoreCase("approved") && diff<=10)
	{
		
		admissionValidity=true;
	}

		return admissionValidity;
	}
}
