package com.dao;

import java.util.ArrayList;
import java.util.List;

import com.model.Payment;

public class PaymentDAO {
	
	private List<Payment> paymentList = new  ArrayList<>();
	
	//private CustomerDAO custDAO;


	public void setPaymentList(List<Payment> paymentList ) {
		this.paymentList= paymentList;
	}
	
	public List<Payment> getPaymentList() {
		return paymentList;
	}

    public void makePayment(Payment obj){
    	paymentList.add(obj);
    }
	
    /*public void updatePayment(int paymentId,double amount){
    	
    } */  
    
}
