package com.example.jdbcConnection.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductDao extends AbstractDataAccessObject<Product> {
	String query;
	ResultSet rs;
	PreparedStatement pstm;
	int i;
	@Override
	public int save(Product pd) throws ClassNotFoundException, SQLException {
		query = "INSERT INTO products (name, manufacturer, description, price, active) values (?,?,?,?,?)";
		connect();
		pstm=con.prepareStatement(query);
		pstm.setString(1, pd.getName());
		pstm.setString(2, pd.getManufacturer());
		pstm.setString(3, pd.getDescription());
		pstm.setFloat(4, pd.getPrice());
		pstm.setBoolean(5, pd.isActive());
		i = pstm.executeUpdate();
		disconnect();
		return i;
	}

	@Override
	public Product getOne(int id) throws ClassNotFoundException, SQLException {
		query = "SELECT * FROM products WHERE id=?";
		connect();
		pstm = con.prepareStatement(query);
		pstm.setInt(1, id);
		rs = pstm.executeQuery();
		Product pd = new Product();
		if(rs.next()) {
			pd.setId(rs.getInt("id"));
			pd.setName(rs.getString("name"));
			pd.setManufacturer(rs.getString("manufacturer"));
			pd.setDescription(rs.getString("description"));
			pd.setPrice(rs.getFloat("price"));
			pd.setActive(rs.getBoolean("active"));
			disconnect();
			return pd;
		}
		
		return null;
	}

	

	@Override
	public ArrayList<Product> getAll() throws ClassNotFoundException, SQLException {
		
		query = "SELECT * FROM products";
		connect();
		pstm = con.prepareStatement(query);
		rs = pstm.executeQuery();
		ArrayList<Product> products = new ArrayList<>();
		while(rs.next()) {
			Product pd = new Product();
			pd.setId(rs.getInt("id"));
			pd.setName(rs.getString("name"));
			pd.setManufacturer(rs.getString("manufacturer"));
			pd.setDescription(rs.getString("description"));
			pd.setPrice(rs.getFloat("price"));
			pd.setActive(rs.getBoolean("active"));
			products.add(pd);
		}
		disconnect();
		return products;
		
	}

	@Override
	public int update(Product pd) throws ClassNotFoundException, SQLException {
		query = "UPDATE products  set name=?, manufacturer=?, description=?, price=?, active=? WHERE id=?";
		connect();
		pstm=con.prepareStatement(query);
		pstm.setString(1, pd.getName());
		pstm.setString(2, pd.getManufacturer());
		pstm.setString(3, pd.getDescription());
		pstm.setFloat(4, pd.getPrice());
		pstm.setBoolean(5, pd.isActive());
		pstm.setBoolean(6, pd.isActive());
		i = pstm.executeUpdate();
		disconnect();
		return i;
	}

	@Override
	public int delete(int id) throws ClassNotFoundException, SQLException {
		query = "DELETE FROM products where id=?";
		connect();
		pstm = con.prepareStatement(query);
		pstm.setInt(1, id);
		int i = pstm.executeUpdate();
		return i;
	}

}
