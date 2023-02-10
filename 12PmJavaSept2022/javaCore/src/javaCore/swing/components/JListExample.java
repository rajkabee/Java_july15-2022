package javaCore.swing.components;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;

public class JListExample extends JFrame{
	public static void main(String[] args) {
		JListExample frame = new JListExample();
	}
	
	public JListExample() {
		setTitle("JList Example");
		setBounds(200,100,800,500);
		setDefaultCloseOperation(3);
		setLayout(null);
		
		String[] names = {"Prabin Rai", "Om Gurung", "Pradip KC"};
		JList<String> nameList = new JList(names);
		nameList.setBounds(100, 50, 200, 100);
		add(nameList);
		
		DefaultListModel<String> listModel = new DefaultListModel<>();
		listModel.addElement("Java");
		listModel.addElement("Angular");
		listModel.addElement("JavaScript");
		listModel.addElement("Groovy");
		JList courseList = new JList(listModel);
		courseList.setBounds(400, 50, 200, 100);
		add(courseList);
		
		setVisible(true);
		
	}
}
