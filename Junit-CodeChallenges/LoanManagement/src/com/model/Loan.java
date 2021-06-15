package com.model;

public class Loan {
	int loanNumber;
	String loanType ="Vehicle";
	Customer customer;
	double loanAmount;
	double balanceLoanAmount;
	//static final double maxLoanAmount=1500000;
	
	/*public Loan(){
		
	}*/	

	public Loan(int loanNumber, String loanType, Customer customer, double loanAmount) {
		this.loanNumber = loanNumber;
		this.loanType = loanType;
		this.customer = customer;
		this.loanAmount = loanAmount;
		balanceLoanAmount=loanAmount;
	}

	public int getLoanNumber() {
		return loanNumber;
	}

	public void setLoanNumber(int loanNumber) {
		this.loanNumber = loanNumber;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public double getBalanceLoanAmount() {
		return balanceLoanAmount;
	}

	public void setBalanceLoanAmount(double balanceLoanAmount) {
		this.balanceLoanAmount = balanceLoanAmount;
	}
	
	
	public boolean checkBalanceAmount(double amountPaid){
		//float gst=3;
		//double amount = balanceLoanAmount+balanceLoanAmount*gst/100;
		/*if(balanceLoanAmount >= amountPaid)
			return true;
		else
			return false;
		*/	
		return (balanceLoanAmount >= amountPaid);
	}
	
	

	
}
