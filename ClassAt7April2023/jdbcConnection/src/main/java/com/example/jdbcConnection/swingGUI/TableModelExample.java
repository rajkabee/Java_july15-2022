package com.example.jdbcConnection.swingGUI;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.example.jdbcConnection.dao.Product;
import com.example.jdbcConnection.dao.ProductDao;

public class TableModelExample {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		ProductDao pDao = new ProductDao();
		ArrayList<Product> products = pDao.getAll();
		
		JFrame frame = new JFrame("JTable Example");
		frame.setBounds(250,100, 800,500);
		frame.setDefaultCloseOperation(3);
		ProductTableModel model = new ProductTableModel(products);
		JTable table = new JTable(model);
		JScrollPane scrollPane = new JScrollPane(table);
		//scrollPane.add(table);
		frame.add(scrollPane);
		
		frame.setVisible(true);
	}
}	
	class ProductTableModel extends DefaultTableModel{
		String[] cols = {"Sn.", "Name", "Manufacturer", "Active"};
		ArrayList<Product> products;
		public ProductTableModel(ArrayList<Product> products) {
			this.products=products;
		}
		@Override
		public int getColumnCount() {
			if(cols!=null) {
				return cols.length;
			}
			else {
				return 0;
			}
		}
		@Override
		public String getColumnName(int column) {
			return cols[column];
		}
		
		@Override
		public Class<?> getColumnClass(int col) {
			if(col==0) {
				return Integer.class;
			}
			else if(col==3) {
				return Boolean.class;
			}
			else {
				return String.class;
			}
		}
		@Override
		public int getRowCount() {
			if(products==null) {
				return 0;
			}
			else {
				return products.size();
			}
		}
		@Override
		public Object getValueAt(int row, int col) {
			if(col==0) {
				return products.get(row).getId();
			}
			else if(col==1) {
				return products.get(row).getName();
			}
			else if(col==2) {
				return products.get(row).getManufacturer();
			}
			else if(col==3) {
				return products.get(row).isActive();
			}
			else return null;
		}
	}

