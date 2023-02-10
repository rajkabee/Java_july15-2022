package com.example.swingPractice.jTableExamples1;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableExample extends JFrame{
	public JTableExample() {
		setDefaultCloseOperation(3);
		setTitle("JTable Example");
		setIconImage(new ImageIcon("logo.png").getImage());
		setBounds(300,200, 800,500);
		String[] cols = {"Sn.", "Product Name", "Price"};
		String[][] products = {
				{"1", "Pendrive 64gb", "1800"},
				{"2", "ssd 512GB", "6000"},
				{"3", "Nvme SSD 1TB", "11000"},
				{"4", "HDD 1TB", "8000"},
				{"5", "Caddy", "550"}
		};
		JTable table = new JTable(products,cols);
		JScrollPane scrollPane = new JScrollPane(table);
		//scrollPane.add(table);
		
		
		add(scrollPane);
		//add(table);
		
		
		
	}
	public static void main(String[] args) {
		JTableExample tableWindow = new JTableExample();
		tableWindow.setVisible(true);
	}
}
