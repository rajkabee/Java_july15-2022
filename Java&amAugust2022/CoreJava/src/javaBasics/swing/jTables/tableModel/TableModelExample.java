package javaBasics.swing.jTables.tableModel;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import javaBasics.intro.jdbc.dao.Product;
import javaBasics.intro.jdbc.dao.ProductDao;

public class TableModelExample {
	public static void main(String[] args) {
		ProductDao pDao = new ProductDao();
		ArrayList<Product> products = new ArrayList<>();
		try {
			products = pDao.getAll();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(products);
		String[] cols= {"Id", "Name", "Manufacturer", "Description",
						"Price", "Quantity", "Is In Stock"};
		ProductTableModel model = new ProductTableModel(cols, products);
		JTable table = new JTable(model);
		JScrollPane pane = new JScrollPane(table);
		JFrame f = new JFrame("Default Table Model Example");
		f.add(pane);
		f.pack();
		f.setDefaultCloseOperation(3);
		f.setVisible(true);
		
		
	}
}
