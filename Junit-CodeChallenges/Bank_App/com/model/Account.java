package com.model;

public class Account {
    int accountNumber;
    String accountType = "Savings";
    Customer customer;
    double balance;
    static final float MINIMUMBALANCE = 5000;
    static final float TRANSACTIONCHARGES = 150;

    public Account(int accountNumber, String accountType, Customer customer, double balance) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.customer = customer;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static float getMinimumbalance() {
        return MINIMUMBALANCE;
    }

    public static float getTransactioncharges() {
        return TRANSACTIONCHARGES;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }

    public boolean checkBalance(double amount) {
        return (balance - amount > MINIMUMBALANCE);
    }

}
