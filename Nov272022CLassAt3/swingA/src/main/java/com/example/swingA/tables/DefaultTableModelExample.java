package com.example.swingA.tables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JScrollPane;
import javax.swing.JTable;

import com.example.swingA.MyFrame;

public class DefaultTableModelExample {
	static ArrayList<Student> students;
	public static void main(String[] args) {
		students = new ArrayList<Student>();
		List<Student> list = Arrays.asList(
				new Student(1, "Manisha Basnet", "manisha@gmail.com", true),
				new Student(2, "Krishna Prasad", "krishana@gmail.com", true),
				new Student(3, "Alina Shrestha", "alina@gmail.com", true),
				new Student(4, "Yamuna Shrestha", "yamuna@gmail.com", true),
				new Student(5, "Devi Pradhan", "devi@gmail.com", true),
				new Student(6, "Sudeep Ranabhat", "sudeep@gmail.com", true),
				new Student(7, "Rabina Adhikari", "rabina@gmail.com", true)
				);
		list.forEach(st->students.add(st));
		
		MyFrame frame = new MyFrame();
		MyTableModel model = new MyTableModel(students);
		JTable table = new JTable(model);
		JScrollPane sPane = new JScrollPane(table);
		frame.add(sPane, "Center");
		
		frame.setVisible(true);
	}
}
