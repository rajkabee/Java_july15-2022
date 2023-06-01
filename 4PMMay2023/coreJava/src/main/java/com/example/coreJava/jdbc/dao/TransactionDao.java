package com.example.coreJava.jdbc.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TransactionDao extends AbstractDao<Transaction> {
	String query;
	int i;
	ResultSet rs;
	PreparedStatement pstm;
	@Override
	public int save(Transaction t) throws SQLException {
		query = "insert into transaction (sender, receiver, amount) values(?,?,?)";
		connect();
		pstm = con.prepareStatement(query);
		pstm.setString(1, t.getSender());
		pstm.setString(2, t.getReceiver());
		pstm.setFloat(3, t.getAmount());
		i = pstm.executeUpdate();
		disconnect();
		return i;
	}

	@Override
	public Transaction getOne(int id) throws SQLException {
		query = "select * from transaction where id=?";
		connect();
		pstm=con.prepareStatement(query);
		pstm.setInt(1, id);
		rs = pstm.executeQuery();
		Transaction tx=null;
		if(rs.next()) {
			tx=new Transaction(
					rs.getInt("id"),
					rs.getString("sender"),
					rs.getString("receiver"),
					rs.getFloat("amount")
					);
		}
		disconnect();
		return tx;
	}

	@Override
	public List<Transaction> getAll() throws SQLException {
		query = "select * from transaction";
		connect();
		pstm=con.prepareStatement(query);
		rs = pstm.executeQuery();
		ArrayList<Transaction> transactions=new ArrayList<>();
		Transaction tx=null;
		while(rs.next()) {
			tx=new Transaction(
					rs.getInt("id"),
					rs.getString("sender"),
					rs.getString("receiver"),
					rs.getFloat("amount")
					);
			transactions.add(tx);
		}
		disconnect();
		return transactions;
	}

	@Override
	public int update(Transaction t) throws SQLException {
		query = "update transaction set sender=?, receiver=?, amount=? where id=?";
		connect();
		pstm = con.prepareStatement(query);
		pstm.setString(1, t.getSender());
		pstm.setString(2, t.getReceiver());
		pstm.setFloat(3, t.getAmount());
		pstm.setInt(4, t.getId());
		i = pstm.executeUpdate();
		disconnect();
		return i;
	}

	@Override
	public int delete(int id) throws SQLException {
		query = "delete from transaction where id=?";
		connect();
		pstm=con.prepareStatement(query);
		pstm.setInt(1, id);
		i = pstm.executeUpdate();
		disconnect();
		return i;
	}

}
