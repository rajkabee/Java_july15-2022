package javaSE.dursikshya.example.swing.tables;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

public class StudentTableModel extends DefaultTableModel {
	String[] cols = {"id", "name", "address", "contact", "Active"};
	ArrayList<Student> students;
	public StudentTableModel(ArrayList<Student> students) {
		super();
		this.students = students;
	}
	@Override
	public int getColumnCount() {
			return cols.length;
		
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
			return boolean.class;
		}
		else {
			return String.class;
		}
	}
	@Override
	public String getColumnName(int column) {
		return cols[column];
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
			return students.get(row).getAddress();
		}
		else if(col==3) {
			return students.get(row).getContact();
		}
		else if(col==4) {
			return students.get(row).isActive();
		}
		else {
			return null;
		}
	}
}
