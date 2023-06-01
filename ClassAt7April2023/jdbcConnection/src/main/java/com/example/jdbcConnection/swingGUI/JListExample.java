package com.example.jdbcConnection.swingGUI;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class JListExample extends JFrame implements ActionListener {

	JList<String> langList;
	
	public JListExample() {
		setBounds(250,100,800,500);
		setDefaultCloseOperation(3);
		setLayout(null);
		String[] languages = {"Java", "PHP", "Perl", "Groovy", "Javascript"};
		langList = new JList<>(languages);
		langList.setBounds(100, 100, 200, 120);
		add(langList);
		JButton btn = new JButton("Click Me!");
		btn.setBounds(100, 240, 200, 25);
		btn.addActionListener(this);
		add(btn);
		
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String language = this.langList.getSelectedValue();
		JOptionPane.showMessageDialog(this, "Selected Lamnguage : "+language);
		
	}
	public static void main(String[] args) {
		JListExample frame = new JListExample();
	}

}
