package javaCore.swing.components;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import javaCore.model.Product;
import javaCore.model.ProductDao;

public class DefaultTableModelExample extends JFrame{
	public static void main(String[] args) {
		DefaultTableModelExample frame = new DefaultTableModelExample();
	}
	public DefaultTableModelExample(){
		setTitle("JTable Example");
		setBounds(200,100,800,500);
		setDefaultCloseOperation(3);
		MyTableModel tableModel = new MyTableModel();
		JTable table = new JTable(tableModel);
		JScrollPane pane = new JScrollPane(table);
		add(pane);
		
		setVisible(true);
	}
	
	
	
	
	
	
	
	private class MyTableModel extends DefaultTableModel{
		String[] cols = {"name", "manufacturer", "price"};
		ArrayList<Product> products;
		public MyTableModel() {
			products = (ArrayList<Product>) new ProductDao().getAll();
		}
		
		@Override
		public int getColumnCount() {
			return cols.length;
		}
		@Override
		public String getColumnName(int column) {
			return cols[column];
		}
		@Override
		public Class<?> getColumnClass(int col) {
			
			if(col==0||col==1) {
				return String.class;
			}
			else {
				return Float.class;
			}
		}
		@Override
		public int getRowCount() {
			if(products!=null) {
				return products.size();
			}
			else {
				return 0;
			}
		}
		
		@Override
		public Object getValueAt(int row, int col) {
			Object temp=null;
			if(col==0) {
				temp = products.get(row).getName();
			}
			else if(col==1) {
				temp = products.get(row).getManufacturer();
			}
			else if(col==2) {
				temp=products.get(row).getPrice();
			}
			return temp;
		}
	}
}
