package com.Bank.dao;

import java.util.ArrayList;
import com.Bank.dto.Transaction;

public interface TransactionDAO {
public boolean insertTransaction(Transaction t);
public ArrayList<Transaction> getTransaction(long user);
public ArrayList<Transaction> getTransaction();
}
