package com.Bank.dto;

public class Transaction {
private long transactionid;
private long user;
private long recacc;
private String date;
private String transaction;
private double amount;
private double balance;
public long getTransactionid() {
	return transactionid;
}
public void setTransactionid(long transactionid) {
	this.transactionid = transactionid;
}
public long getUser() {
	return user;
}
public void setUser(long user) {
	this.user = user;
}
public long getRecacc() {
	return recacc;
}
public void setRecacc(long recacc) {
	this.recacc = recacc;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getTransaction() {
	return transaction;
}
public void setTransaction(String transaction) {
	this.transaction = transaction;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
@Override
public String toString() {
	return "Transaction [transactionid=" + transactionid + ", user=" + user + ", recacc=" + recacc + ", date=" + date
			+ ", transaction=" + transaction + ", amount=" + amount + ", balance=" + balance + "]";
}

}
