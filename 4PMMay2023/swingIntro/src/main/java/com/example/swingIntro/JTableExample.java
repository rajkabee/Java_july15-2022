package com.example.swingIntro;

import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableExample {
	public static void main(String[] args) {
		Frame frame  = new Frame();
		String[] col = {"Sn.", "Name", "Contact"};
		String[][] data = {
				{"1", "Ramesh Thapa", "9878645543"},
				{"2", "Pratyush Bhandari", "9878645543"},
				{"3", "Ramila Shrestha", "9864554424"},
				{"4", "Dipak Thapa", "9878645231"},
				{"5", "Priyanka Shrestha", "9878642343"},
				{"6", "Manju Tamang", "9878623432"},
				{"7", "Manisha Basnet", "9878664656"},
				{"8", "Bandana Adhikari", "9878656675"},
		};
		JTable table = new JTable(data, col);
		JScrollPane scrollPane = new JScrollPane(table);
		//scrollPane.add(table);
		frame.add(scrollPane);
		frame.setVisible(true);
	}
}
