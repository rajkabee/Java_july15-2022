package firstWebApp.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductDao extends AbstractDao<Product> {
	String url = "jdbc:mysql://localhost:3306/itstore";
	String user = "root";
	String pass = "root";
	PreparedStatement pstm;
	String query;
	ResultSet rs;
	String driver = "com.mysql.cj.jdbc.Driver";

	public ProductDao() {
		super.dbUrl = url;
		super.dbUsername = user;
		super.dbPassword = pass;
		super.driver = driver;
	}

	@Override
	public int save(Product product) throws SQLException, ClassNotFoundException {
		connect();
		query = "INSERT INTO products (productName, brand, description, price, isInStock)" + " values (?,?,?,?,?)";
		pstm = con.prepareStatement(query);
		pstm.setString(1, product.getProductName());
		pstm.setString(2, product.getBrand());
		pstm.setString(3, product.getDescription());
		pstm.setFloat(4, product.getPrice());
		pstm.setBoolean(5, product.isInStock());
		int i = pstm.executeUpdate();
		disconnect();

		return i;
	}

	@Override
	public Product getOne(int id) throws SQLException, ClassNotFoundException {
		query = "select * from products where productId = ?";
		connect();
		pstm = con.prepareStatement(query);
		pstm.setInt(1, id);
		rs = null;
		rs = pstm.executeQuery();

		if (rs.next()) {
			Product p = new Product(rs.getInt("productId"), rs.getString("productName"), rs.getString("brand"),
					rs.getString("description"), rs.getFloat("price"), rs.getBoolean("isInStock"));
			disconnect();
			return p;
		}

		disconnect();
		return null;
	}

	@Override
	public ArrayList<Product> getAll() throws SQLException, ClassNotFoundException {
		query = "select * from products";
		connect();
		pstm = con.prepareStatement(query);
		rs = null;
		rs = pstm.executeQuery();
		ArrayList<Product> products = new ArrayList<>();
		while (rs.next()) {
			Product p = new Product(rs.getInt("productId"), rs.getString("productName"), rs.getString("brand"),
					rs.getString("description"), rs.getFloat("price"), rs.getBoolean("isInStock"));
			products.add(p);
		}

		disconnect();
		return products;
	}

	@Override
	public int update(Product product) throws SQLException, ClassNotFoundException {
		connect();
		query = "Update Products set productName = ?, brand = ?, description=?," + "price=?, isInStock=?"
				+ " where productId = ?";
		pstm = con.prepareStatement(query);
		pstm.setString(1, product.getProductName());
		pstm.setString(2, product.getBrand());
		pstm.setString(3, product.getDescription());
		pstm.setFloat(4, product.getPrice());
		pstm.setBoolean(5, product.isInStock());
		pstm.setInt(6, product.getProductId());
		int i = pstm.executeUpdate();
		disconnect();
		return i;
	}

	@Override
	public int delete(int id) throws SQLException, ClassNotFoundException {
		connect();
		query = "delete from products where id = ?";
		pstm = con.prepareStatement(query);
		pstm.setInt(1, id);
		int i = pstm.executeUpdate();
		disconnect();
		return i;
	}

}
