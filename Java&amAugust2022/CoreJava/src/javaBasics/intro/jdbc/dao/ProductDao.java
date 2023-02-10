package javaBasics.intro.jdbc.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductDao extends AbstractDao<Product> {
	String sql;
	PreparedStatement pstm;
	ResultSet rs;
	@Override
	public int save(Product p) throws ClassNotFoundException, SQLException {
		connect();
		sql= "insert into product"
				+ " (name, manufacturer, description, price, quantity, inStock)"
				+ "values"
				+ " (?,?,?,?,?,?)";
		pstm = con.prepareStatement(sql);
		pstm.setString(1, p.getName());
		pstm.setString(2, p.getManufacturer());
		pstm.setString(3, p.getDescription());
		pstm.setFloat(4, p.getPrice());
		pstm.setInt(5, p.getQuantity());
		pstm.setBoolean(6, p.isInStock());
		int i = pstm.executeUpdate();
		disconnect();
		return i;
	}

	@Override
	public Product getOne(int id) throws ClassNotFoundException, SQLException {
		connect();
		sql="select * from product where id=?";
		pstm=con.prepareStatement(sql);
		pstm.setInt(1, id);
		rs = pstm.executeQuery();
		Product p = new Product();
		if(rs.next()) {
			p.setId(rs.getInt("id"));
			p.setName(rs.getString("name"));
			p.setManufacturer(rs.getString("manufacturer"));
			p.setDescription(rs.getString("description"));
			p.setPrice(rs.getFloat("price"));
			p.setQuantity(rs.getInt("quantity"));
			p.setInStock(rs.getBoolean("instock"));
		}
		disconnect();
		return p;
	}

	@Override
	public ArrayList<Product> getAll() throws ClassNotFoundException, SQLException {
		connect();
		sql="select * from product";
		pstm=con.prepareStatement(sql);
		rs = pstm.executeQuery();
		ArrayList<Product> products = new ArrayList<>();
		while(rs.next()) {
			Product p = new Product();
			p.setId(rs.getInt("id"));
			p.setName(rs.getString("name"));
			p.setManufacturer(rs.getString("manufacturer"));
			p.setDescription(rs.getString("description"));
			p.setPrice(rs.getFloat("price"));
			p.setQuantity(rs.getInt("quantity"));
			p.setInStock(rs.getBoolean("instock"));
			products.add(p);
		}
		disconnect();
		return products;
	}

	@Override
	public int update(Product p) throws ClassNotFoundException, SQLException {
		connect();
		int i=0;
		sql = "update product set name=?, manufacturer=?, description=?,"
				+ " price=?, quantity=?, inStock=? where id=?";
		pstm = con.prepareStatement(sql);
		pstm.setString(1, p.getName());
		pstm.setString(2, p.getManufacturer());
		pstm.setString(3, p.getDescription());
		pstm.setFloat(4, p.getPrice());
		pstm.setInt(5, p.getQuantity());
		pstm.setBoolean(6, p.isInStock());
		pstm.setInt(7, p.getId());
		i = pstm.executeUpdate();
		disconnect();
		return i;
	}

	@Override
	public int delete(int id) throws ClassNotFoundException, SQLException {
		connect();
		sql = "delete from product where id = ?";
		pstm = con.prepareStatement(sql);
		pstm.setInt(1, id);
		int i = pstm.executeUpdate();
		disconnect();
		return i;
	}

}
