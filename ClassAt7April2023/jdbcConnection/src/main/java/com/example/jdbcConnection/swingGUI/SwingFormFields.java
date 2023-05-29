package com.example.jdbcConnection.swingGUI;

import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class SwingFormFields extends JFrame{
	public SwingFormFields() {
		setTitle("Swing from Fields");
		setBounds(250, 100, 800, 500);
		setLayout(null);
		JLabel header = new JLabel("Form Header");
		header.setFont(new Font("Algerian", 0, 34));
		header.setBounds(300, 20, 300, 40);
		add(header);
		
		JLabel nameLabel = new JLabel("Name: ");
		nameLabel.setBounds(200, 100, 100, 20);
		add(nameLabel);
		
		JTextField nameField = new JTextField();
		nameField.setBounds(300, 100, 300, 20);
		add(nameField);
		
		JLabel emailLabel = new JLabel("Email: ");
		emailLabel.setBounds(200, 130, 100, 20);
		add(emailLabel);
		
		JTextField emailField = new JTextField();
		emailField.setBounds(300, 130, 300, 20);
		add(emailField);
		
		JLabel passwordLabel = new JLabel("Password: ");
		passwordLabel.setBounds(200, 160, 100, 20);
		add (passwordLabel);
		
		JPasswordField passwordField = new JPasswordField();
		passwordField.setBounds(300, 160, 300, 20);
		add (passwordField);
		
		JLabel genderLabel = new JLabel("Gender: ");
		genderLabel.setBounds(200, 190, 100, 20);
		add (genderLabel);
		
		JRadioButton maleRadioButton = new JRadioButton("Male");
		maleRadioButton.setBounds(300, 190, 100, 20);
		add(maleRadioButton);
		
		JRadioButton femaleRadioButton = new JRadioButton("Female");
		femaleRadioButton.setBounds(400, 190, 100, 20);
		add(femaleRadioButton);
		
		JRadioButton othersRadioButton = new JRadioButton("Others");
		othersRadioButton.setBounds(500, 190, 100, 20);
		add(othersRadioButton);
		
		ButtonGroup genderGroup = new ButtonGroup();
		genderGroup.add(maleRadioButton);
		genderGroup.add(femaleRadioButton);
		genderGroup.add(othersRadioButton);
		
		
		
		
		
		setVisible(true);
	}
	public static void main(String[] args) {
		SwingFormFields frame = new SwingFormFields();
	}
}
