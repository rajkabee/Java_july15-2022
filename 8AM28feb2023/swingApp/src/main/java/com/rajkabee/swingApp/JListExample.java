package com.rajkabee.swingApp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;

public class JListExample {
	static JList<String> list;
	static JList<String> list2;
	static JLabel label;
	public static void main(String[] args) {
		Frame frame = new Frame("JList Example");
		frame.setLayout(null);
		
		DefaultListModel<String> model = new DefaultListModel<String>();
		model.addElement("Java");
		model.addElement("Python");
		model.addElement("Ruby");
		model.addElement("C#");
		list = new JList<String>(model);
		list.setBounds(100, 100, 200, 100);
		frame.add(list);
		
		
		DefaultListModel<String> model2 = new DefaultListModel<String>();
		model2.addElement("Spring");
		model2.addElement("Django");
		model2.addElement("Laravel");
		model2.addElement(".Net");
		list2 = new JList<String>(model2);
		list2.setBounds(400, 100, 200, 100);
		frame.add(list2);
		
		JButton btn = new JButton("Click Me!");
		btn.setBounds(300, 220, 100, 30);
		btn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String language = list.getSelectedValue();
				String framework = list2.getSelectedValue();
				String msg = "the language is "+language+" and the framework id: "+framework;
				label.setText(msg);
			}
		});
		
		frame.add(btn);
		
		label = new JLabel("Text here!");
		label.setBounds(100, 280, 400, 20);
		frame.add(label);
		
		
		
		
		frame.setVisible(true);
	}
}
