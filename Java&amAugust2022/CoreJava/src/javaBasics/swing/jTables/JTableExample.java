package javaBasics.swing.jTables;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableExample {
	public static void main(String[] args) {
		JFrame f = new JFrame("JTable Example");
		String[][] data = {
				{
					"1",
					"Shoes",
					"2450"
				},
				{
					"2",
					"Sneakers",
					"3000"
				},
				{
					"3",
					"Loafers",
					"2500"
				},
				{
					"4",
					"Trekking Boots",
					"6700"
				}
		};
		String[] cols = {"Sn.", "Product", "Price"};
		JTable table = new JTable(data, cols);
		JScrollPane pane = new JScrollPane(table);
		f.add(pane);
		f.pack();
		
		
		
		
		
		f.setVisible(true);
	}
}
