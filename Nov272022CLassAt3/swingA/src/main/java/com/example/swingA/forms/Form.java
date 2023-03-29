package com.example.swingA.forms;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.example.swingA.MyFrame;

public class Form {
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
		JLabel header = new JLabel("Form Example", 0);
		header.setFont(new Font("algerian", 0, 38));
		frame.add(header, BorderLayout.NORTH);
		JPanel form = new JPanel();
		form.setLayout(null);
		JLabel nameLabel = new JLabel("Name: ");
		nameLabel.setBounds(200, 50, 150, 20);
		form.add(nameLabel);
		JTextField nameField = new JTextField();
		nameField.setBounds(350, 50, 250, 20);
		form.add(nameField);
		JLabel descriptionLabel = new JLabel("Description: ");
		descriptionLabel.setBounds(200, 80, 150, 20);
		form.add(descriptionLabel);
		JTextArea descriptionArea = new JTextArea(3, 20);
		descriptionArea.setAutoscrolls(true);
		descriptionArea.setBounds(350, 80, 250, 60);
		descriptionArea.setLineWrap(true);
		descriptionArea.setWrapStyleWord(true);
		form.add(descriptionArea);
		
		frame.add(form, BorderLayout.CENTER);
		
		
		
		
		
		frame.setVisible(true);
	}
}
