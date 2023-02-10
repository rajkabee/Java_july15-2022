package webapp.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductDao extends AbstractDao<Product>{
	String sql;
	PreparedStatement pstm;
	int i;
	ResultSet rs;
	
	@Override
	public int save(Product p) throws ClassNotFoundException, SQLException {
		connect();
		sql = "Insert into products(name, description, manufacturer, price, inStock) "
				+ "values (?,?,?,?,?)";
		pstm = con.prepareStatement(sql);
		pstm.setString(1, p.getName());
		pstm.setString(2, p.getDescription());
		pstm.setString(3, p.getManufacturer());
		pstm.setFloat(4, p.getPrice());
		pstm.setBoolean(5, p.isInStock());
		i = pstm.executeUpdate();
		disconnect();
		return i;
	}

	@Override
	public Product getOne(long id) throws ClassNotFoundException, SQLException {
		connect();
		sql = "select * from products where id = ?";
		pstm = con.prepareStatement(sql);
		pstm.setLong(1, id);
		rs = pstm.executeQuery();
		Product p = new Product();
		if(rs.next()) {
			p.setId(rs.getLong("id"));
			p.setName(rs.getString("name"));
			p.setManufacturer(rs.getString("manufacturer"));
			p.setDescription(rs.getString("description"));
			p.setPrice(rs.getFloat("price"));
			p.setInStock(rs.getBoolean("inStock"));
		}
		disconnect();
		return p;
	}

	@Override
	public ArrayList<Product> getAll() throws ClassNotFoundException, SQLException {
		connect();
		sql = "Select * from products";
		pstm = con.prepareStatement(sql);
		rs = pstm.executeQuery();
		ArrayList<Product> products = new ArrayList<>();
		while(rs.next()) {
			Product p = new Product();
			p.setId(rs.getLong("id"));
			p.setName(rs.getString("name"));
			p.setManufacturer(rs.getString("manufacturer"));
			p.setDescription(rs.getString("description"));
			p.setPrice(rs.getFloat("price"));
			p.setInStock(rs.getBoolean("inStock"));
			products.add(p);
		}
		disconnect();
		return products;
	}

	@Override
	public int update(Product p) throws ClassNotFoundException, SQLException {
		connect();
		sql = "update products set name=?, manufacturer=?, description=?, price=?, inStock=? where id = ?";
		pstm = con.prepareStatement(sql);
		pstm.setString(1, p.getName());
		pstm.setString(2, p.getManufacturer());
		pstm.setString(3, p.getDescription());
		pstm.setFloat(4, p.getPrice());
		pstm.setBoolean(5, p.isInStock());
		pstm.setLong(6, p.getId());
		i = pstm.executeUpdate();
		disconnect();
		return i;
	}

	@Override
	public int delete(long id) throws ClassNotFoundException, SQLException {
		connect();
		sql = "delete  from products where id = ?";
		pstm = con.prepareStatement(sql);
		pstm.setLong(1, id);
		i = pstm.executeUpdate();
		
		disconnect();
		return i;
	}

	

}
