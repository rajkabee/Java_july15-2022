package com.example.swingA.lists;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;

public class JListExample extends JFrame{
	public JListExample() {
		setBounds(200,100,800,500);
		setDefaultCloseOperation(3);
		setLayout(null);
		DefaultListModel<String> l1 = new DefaultListModel<String>();
		l1.addElement("Java");
		l1.addElement("PHP");
		l1.addElement("Python");
		l1.addElement("JavaScript");
		JList<String> list = new JList<String>(l1);
		list.setBounds(100,100,200,100);
		add(list);
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new JListExample();
	}
}
