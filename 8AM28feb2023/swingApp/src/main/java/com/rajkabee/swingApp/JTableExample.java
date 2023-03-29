package com.rajkabee.swingApp;

import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableExample {
	public static void main(String[] args) {
		Frame frame = new Frame("JTable Example");
		String[] cols= {"Sn." , "Name", "Email"};
		String[][] data = {
				{"1", "Subodh Subedi", "Subodh@gmail.com"},
				{"2", "Sangam Subedi", "Sangam@gmail.com"},
				{"3", "Prajwol Subedi", "Prajwol@gmail.com"},
				{"4", "Aashish Dhami", "Aashish@gmail.com"}
		};
		JTable table = new JTable(data, cols);
		JScrollPane pane = new JScrollPane(table);
		frame.add(pane);
		
		
		frame.setVisible(true);
	}
}
