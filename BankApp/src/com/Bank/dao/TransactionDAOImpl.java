package com.Bank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import com.Bank.Connection.Connector;
import com.Bank.dto.Transaction;

public class TransactionDAOImpl implements TransactionDAO {

	private Connection con;
	public TransactionDAOImpl()
	{
		this.con=Connector.requestConnection();
	}

	@Override
	public boolean insertTransaction(Transaction t) {
		PreparedStatement ps=null;
		 String query="INSERT INTO PASSBOOK(TRAN_ID,USER_ACC,REC_ACC,TRAN_DATE,TRAN_TYPE,AMOUNT,BALANCE)"+ " VALUES(?,?,?,sysdate(),?,?,?)";
		 int res=0;
		 try {
		 con=Connector.requestConnection();
		 ps=con.prepareStatement(query);
		 ps.setLong(1,t.getTransactionid());
		 ps.setLong(2, t.getUser());
		 ps.setLong(3, t.getRecacc());
		 ps.setString(4, t.getTransaction());
		 //ps.setDate(5,d);
		 ps.setDouble(5, t.getAmount());
		 ps.setDouble(6, t.getBalance());
		 res=ps.executeUpdate();
		 } catch (SQLException e) {
		 // TODO Auto-generated catch block
		 e.printStackTrace();
		 }
		 if(res>0)
		 {
		 return true;
		 }
		 else
		 {
		 return false;
		 }
	}

	@Override
	public ArrayList<Transaction> getTransaction(long user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Transaction> getTransaction() {
		// TODO Auto-generated method stub
		return null;
	}

}
