package com.dao;

import java.util.ArrayList;
import java.util.List;

//import com.model.Customer;
import com.model.Account;

//import java.io.IOException;

public class AccountDAO {
    List<Account> accountList = new ArrayList<>();

    public void addAccount(Account account) {
        accountList.add(account);
    }

    public Account viewAccountByAccountNumber(int accountNumber) {

        if (accountList.isEmpty()) {
            return null;
        } else {
            for (Account a : accountList) {
                if (a.getAccountNumber() == accountNumber) {
                    return a;
                }
            }
            return null;
        }
    }
}