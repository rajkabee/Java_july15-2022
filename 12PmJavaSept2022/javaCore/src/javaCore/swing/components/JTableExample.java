package javaCore.swing.components;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableExample extends JFrame {
	public static void main(String[] args) {
		JTableExample tableFrame = new JTableExample();
	}
	public JTableExample() {
		setTitle("JTable Example");
		setBounds(200,100,800,500);
		setDefaultCloseOperation(3);
		
		String[] cols = {"Name", "Address", "Email"};
		String[][] data = {
				{"Pravin Rai", "Morang", "pravinRai@gmail.com"},
				{"Om Gurung", "Gorkha", "omGurung@gmail.com"},
				{"Pradip KC", "Bhaisepati", "pradipkc@gmail.com"}
		};
		JTable table = new JTable(data, cols);
		JScrollPane pane = new JScrollPane(table);
		add(table);
		
		setVisible(true);
	}
}
