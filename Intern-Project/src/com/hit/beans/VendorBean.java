package com.hit.beans;

import java.time.LocalDate;
import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class VendorBean {

	
	@NotEmpty(message="First name is required")
	@Pattern(regexp="[A-Za-z]{3,15}",message="First name length should be between 3 to 15 character")
	private String firstname;
	
	@NotEmpty(message="Last name is required")
	@Pattern(regexp="[A-Za-z]{3,15}",message="Last name length should be between 3 to 15 character")
	private String lastname;
	

	private String dob;
	
	private String gender;
	private String email;
	
	@Pattern(regexp="[7-9]{1}[0-9]{9}",message="Mobile number should be 10 digits and starting with digit 7/8/9")
	private String contact;
	private String category;
	@Pattern(regexp="^(?=.*[0-9])(?=.*[A-Za-z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{6,20}$",message="Password should be of min 6 digits and should contain one number and one special character")
	private String password;
	private String id;
	
	
	
	
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public VendorBean(
			@NotEmpty(message = "First name is required") @Pattern(regexp = "[A-Za-z]{3,15}", message = "First name length should be between 3 to 15 character") String firstname,
			@NotEmpty(message = "Last name is required") @Pattern(regexp = "[A-Za-z]{3,15}", message = "Last name length should be between 3 to 15 character") String lastname,
			String dob, String gender, String email,
			@Pattern(regexp = "[7-9]{1}[0-9]{9}", message = "Mobile number should be 10 digits and starting with digit 7/8/9") String contact,
			String category,
			@Pattern(regexp = "^(?=.*[0-9])(?=.*[A-Za-z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{6,20}$", message = "Password should be of min 6 digits and should contain one number and one special character") String password,
			String id) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.dob = dob;
		this.gender = gender;
		this.email=email;
		this.contact = contact;
		this.category = category;
		this.password = password;
		this.id = id;
	}
	public VendorBean() {}
	

}
