package com.Bank.App;

import java.util.Scanner;

public class Welcome {
public static void main(String[] args) {
	int ch=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("=======Welcome to Bank Application======");
	do {
		System.out.println("1.Customer Login");
		System.out.println("2.Create an Account");
		System.out.println("3.Exit");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:Login.login();
		         break;
		case 2:Signup.signup(); break;
		case 3:System.out.println("Exiting the Application"); break;
		}
	}while(ch!=3);
}
}
