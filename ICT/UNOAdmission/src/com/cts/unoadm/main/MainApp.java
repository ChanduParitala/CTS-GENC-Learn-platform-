package com.cts.unoadm.main;

import java.io.IOException;
import java.util.Scanner;

import com.cts.unoadm.skeletonvalidator.SkeletonValidator;
import com.cts.unoadm.service.StudentAdmissionService;
import com.cts.unoadm.exception.StudentAdmissionException;

public class MainApp {

	public static void main(String[] args) throws IOException {
		//Don't delete this code
		//Skeletonvalidaton starts
		new SkeletonValidator();
		//Skeletonvalidation ends

		//Write your code here..
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		//create an obj for stuentadmission service
		StudentAdmissionService stdAdmService = new StudentAdmissionService();
		try {

			  //insert working
			if(stdAdmService.addStudentAdmissionDetails("inputFeed.txt")) {
				System.out.println("Data has been inserted into database");
			} else {
				System.out.println("Database insertion failed");
			}
			//searching an ID
			System.out.print("Enter a admission Id to search status - ");
			String admissionId = sc.nextLine();
			//Searching working
			if(stdAdmService.searchStudentAdmission(admissionId)) {
				System.out.println("Student admission found");
			} else {
				System.out.println("Can't be found on database");
			}
		} catch(StudentAdmissionException e) {
			System.out.println(e.getMessage());
		}
	}

}

