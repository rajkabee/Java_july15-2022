package com.rajkabee.mavenHelloWorld.jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDao extends AbstractDao<Product> {
	PreparedStatement pstm;
	ResultSet rs;
	
	
	
	public ProductDao(String driverClass, String dbUrl, String dbUsername, String dbPassword) {
		super.driverClass = driverClass;
		super.dbUrl = dbUrl;
		super.dbUsername = dbUsername;
		super.dbPassword = dbPassword;
		
	}
	@Override
	public int save(Product p) throws SQLException, ClassNotFoundException {
		connect();
		String query = "insert into product (name, manufacturer, active) values (?, ?, ?)";
		pstm = con.prepareStatement(query);
		pstm.setString(1, p.getName());
		pstm.setString(2, p.getManufacturer());
		pstm.setBoolean(3, p.isActive());
		int i = pstm.executeUpdate();
		disconnect();
		return i;
	}
	@Override
	public Product getOne(int id) throws ClassNotFoundException, SQLException {
		connect();
		String query = "select * from product where id =?";
		pstm = con.prepareStatement(query);
		pstm.setInt(1, id);
		rs = pstm.executeQuery();
		Product p = new Product();
		if(rs.next()) {
			p.setId(rs.getInt("id"));
			p.setName(rs.getString("name"));
			p.setManufacturer(rs.getString("manufacturer"));
			p.setActive(rs.getBoolean("active"));
		}
		disconnect();
		return p;
	}
	@Override
	public List<Product> getAll() throws ClassNotFoundException, SQLException {
		connect();
		String query = "select * from product";
		PreparedStatement pstm = con.prepareStatement(query);
		rs = pstm.executeQuery();
		ArrayList<Product> products = new ArrayList<Product>();
		while(rs.next()) {
			Product p = new Product();
			p.setId(rs.getInt("id"));
			p.setName(rs.getString("name"));
			p.setManufacturer(rs.getString("manufacturer"));
			p.setActive(rs.getBoolean("active"));
			products.add(p);
		}
		disconnect();
		return products;
	}
	@Override
	public int update(Product p) throws ClassNotFoundException, SQLException {
		connect();
		String query = "update product set name=?, manufacturer=?, active=? where id=?";
		pstm = con.prepareStatement(query);
		pstm.setString(1, p.getName());
		pstm.setString(2, p.getManufacturer());
		pstm.setBoolean(3, p.isActive());
		pstm.setInt(4, p.getId());
		int i = pstm.executeUpdate();
		disconnect();
		return 0;
	}
	@Override
	public int delete(int id) throws ClassNotFoundException, SQLException {
		connect();
		String query = "delete from product where id=?";
		pstm = con.prepareStatement(query);
		pstm.setInt(1, id);
		int i = pstm.executeUpdate();
		disconnect();
		return 0;
	}



}
