package com.dao;

import java.util.*;

import com.model.Customer;

public class CustomerDAO {

    List<Customer> customerList = new ArrayList<>();

    public void addCustomer(Customer customer) {
        customerList.add(customer);
    }

    public List<Customer> viewAllCustomer() {
        /*List<Customer> temp = new ArrayList<>();
        
        for(Customer custObj : customerList)
        {
            temp.add(custObj);
        }
        */
        if (customerList.isEmpty()) {
            return null;
        }
        //return temp;
    }

}
