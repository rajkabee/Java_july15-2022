package javaSE.dursikshya.example.swing.tables;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JScrollPane;
import javax.swing.JTable;

import javaSE.dursikshya.example.swing.Frame;

public class TableModelExample {
	public static void main(String[] args) {
		ArrayList<Student> students =(ArrayList<Student>) Arrays.asList(
			new Student[] {
					new Student(1, "Ramesh Parajuli", "Kathmandu", 9876866654l),
					new Student(2, "Ramesh Parajuli", "Kathmandu", 9876866654l),
					new Student(3, "Ramesh Parajuli", "Kathmandu", 9876866654l),
					new Student(4, "Ramesh Parajuli", "Kathmandu", 9876866654l),
					new Student(5, "Ramesh Parajuli", "Kathmandu", 9876866654l),
					new Student(6, "Ramesh Parajuli", "Kathmandu", 9876866654l),
					new Student(7, "Ramesh Parajuli", "Kathmandu", 9876866654l)
			}
		);
		
		StudentTableModel model = new StudentTableModel(students);
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		Frame frame = new Frame();
		frame.add(sp);
		frame.setVisible(true);
	}
}
