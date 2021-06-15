package com.model;

public class Customer {
    int customerId;
    String customerName;
    String address;
    String panNumber;

    public Customer(int customerId, String customerName, String address, String panNumber) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.address = address;
        this.panNumber = panNumber;
    }

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

}
