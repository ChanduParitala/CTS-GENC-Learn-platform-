package com.model;

import java.time.LocalDate;

public class Payment {
	
	int paymentId;
	LocalDate dateOfPayment;
	Loan loanObj;
	double amount;
	String paymentMode;
	static final float GSTPERCENTAGE=2;
	
	public Payment(int paymentId, LocalDate dateOfPayment, Loan loanObj, double amount, String paymentMode) {
	
		this.paymentId = paymentId;
		this.dateOfPayment = dateOfPayment;
		this.loanObj = loanObj;
		this.amount = amount;
		this.paymentMode = paymentMode;
	}

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public LocalDate getDateOfPayment() {
		return dateOfPayment;
	}

	public void setDateOfPayment(LocalDate dateOfPayment) {
		this.dateOfPayment = dateOfPayment;
	}

	public Loan getLoanObj() {
		return loanObj;
	}

	public void setLoanObj(Loan loanObj) {
		this.loanObj = loanObj;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public static float getGstpercentage() {
		return GSTPERCENTAGE;
	}
	


}
