package javaSE.dursikshya.example.swing.tables;

import javax.swing.JScrollPane;
import javax.swing.JTable;

import javaSE.dursikshya.example.swing.Frame;

public class JTableExample {
	
	
	
	public JTableExample() {
		super();
		Frame frame = new Frame();
		String[][] students = {
				{"1", "Alex Jones", "California"},
				{"2", "Bill Black", "California"},
				{"3", "John Doe", "California"},
				{"4", "Julie Christain", "California"},
				{"5", "Ben Allen", "California"},
				{"6", "Sruti Shah", "California"}
		};
		String[] cols =  {"id", "name", "address"};
		JTable table = new JTable(students,cols);
		JScrollPane sp = new JScrollPane(table);
		frame.add(sp);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		JTableExample example = new JTableExample();
		
		
	}
	
}
