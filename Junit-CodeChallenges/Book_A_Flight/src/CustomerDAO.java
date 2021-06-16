package com.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
/*
import com.model.Flight;
import com.exception.InvalidCustomerException;
import com.model.Customer;
*/
public class CustomerDAO {
    List<Customer> customerList = new ArrayList<>();

    public void addCustmoer(Customer customer) {
        customerList.add(customer);
    }

    public Customer viewCustomerByUserName(String userName) {
        try {
            if (customerList.isEmpty()) {
                throw new InvalidCustomerException("User Name Invalid");
            } 
            else {
                for (Customer c : customerList) {
                    if (c.getUserName().equals(userName))
                        return c;
                }
            }
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public boolean validateCustomer(String userName, String password) {
        for (Customer c : customerList) {
            if (c.getUserName().equals(userName) && c.getPassword().equals(password))
                return true;
        }
        return false;
    }
    
}
