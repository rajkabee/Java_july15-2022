package jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductUpdate {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/learningJava";
		String username = "root";
		String password = "root";
		String query="update product set "
				+ "name=?, manufacturer=?, "
				+ "description=?, price=?, "
				+ "instock=? "
				+ "where id=?";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, username, password);
		PreparedStatement pstm = con.prepareStatement(query);
		pstm.setString(1, "Safety Boot");
		pstm.setString(2, "Timberland");
		pstm.setString(3, "Steel Toe leather safety working boots");
		pstm.setFloat(4, 33333.33f);
		pstm.setBoolean(5, true);
		pstm.setInt(6, 10);
		int i = pstm.executeUpdate();
		if(i==1) {
			System.out.println("Product updated...");
		}
		pstm.close();
		con.close();
	}
}
