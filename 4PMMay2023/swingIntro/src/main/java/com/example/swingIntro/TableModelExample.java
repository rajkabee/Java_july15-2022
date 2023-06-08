package com.example.swingIntro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TableModelExample {
	public static void main(String[] args) {
		List<Customer> customers = Arrays.asList(new Customer[] {
				new Customer(1, "Sabin Pradhan", "Dhapakhel", 9876678766l, true),
				new Customer(2, "Alina Shrestha", "Lubhu", 9876678766l, true),
				new Customer(3, "Alisha Baniya", "Badikhel", 9876653442l, false),
				new Customer(4, "Bipana Khadka", "Dhapasi", 98766775833l, true),
				new Customer(5, "Samriddhi Karki", "Tokha", 9876643674l, false),
				new Customer(6, "Nabina Tamang", "Dhulikhel", 9876678766l, true),
				new Customer(7, "Sujata Thapa", "Banepa", 9876678766l, true),
		});
		
		Frame frame = new Frame();
		CustomerTableModel model = new CustomerTableModel(customers);
		JTable table = new JTable(model);
		JScrollPane scrollPane = new JScrollPane(table);
		frame.add(scrollPane);
		
		frame.setVisible(true);
		
	}
}

class CustomerTableModel extends DefaultTableModel{
	String[] cols = {"Customer Id", 
			"Customer Name", 
			"Customers' Address",
			"Contact" ,
			"Active"};
	List<Customer> customers = null;
	public CustomerTableModel(List<Customer> customers) {
		super();
		this.customers = customers;
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
		if(col==0) {
			return Integer.class;
		}
		else if(col==3) {
			return Long.class;
		}
		else if(col==4) {
			return Boolean.class;
		}
		return String.class;
		
	}
	
	@Override
	public int getRowCount() {
		if(customers==null) {
			return 0;
		}
		return customers.size();
	}
	@Override
	public Object getValueAt(int row, int col) {
		if(col==0) {
			return customers.get(row).getId();
		}
		else if(col==1) {
			return customers.get(row).getName();
		}
		else if(col==2) {
			return customers.get(row).getAddress();
		}
		else if(col==3) {
			return customers.get(row).getContact();
		}
		else if(col==4) {
			return customers.get(row).isActive();
		}
		return null;
	}
	
}
