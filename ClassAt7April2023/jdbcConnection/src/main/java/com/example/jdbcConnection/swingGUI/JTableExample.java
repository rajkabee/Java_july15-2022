package com.example.jdbcConnection.swingGUI;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableExample {
	public static void main(String[] args) {
		String[] cols = {"Sn.", "Name", "Email", "Active"};
		String[][] data = {
				{"1", "Satrughan Kamat", "satrughan@gmail.com", "true"},
				{"2", "Sudip Bista", "sudip@gmail.com", "true"},
				{"3", "Arjun Thapamagar", "arjun@gmail.com", "true"},
				{"4", "Rita Maharjan", "rita@gmail.com", "true"},
				{"5", "Anamika Dahal", "anamika@gmail.com", "true"},
				{"6", "Sikshya Dhital", "sikshya@gmail.com", "true"},
				{"7", "Pinky Thakur", "pinky@gmail.com", "true"},
		};
		JFrame frame = new JFrame("JTable Example");
		frame.setBounds(250,100, 800,500);
		frame.setDefaultCloseOperation(3);
		JTable table = new JTable(data, cols);
		JScrollPane scrollPane = new JScrollPane(table);
		//scrollPane.add(table);
		frame.add(scrollPane);
		
		frame.setVisible(true);
	}
}
