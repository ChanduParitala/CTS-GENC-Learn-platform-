package com.cts.SpringAopDemo;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// Type your code here
@Component
public class EasyBank {

	private int pinCode = 6789;
	private int balance = 10000;
	private int tempPin;

	public int getPinCode() {
		return pinCode;
	}

	@Value("6789")
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	@Value("10000")
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getTempPin() {
		return tempPin;
	}

	public void setTempPin(int tempPin) {
		this.tempPin = tempPin;
	}

	public void doDeposit(int amount) {

		// Type your code here
		balance += amount;
		System.out.println("Your  balance is "+balance);
	}

	public void doWithdraw(int amount) {

		// Type your code here
		if(amount <= balance)
		{
			balance -= amount;
			System.out.println("You have successfully withdrawn " + amount);
			return;
		}
		else
		{System.out.println("Insufficient Fund");
		return;}

	}

	public void doChangePin(int oldPin, int pin) {

		// Type your code here
		//this method is a bug
		if(oldPin==pin && Integer.toString(pin).matches("^[1-9]{1}[0-9]{3}$"))
		{
			pinCode=pin;
			return;
		}
		else
		{
			System.out.println("Invalid pin");
			return;
		}
	}

	public void showBalance() {

		// Type your code here
		System.out.println("Your balance is " + balance);
		
	}

}
