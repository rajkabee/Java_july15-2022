package com.example.swingPractice.jTableExamples1.tableModel;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;

public class MyTableModel extends DefaultTableModel{
	String[] cols;
	ArrayList<Product> products;
	public MyTableModel(String[] cols, ArrayList<Product> products ) {
		this.cols = cols;
		this.products = products;
	}
	@Override
	public int getColumnCount() {
		return cols.length;
	}
	@Override
	public int getRowCount() {
		if(products!=null) {
			return products.size();
		}else {
			return 0;
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
			temp = products.get(row).getDescription();
		}
		else if(col==3) {
			temp = products.get(row).getUnit_price();
		}
		else if(col==4) {
			temp = products.get(row).getUnits_in_stock();
		}
		else if(col==5) {
			temp = products.get(row).isAvailable();
		}
		return temp;
		
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
		else if(col==1) {
			return String.class;
		}
		else if(col==2) {
			return String.class;
		}
		else if(col==3) {
			return BigDecimal.class;
		}else if(col==4){
			return Integer.class;
		}else {
			return Boolean.class;
		}
		
	}
}
