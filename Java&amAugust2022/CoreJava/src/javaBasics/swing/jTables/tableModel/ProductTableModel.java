package javaBasics.swing.jTables.tableModel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;
import javaBasics.intro.jdbc.dao.Product;

public class ProductTableModel extends DefaultTableModel{
	String[] cols;
	List<Product> products=new ArrayList<>();
	public ProductTableModel(String[] cols, ArrayList<Product> products) {
		super();
		this.cols = cols;
		this.products = products;
	}
	@Override
	public int getColumnCount() {
		return cols.length;
	}
	@Override
	public int getRowCount() {
		int size;
		if (products == null) {
			size = 0;
		} else {
			size = products.size();
		}
		return size;
	}
	@Override
	public String getColumnName(int column) {
		return cols[column];
	}
	@Override
	public Class<?> getColumnClass(int col) {
		if(col==0||col==5) {
			return Integer.class;
		}
		else if(col==4) {
			return Float.class;
		}
		else if(col==6) {
			return Boolean.class;
		}
		else {
			return String.class;
		}
	}
	@Override
	public Object getValueAt(int row, int col) {
		Object temp=null;
		if(col==0) {
			temp = products.get(row).getId();
		}
		else if(col==1) {
			temp = products.get(row).getName();
		}
		else if(col==2) {
			temp = products.get(row).getManufacturer();
		}
		else if(col==3) {
			temp = products.get(row).getDescription();
		}
		else if(col==4) {
			temp = products.get(row).getPrice();
		}
		else if(col==5) {
			temp = products.get(row).getQuantity();
		}
		else if(col==6) {
			temp = products.get(row).isInStock();
		}
		return temp;
		
	}
	
}
