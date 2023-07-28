package com.example.jdbc.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.jdbc.crud.User;


public class ProductDao extends AbstractDao<Product, Integer>{
	PreparedStatement pstm;
	ResultSet rs;
	@Override
	public int save(Product p) {
		connect();
		String query = "insert into products (name, description, price) "
				+ "values(?,?,?)";
		int i=0;
		try {
			pstm = con.prepareStatement(query);
			pstm.setString(1, p.getName());
			pstm.setString(2, p.getDescription());
			pstm.setDouble(3, p.getPrice());
			i = pstm.executeUpdate();
			pstm.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		disconnect();
		return i;
	}

	@Override
	public int update(Product p) {
		connect();
		String query = "update products set name=?, description=?, price=? where id=?";
		int i=0;
		try {
			pstm = con.prepareStatement(query);
			pstm.setString(1, p.getName());
			pstm.setString(2, p.getDescription());
			pstm.setDouble(3, p.getPrice());
			pstm.setInt(4, p.getPid());
			i = pstm.executeUpdate();
			pstm.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		disconnect();
		return i;
	}

	@Override
	public Product getOne(Integer id) {
		connect();
		String query = "select * from products where id=?";
		Product product=null;
		try {
			pstm = con.prepareStatement(query);
			pstm.setInt(1, id);
			ResultSet rs = pstm.executeQuery();
			if(rs.next()) {
				product = new Product();
				product.setPid(rs.getInt("id"));
				product.setName(rs.getString("name"));
				product.setDescription(rs.getString("description"));
				product.setPrice(rs.getDouble("price"));
			}
			pstm.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return product;
	}

	@Override
	public List<Product> getAll() {
		connect();
		String query = "select * from products";
		PreparedStatement pstm;
		ArrayList<Product> products=null;
		try {
			pstm = con.prepareStatement(query);
			rs = pstm.executeQuery();
			products = new ArrayList<Product>();
			while(rs.next()) {
				Product product = new Product();
				product.setPid(rs.getInt("id"));
				product.setName(rs.getString("name"));
				product.setDescription(rs.getString("description"));
				product.setPrice(rs.getDouble("price"));
				products.add(product);
			}
			pstm.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		disconnect();
		return  products;
	}

	@Override
	public int delete(Integer id) {
		connect();
		String query = "delete from products where id=?";
		
		int i=0;
		try {
			pstm = con.prepareStatement(query);
			pstm.setInt(1, id);
			i = pstm.executeUpdate();
			pstm.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		disconnect();
		return i;
	}

}
