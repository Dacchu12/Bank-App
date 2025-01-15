package com.Bank.App;

import java.util.Scanner;
import com.Bank.dao.*;
import com.Bank.dto.Customer;
public class Login {
public static void login() {
	Scanner sc= new Scanner(System.in);
	CustomerDAO cdao=new CustomerDAOImpl();
	System.out.println("Enter your account number");
	long accno=sc.nextLong();
	System.out.println("Enter your pin");
	int pin=sc.nextInt();
	Customer c=cdao.getCustomer(accno, pin);
	if(c!=null)
	{
		System.out.println("Login Successfull");
		App.options(c);
	}
	else
		System.out.println("Failed to login");
	}
}
