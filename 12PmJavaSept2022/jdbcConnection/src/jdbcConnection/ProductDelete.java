package jdbcConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductDelete {



	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/learningJava";
		String username = "root";
		String password = "root";
		String query="delete from product where id=?";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, username, password);
		PreparedStatement pstm = con.prepareStatement(query);
		pstm.setInt(1, 2);
		int i = pstm.executeUpdate();
		if(i==1) {
			System.out.println("Product deleted...");
		}
		pstm.close();
		con.close();
	}
}
