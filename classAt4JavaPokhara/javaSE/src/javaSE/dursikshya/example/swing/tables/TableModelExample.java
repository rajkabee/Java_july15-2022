package javaSE.dursikshya.example.swing.tables;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JScrollPane;
import javax.swing.JTable;

import javaSE.dursikshya.example.swing.Frame;

public class TableModelExample {
	public static void main(String[] args) {
		ArrayList<Student> students =new ArrayList<Student>( Arrays.asList(
			new Student[] {
					new Student(1, "Ramesh Parajuli", "Kathmandu", 9876866654l, true),
					new Student(2, "Rahul Sharma", "Itahari", 9887663622l, true),
					new Student(3, "Binita Karki", "Bhairahawa", 9876123213l, false),
					new Student(4, "Sharmila Khadka", "Biratnagar", 98768667658l, false),
					new Student(5, "Preety Pradhan", "Butwol", 9876864533l, false),
					new Student(6, "Jamuna Shah", "Pokhara", 9876865555l, true),
					new Student(7, "Pradip Shrestha", "Lalitpur", 9876846654l, false)
			}
		));
		
		students.forEach(System.out::println);
		StudentTableModel model = new StudentTableModel(students);
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		Frame frame = new Frame();
		frame.add(sp);
		frame.setVisible(true);
	}
}
