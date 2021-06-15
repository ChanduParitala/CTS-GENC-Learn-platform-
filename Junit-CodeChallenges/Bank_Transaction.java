//package com.bank.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runners.MethodSorters;

import com.bank.exception.InvalidTransactionException;
import com.bank.model.Transaction;
import com.bank.util.Bank;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BankTest {
 @Rule
 public ExpectedException exceptionRule = ExpectedException.none();
 private static List<Transaction> transactionList = new ArrayList<Transaction>();
 private static Bank bankObj;
 private static Transaction trans1;
 private static Transaction trans2;
 private static Transaction trans3;
 private static Transaction trans4;
 
 @BeforeClass
 public static void setUp() throws Exception {
    
  bankObj = new Bank();
  
  //Create few Transaction objects and add to transactionList.
  //Use that list to test all the methods in Bank class that requires a list of transaction 
  trans2= new Transaction(101,new SimpleDateFormat("dd/MM/yyyy").parse("12/03/1999"),"10586465332566","Credit",6000);
  trans3= new Transaction(102,new SimpleDateFormat("dd/MM/yyyy").parse("12/03/1999"),"10586465332566","Debit",6000);
  trans4= new Transaction(103,new SimpleDateFormat("dd/MM/yyyy").parse("1/03/1999"),"10586465332567","Debit",6000);
 }
 
 //Test the validateTransactionType method when the value is Credit
 @Test
 public void test11ValidateTransactionTypeWhenCredit() throws InvalidTransactionException{
  //fill code here 
  assertTrue(bankObj.validateTransactionType("Credit"));
 }
 
 //Test the validateTransactionType method when the value is Debit
 @Test
 public void test12ValidateTransactionTypeWhenDebit() throws InvalidTransactionException {
  //fill code here
  assertTrue(bankObj.validateTransactionType("Debit"));
 }
 
 //Test the validateTransactionType method when the value is invalid
 @Test
 public void test13ValidateTransactionTypeWhenInvalid() throws InvalidTransactionException {
  //fill code here  
  exceptionRule.expect(InvalidTransactionException.class);
  exceptionRule.expectMessage("Transaction type is invalid");
  bankObj.validateTransactionType("deb");
 }
 
 //Test the viewTransaction method For Valid Id
 @Test
 public void test14ViewTransactionForValidId() throws InvalidTransactionException {
  //fill code here 
  List<Transaction> t=new ArrayList<>();
  t.add(trans2);
  t.add(trans3);
  assertEquals(trans2, (bankObj.viewTransaction(t,101)));
  
 }
 
 //Test the viewTransaction method For Invalid Id
 @Test
 public void test15ViewTransactionForInvalidId() throws InvalidTransactionException {
  //fill code her
  List<Transaction> t=new ArrayList<>();
  t.add(trans2);
  t.add(trans3);
  exceptionRule.expect(InvalidTransactionException.class);
  exceptionRule.expectMessage("Transaction ID is invalid");
  assertEquals(trans2,bankObj.viewTransaction(t, 105));
 }
 
 
 //Test the viewTransactionForAccount method 
 @Test
 public void test16ViewTransactionForAccount() throws InvalidTransactionException {
  //fill code here 
  List<Transaction> t=new ArrayList<>();
  t.add(trans2);
  t.add(trans3);
  t.add(trans4);
  List<Transaction> t1=new ArrayList<>();
  t1.add(trans2);
  t1.add(trans3);
  assertEquals(t1,bankObj.viewTransactionForAccount(t,"10586465332566") );
 }
 
 //Test the viewTransactionForAccount method when list is empty
 @Test
 public void test17ViewTransactionForAccountForEmptyList() throws InvalidTransactionException {
  //fill code here 
  List<Transaction> t=new ArrayList<Transaction>();
  exceptionRule.expect(InvalidTransactionException.class);
  exceptionRule.expectMessage("Transaction list is empty");
  assertEquals(t,bankObj.viewTransactionForAccount(t,"10586465332566"));
 }
 
//Test the viewTransactionAccountwise method 
 @Test
 public void test18ViewTransactionAccountwise() throws InvalidTransactionException {
  //fill code here 
  Map<String,List<Transaction>> result = new LinkedHashMap<>();
  List<Transaction> t2=new ArrayList<>();
  t2.add(trans2);
  t2.add(trans3);
  t2.add(trans4);
  List<Transaction> t=new ArrayList<>();
  t.add(trans2);
  t.add(trans3);
  List<Transaction> t1=new ArrayList<>();
  t1.add(trans4);
  result.put("10586465332566", t);
  result.put("10586465332567", t1);
  assertEquals(result, bankObj.viewTransactionAccountwise(t2));
 
 
  
 }
 
 //Test the viewTransactionAccountwise method when list is empty
 @Test
 public void test19ViewTransactionAccountwiseForEmptyList() throws InvalidTransactionException {
  //fill code here
  Map<String,List<Transaction>> result = new LinkedHashMap<>();
  List<Transaction> t2=new ArrayList<>();
  exceptionRule.expect(InvalidTransactionException.class);
  exceptionRule.expectMessage("Transaction list is empty");
  assertEquals(result, bankObj.viewTransactionAccountwise(t2));
 }
 
 //Test the countTransactionsAccountwise method 
 @Test
 public void test20CountTransactionsAccountwise() throws InvalidTransactionException, ParseException{
  //fill code here 
  Map<String,Integer> result = new LinkedHashMap<>();
  List<Transaction> t2=new ArrayList<>();
  t2.add(trans2);
  t2.add(trans3);
  t2.add(trans4);
  result.put("10586465332566", 2);
  result.put("10586465332567", 1);
  assertEquals(result, bankObj.countTransactionsAccountwise(t2, new SimpleDateFormat("dd/MM/yyyy").parse("1/02/1999"), new SimpleDateFormat("dd/MM/yyyy").parse("13/03/1999")));
 }
 
 //Test the countTransactionsAccountwise method when list is empty
 @Test
 public void test21CountTransactionsAccountwiseForEmptyList() throws InvalidTransactionException, ParseException {
  //fill code here
  Map<String,Integer> result = new LinkedHashMap<>();
  List<Transaction> t2=new ArrayList<>();
  exceptionRule.expect(InvalidTransactionException.class);
  exceptionRule.expectMessage("Transaction list is empty");
  assertEquals(result, bankObj.countTransactionsAccountwise(t2, new SimpleDateFormat("dd/MM/yyyy").parse("1/02/1999"), new SimpleDateFormat("dd/MM/yyyy").parse("13/03/1999")));
 }
}