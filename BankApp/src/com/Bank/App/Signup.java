package com.Bank.App;

import java.util.Scanner;

import com.Bank.dao.CustomerDAO;
import com.Bank.dao.CustomerDAOImpl;
import com.Bank.dto.Customer;

public class Signup {
public static void signup(){
Customer c=new Customer();
CustomerDAO cdao=new CustomerDAOImpl();
Scanner sc=new Scanner(System.in);
System.out.println("===Application Form===");
System.out.println("Enter your name");
c.setName(sc.next());
System.out.println("Enter your phone number");
c.setPhone(sc.nextLong());
System.out.println("Enter your Mail ID");
c.setMail(sc.next());
System.out.println("Enter your pin");
int pin=sc.nextInt();
System.out.println("Re-Enter your pin");
int rpin=sc.nextInt();
if(pin==rpin)
{
	c.setPin(pin);
   boolean res=cdao.insertCustomer(c);
   if(res)
   {
	   System.out.println("Account created Successfully");
	   c=cdao.getCustomer(c.getPhone(), c.getMail());
	   System.out.println("Your Account number is "+c.getAccno());
   }
   else
   {
	   System.out.println("Failed to create Account");
   }
}
}
}
