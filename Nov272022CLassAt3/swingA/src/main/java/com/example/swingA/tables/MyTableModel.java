package com.example.swingA.tables;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.table.DefaultTableModel;

public class MyTableModel extends DefaultTableModel {
	String[] cols = {"Sn.", "Name", "Email", "Active"};
	ArrayList<Student> students;
	
	
	public MyTableModel(ArrayList<Student> stList) {
		students=stList;
	}
	@Override
	public int getColumnCount() {
		if(cols==null) {
			return 0;
		}else {
			return cols.length;
		}
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
	public String getColumnName(int col) {
		return cols[col];
	}
	@Override
	public int getRowCount() {
		if(students==null) {
			return 0;
		}
		else {
			return students.size();
		}
	}
	
	@Override
	public Object getValueAt(int row, int col) {
		if(col==0) {
			return students.get(row).getId();
		}
		else if(col==1) {
			return students.get(row).getName();
		}
		else if(col==2) {
			return students.get(row).getEmail();
		}
		else if(col==3) {
			return students.get(row).isActive();
		}
		else {
			return null;
		}
	}
}
