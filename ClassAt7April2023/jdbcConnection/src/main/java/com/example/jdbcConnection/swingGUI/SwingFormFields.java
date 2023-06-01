package com.example.jdbcConnection.swingGUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class SwingFormFields extends JFrame implements ActionListener{
	static JTextField nameField = new JTextField();
	static JTextField emailField = new JTextField();
	static JPasswordField passwordField = new JPasswordField();
	static JRadioButton maleRadioButton = new JRadioButton("Male");
	static JRadioButton femaleRadioButton = new JRadioButton("Female");
	static JRadioButton othersRadioButton = new JRadioButton("Others");
	static JCheckBox javaCheckBox = new JCheckBox("Java");
	static JCheckBox phpCheckBox = new JCheckBox("PHP");
	static JCheckBox pythonCheckBox  = new JCheckBox("Python");
	static String[] academicsList = {"Secondary", "High School", "College", "Masters", "PHD"};
	static JComboBox<String> academicsComboBox = new JComboBox<>(academicsList);
	
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
		
		nameField = new JTextField();
		nameField.setBounds(300, 100, 300, 20);
		add(nameField);
		
		JLabel emailLabel = new JLabel("Email: ");
		emailLabel.setBounds(200, 130, 100, 20);
		add(emailLabel);
		
		emailField = new JTextField();
		emailField.setBounds(300, 130, 300, 20);
		add(emailField);
		
		JLabel passwordLabel = new JLabel("Password: ");
		passwordLabel.setBounds(200, 160, 100, 20);
		add (passwordLabel);
		
		passwordField = new JPasswordField();
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
		
		JLabel languageLabel = new JLabel("Interested Languages: ");
		languageLabel.setBounds(200, 220, 100, 20);
		add (languageLabel);
		
		JCheckBox javaCheckBox = new JCheckBox("Java");
		javaCheckBox.setBounds(300, 220, 100, 20);
		add(javaCheckBox);
		JCheckBox phpCheckBox = new JCheckBox("PHP");
		phpCheckBox.setBounds(400, 220, 100, 20);
		add(phpCheckBox);
		JCheckBox pythonCheckBox = new JCheckBox("Python");
		pythonCheckBox.setBounds(500, 220, 100, 20);
		add(pythonCheckBox);
		
		JLabel academicsLabel = new JLabel("Academics: ");
		academicsLabel.setBounds(200, 250, 100, 20);
		add (academicsLabel);
		
		String[] levels = {"Secondary", "High School", "College", "Masters", "PHD"};
		JComboBox<String> academicsComboBox = new JComboBox<>(levels);
		academicsComboBox.setBounds(300, 250, 300, 20);
		add(academicsComboBox);
		
		JButton submitBtn = new JButton("<html><i>Submit</i></html>");
		submitBtn.setBounds(250, 280, 300, 30);
		submitBtn.setBackground(Color.getHSBColor(240, 120, 70));
		submitBtn.setFont(new Font("Calibri", 1, 24));
		submitBtn.setForeground(Color.WHITE);
		submitBtn.setVerticalAlignment(SwingConstants.BOTTOM);
		submitBtn.addActionListener(this);
		add(submitBtn);
		
		
		
		setVisible(true);
	}
	public static void main(String[] args) {
		SwingFormFields frame = new SwingFormFields();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JFrame op = new JFrame();
		String name = this.nameField.getText();
		String email = this.emailField.getText();
		String password = this.passwordField.getPassword().toString();
		String gender = this.maleRadioButton.isSelected()?"MALE":this.femaleRadioButton.isSelected()?"FEMALE":"Others";
		String academics = this.academicsComboBox.getSelectedItem().toString();
		System.out.println(name+" "+email+" "+password+" "+gender+" "+academics);
		JOptionPane.showMessageDialog(op, name+" "+email+" "+password+" "+gender+" "+academics);
		op.setVisible(true);
		
	}
}
