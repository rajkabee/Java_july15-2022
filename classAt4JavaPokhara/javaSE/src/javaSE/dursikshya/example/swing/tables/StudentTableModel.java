package javaSE.dursikshya.example.swing.tables;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

public class StudentTableModel extends DefaultTableModel {
	String[] cols = {"id", "name", "address", "contact"};
	ArrayList<Student> students = new ArrayList<>();
	public StudentTableModel(ArrayList<Student> students) {
		super();
		this.students = students;
	}
	@Override
	public int getColumnCount() {
		if(cols.length!=0) {
			return cols.length;
		}
		else return 0;
	}
	@Override
	public Class<?> getColumnClass(int col) {
		if(col==0) {
			return Integer.class;
		}
		else if(col==3) {
			return Long.class;
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
		return students.size();
	}
	@Override
	public Object getValueAt(int row, int col) {
		if(col==0) {
			return students.get(row).getId();
		}
		else if(col==1) {
			return students.get(col).getName();
		}
		else if(col==2) {
			return students.get(col).getAddress();
		}
		else if(col==3) {
			return students.get(col).getContact();
		}
		else {
			return null;
		}
	}
}
