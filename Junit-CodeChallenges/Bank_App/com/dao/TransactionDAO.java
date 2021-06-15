package com.dao;

import com.model.Transaction;
import java.util.List;
import java.util.ArrayList; 

public class TransactionDAO {

    List<Transaction> transactionList = new ArrayList<Transaction>();

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    public void addTransaction(Transaction obj) {
        transactionList.add(obj);
    }

    public void removeObj(int transactionId) {
        transactionList.remove(transactionId);
    }
}
