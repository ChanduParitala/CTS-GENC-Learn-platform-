package com.dao;

import java.util.*;

import com.exception.LoanException;
import com.model.Customer;

public class CustomerDAO {
	
	List<Customer> customerList = new ArrayList<>();
	
	public void addCustomer(Customer customerObj){
		customerList.add(customerObj);
	}
	
	public List<Customer> viewAllCustomer(){
		if(customerList.isEmpty()){
			return null;
		}
		return customerList;		
	}
	
	public boolean deleteCustomer(int customerId){
		//boolean flag=false;
		for(Customer c : customerList){
			if(c.getCustomerId()==customerId){
				customerList.remove(c);
				return true;
			}
		}
		return false;
	}
	
	public boolean validateCustomerID(int customerId){
		
		try {
			if(customerId>=1000 && customerId<=9999){
				return true;
			}
			else{
				throw new LoanException("Customer Id is invalid");
			}
		} catch (LoanException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
