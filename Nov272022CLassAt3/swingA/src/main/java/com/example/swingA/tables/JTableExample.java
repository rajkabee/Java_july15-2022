package com.example.swingA.tables;

import javax.swing.JScrollPane;
import javax.swing.JTable;

import com.example.swingA.MyFrame;

public class JTableExample {
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
		frame.setLayout(null);
		String[] cols = {"Sn.", "Name", "email"};
		String[][] data = {
				{"1", "Manisha Basnet", "manisha@gmail.com"},
				{"2", "Rabi Koirala", "rabi@gmail.com"},
				{"3", "Yamuna Shrestha", "yamuna@gmail.com"},
				{"4", "Smriti Lamichhane", "smriti@gmail.com"},
				{"1", "Manisha Basnet", "manisha@gmail.com"},
				{"2", "Rabi Koirala", "rabi@gmail.com"},
				{"3", "Yamuna Shrestha", "yamuna@gmail.com"},
				{"4", "Smriti Lamichhane", "smriti@gmail.com"},
				{"1", "Manisha Basnet", "manisha@gmail.com"},
				{"2", "Rabi Koirala", "rabi@gmail.com"},
				{"3", "Yamuna Shrestha", "yamuna@gmail.com"},
				{"4", "Smriti Lamichhane", "smriti@gmail.com"},
				{"1", "Manisha Basnet", "manisha@gmail.com"},
				{"2", "Rabi Koirala", "rabi@gmail.com"},
				{"3", "Yamuna Shrestha", "yamuna@gmail.com"},
				{"4", "Smriti Lamichhane", "smriti@gmail.com"},
		};
		JTable table = new JTable(data, cols);
		JScrollPane sPane = new JScrollPane(table);
		sPane.setBounds(100,100,600,200);
		frame.add(sPane);
		
		frame.setVisible(true);
	}
}
