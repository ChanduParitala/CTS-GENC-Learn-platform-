package com.dao;

import java.util.ArrayList;
import java.util.List;

import com.exception.LoanException;
//import com.model.Customer;
import com.model.Loan;

//import java.io.IOException;

public class LoanDAO {

	List<Loan> loanList = new ArrayList<>();

	public void issueLoan(Loan loanObj) {
		loanList.add(loanObj);
	}

	public List<Loan> viewLoanByType(int loanType) throws LoanException {

		if (loanList.isEmpty()) {
			return null;
		} else {
			List<Loan> temp = new ArrayList<>();
			for (Loan loan : loanList) {
				if (loan.getLoanType().equals(loanType)) {
					temp.add(loan);
				}
			}

			// try{
			if (temp.isEmpty()) { // to check if temp is empty
				throw new LoanException("No loans available with type " + loanType);
			}
			// }
			// catch(LoanException e){

			// }
			/*
			 * finally{ return temp; }
			 */
			else {
				return temp;
			}
		}
	}

}
