package com.Bank.App;

import java.util.Scanner;

import com.Bank.dto.Customer;

public class App {
public static void options(Customer c) {
	Scanner sc=new Scanner(System.in);
	int ch=0;
	System.out.println("Welcome "+c.getName()+",");
	System.out.println("Enter your choice");
	do {
		System.out.println("1. Chech Balance");
		System.out.println("2. Deposit");
		System.out.println("3. Transfer the amount");
		System.out.println("4. Passbook");
		System.out.println("5. Update your amount");
		System.out.println("6. Reset Pin");
		System.out.println("7 .Go Back to Main Menu");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:System.out.println("Your balance is Rs"+c.getBal());break;
		case 2:Deposit.deposit(c);break;
		case 3:TransferAmount.transferAmount(c);
		case 4:Passbook.getPassbook(c);
		case 5:break;
		case 6:ResetPin.resetPin(c);
		case 7:System.out.println("Entering to main menu");break;
		default :System.out.println("Invalid choice");
		}
	}while(ch!=7);
}
}
