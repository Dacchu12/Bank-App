package com.Bank.App;

import com.Bank.dto.Customer;
import com.Bank.dto.Transaction;

import java.util.Scanner;
import com.Bank.dao.*;



public class Deposit {

	public static void deposit(Customer c) {
		// TODO Auto-generated method stub
		CustomerDAO cdao=new CustomerDAOImpl();
		 TransactionDAO tdao=new TransactionDAOImpl();
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the amount to be deposited");
		 double amount=sc.nextDouble();
		 c.setBal(c.getBal()+amount);
		 boolean res=cdao.updateCustomer(c);
		 if(res)
		 {
		 Transaction t=new Transaction();
		 
		 t.setTransactionid(TransactionID.generateTransactionId());
		 t.setUser(c.getAccno());
		 t.setRecacc(c.getAccno());
		 t.setTransaction("CREDITED");
		 t.setAmount(amount);
		 t.setBalance(c.getBal());
		 boolean res1=tdao.insertTransaction(t);
		 if(res)
		 {
		 System.out.println("Amount of Rs."+amount+" has been added successfully!");
		 System.out.println("Your updated balance is Rs."+c.getBal());
		 }
		 else
		 {
			 System.out.println("Failed to deposit! Try again later");
			 }
			 }
			}
	}


