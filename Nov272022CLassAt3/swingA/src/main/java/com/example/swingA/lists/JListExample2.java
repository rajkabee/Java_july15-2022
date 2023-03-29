package com.example.swingA.lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

public class JListExample2 extends JFrame implements ActionListener{
	JList<String> list;
	JList<String> list2;
	JLabel label;
	public JListExample2() {
		setBounds(200,100,800,500);
		setDefaultCloseOperation(3);
		setLayout(null);
		DefaultListModel<String> l1 = new DefaultListModel<String>();
		l1.addElement("Java");
		l1.addElement("PHP");
		l1.addElement("Python");
		l1.addElement("JavaScript");
		list = new JList<String>(l1);
		list.setBounds(100,100,200,100);
		add(list);
		
		
		DefaultListModel<String> l2 = new DefaultListModel<String>();
		l2.addElement("Spring");
		l2.addElement("Laravel");
		l2.addElement("Django");
		l2.addElement("Angular");
		list2 = new JList<String>(l2);
		list2.setBounds(400,100,200,100);
		add(list2);
		label=new JLabel("Hello");
		label.setBounds(100, 250, 500, 30);
		add(label);
		
		JButton btn = new JButton("select");
		btn.setBounds(200, 200, 300, 30);
		btn.addActionListener(this);
		add(btn);
		setVisible(true);
		
		
		
	}
	
	public static void main(String[] args) {
		new JListExample2();
	}

	public void actionPerformed(ActionEvent e) {
		String s1 = list.getSelectedValue();
		String s2 = list2.getSelectedValue();
		label.setText("Programming language selected: "+s1+". framework selected : "+s2);
	}
}
