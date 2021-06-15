package com.model;

public class Customer {
	
	int customerId;
	String customerName;
	String address;
	String panNumber;
	String emailId;
	
	public Customer(int customerId, String customerName, String address, String panNumber,String emailId) {
		//String pan="";
		this.customerId = customerId;
		this.customerName = customerName;
		this.address = address;
		this.panNumber = panNumber;
		this.emailId = emailId;
	}
	
	/*public Customer() {
		
	}*/

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	 
}
