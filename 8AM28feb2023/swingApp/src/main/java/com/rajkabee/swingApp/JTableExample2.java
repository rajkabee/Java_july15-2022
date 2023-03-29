package com.rajkabee.swingApp;

import java.util.Arrays;
import java.util.List;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JTableExample2 {
	public static void main(String[] args) {
		List<Student> students=Arrays.asList(
				new Student[] {
						new Student(1, "Puskar Pandey", "puskar@gmail.com", true),
						new Student(2, "Bipin Raut", "bipin@gmail.com", true),
						new Student(3, "Rakshya Dangol", "rakshya@gmail.com", true),
						new Student(1, "Puskar Pandey", "puskar@gmail.com", true),
						new Student(2, "Bipin Raut", "bipin@gmail.com", true),
						new Student(3, "Rakshya Dangol", "rakshya@gmail.com", true)
						
				}
			);
		StudentTableModel model = new StudentTableModel(students);
		JTable table = new JTable(model);
		JScrollPane spane = new JScrollPane(table);
		Frame frame = new Frame("Default Table Model Example");
		frame.add(spane);
		frame.setVisible(true);
		
	
	}
}


class StudentTableModel extends DefaultTableModel{
	String[] cols= {"Sn.", "Name", "Email", "Active"};
	List<Student> students;
	public StudentTableModel(List<Student> students) {
		super();
		this.students = students;
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
	public int getColumnCount() {
		if(cols==null) {
			return 0;
		}
		else {
			return cols.length;
		}
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
		else {
			return students.get(row).isActive();
		}
	}
	
	
}
