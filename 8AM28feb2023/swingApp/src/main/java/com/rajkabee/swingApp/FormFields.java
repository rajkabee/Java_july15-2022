package com.rajkabee.swingApp;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FormFields{
	static JTextField emailField;
	public static void main(String[] args) {
		
		
		Frame frame = new Frame("Form Fields");
		JButton mainHeader = new JButton("Header");
		JButton footer = new JButton("Footer");
		frame.add(mainHeader, "North");
		frame.add(footer, "South");
		
		JPanel formPanel = new JPanel();
		formPanel.setLayout(null);
		JLabel header = new JLabel("Sign Up Form");
		header.setBounds(300,50,400, 50);
		header.setFont(new Font("Calibri", 0, 36));
		formPanel.add(header);
		
		JLabel nameLabel = new JLabel("Name: ");
		nameLabel.setBounds(200,100,150, 20);
		formPanel.add(nameLabel);
		final JTextField nameField = new JTextField();
		nameField.setBounds(350,100,250, 20);
		formPanel.add(nameField);
		
		JLabel emailLabel = new JLabel("Email: ");
		emailLabel.setBounds(200,130,150, 20);
		formPanel.add(emailLabel);
		emailField = new JTextField();
		emailField.setBounds(350,130,250, 20);
		formPanel.add(emailField);
		
		JLabel descriptionLabel = new JLabel("Description: ");
		descriptionLabel.setBounds(200,160,150, 20);
		formPanel.add(descriptionLabel);
		JTextArea descriptionField = new JTextArea();
		JScrollPane descriptionPane = new JScrollPane(descriptionField);
		descriptionPane.setBounds(350,160,250,50);
		formPanel.add(descriptionPane);
		
		JLabel passwordLabel = new JLabel("Password: ");
		passwordLabel.setBounds(200,220,150, 20);
		formPanel.add(passwordLabel);
		JPasswordField passwordField = new JPasswordField();
		passwordField.setBounds(350,220,250, 20);
		formPanel.add(passwordField);
		
		JLabel password2Label = new JLabel("Confirm Password: ");
		password2Label.setBounds(200,250,150, 20);
		formPanel.add(password2Label);
		JPasswordField password2Field = new JPasswordField();
		password2Field.setBounds(350,250,250, 20);
		formPanel.add(password2Field);
		
		JLabel languageLabel = new JLabel("Languages: ");
		languageLabel.setBounds(200,280,150, 20);
		formPanel.add(languageLabel);
		JCheckBox javaCheckbox = new JCheckBox("Java");
		javaCheckbox.setBounds(350, 280, 100, 20);
		formPanel.add(javaCheckbox);
		JCheckBox phpCheckbox = new JCheckBox("PHP");
		phpCheckbox.setBounds(450, 280, 100, 20);
		formPanel.add(phpCheckbox);
		JCheckBox pythonCheckbox = new JCheckBox("Python");
		pythonCheckbox.setBounds(550, 280, 100, 20);
		formPanel.add(pythonCheckbox);
		
		
		JLabel genderLabel = new JLabel("Gender: ");
		genderLabel.setBounds(200,310,150, 20);
		formPanel.add(genderLabel);
		JRadioButton maleRadioButton = new JRadioButton("Male");
		maleRadioButton.setSelected(true);
		maleRadioButton.setBounds(350, 310, 100, 20);
		JRadioButton femaleRadioButton = new JRadioButton("Female");
		femaleRadioButton.setBounds(450, 310, 100, 20);
		JRadioButton othersRadioButton = new JRadioButton("Others");
		othersRadioButton.setBounds(550, 310, 100, 20);
		ButtonGroup genderButtonGroup = new ButtonGroup();
		genderButtonGroup.add(maleRadioButton);
		genderButtonGroup.add(femaleRadioButton);
		genderButtonGroup.add(othersRadioButton);
		formPanel.add(maleRadioButton);
		formPanel.add(femaleRadioButton);
		formPanel.add(othersRadioButton);
		
		JLabel countryLabel = new JLabel("Country: ");
		countryLabel.setBounds(200,340,150, 20);
		formPanel.add(countryLabel);
		String country[]={"Nepal","India","Aus","U.S.A","England","Newzealand"};      
		JComboBox<String> countryComboBox = new JComboBox<String>(country);
		countryComboBox.setBounds(350,340,250, 20);
		formPanel.add(countryComboBox);
		
		JButton submitButton = new JButton("Submit");
		submitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = nameField.getText();
				String email = emailField.getText();
				System.out.println(name+"\n"+email);
			}
			
		});
		
		
		
		
		submitButton.setBounds(250, 370, 300, 30);
		submitButton.setBackground(new Color(0, 200, 0));
		submitButton.setForeground(Color.WHITE);
		submitButton.setFont(new Font("Calibri", 1, 24));
		formPanel.add(submitButton);
		
		frame.add(formPanel, "Center");
		frame.setVisible(true);
	}
}
