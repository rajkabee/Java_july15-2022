package javaCore.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDao extends AbstractDao<Product>{
	String query;
	PreparedStatement pstm;
	ResultSet rs;
	
	public ProductDao() {
		super.url="jdbc:mysql://localhost:3306/learningJava";
		super.driver="com.mysql.cj.jdbc.Driver";
		super.username="root";
		super.password="root";
		
	}

	@Override
	public int save(Product p) {
		connect();
		query = "insert into product(name, manufacturer, description, price, inStock) values(?,?,?,?,?)";
		int i=0;
		try {
		pstm = con.prepareStatement(query);
		pstm.setString(1, p.getName());
		pstm.setString(2, p.getManufacturer());
		pstm.setString(3, p.getDescription());
		pstm.setFloat(4, p.getPrice());
		pstm.setBoolean(5, p.isInStock());
		i = pstm.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		disconnect();
		return i;
	}

	@Override
	public Product getById(int id) {
		connect();
		query = "select * from product where id = ?";
		Product p=null;
		try {
			pstm = con.prepareStatement(query);
			pstm.setInt(1, id);
			rs = pstm.executeQuery();
			
			if(rs.next()) {
				p = new Product();
				p.setId(id);
				p.setName(rs.getString("name"));
				p.setManufacturer(rs.getString("manufacturer"));
				p.setDescription(rs.getString("description"));
				p.setPrice(rs.getFloat("price"));
				p.setInStock(rs.getBoolean("inStock"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		disconnect();
		return p;
	}

	@Override
	public List<Product> getAll() {
		connect();
		query = "select * from Product";
		List<Product> products = new ArrayList<>();
		try {
			pstm = con.prepareStatement(query);
			rs = pstm.executeQuery();
			Product p;
			while(rs.next()) {
				p = new Product();
				p.setId(rs.getInt("id"));
				p.setName(rs.getString("name"));
				p.setManufacturer(rs.getString("manufacturer"));
				p.setDescription(rs.getString("description"));
				p.setPrice(rs.getFloat("price"));
				p.setInStock(rs.getBoolean("inStock"));
				products.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		disconnect();
		return products;
	}

	@Override
	public int update(Product p) {
		connect();
		query = "update product set "
				+ "name=?, manufacturer=?, "
				+ "description=?, price=?, "
				+ "inStock=? where id=?";
		int i=0;
		try {
			pstm = con.prepareStatement(query);
			pstm.setString(1, p.getName());
			pstm.setString(2, p.getManufacturer());
			pstm.setString(3, p.getDescription());
			pstm.setFloat(4, p.getPrice());
			pstm.setBoolean(5, p.isInStock());
			pstm.setInt(6, p.getId());
			i = pstm.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		disconnect();
		return i;
	}

	@Override
	public int delete(int id) {
		connect();
		query = "delete from product where id=?";
		int i=0;
		try {
			pstm = con.prepareStatement(query);
			pstm.setInt(1, id);
			i=pstm.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		disconnect();
		return i;
	}

}
