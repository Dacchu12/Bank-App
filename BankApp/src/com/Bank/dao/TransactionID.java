package com.Bank.dao;

import java.util.Random;

public class TransactionID {

	public static long generateTransactionId() {
		Random r=new Random();	
		long r1=100000000000000L+ (long)(r.nextDouble()*90000000000000L);
		return r1;
	}

}
