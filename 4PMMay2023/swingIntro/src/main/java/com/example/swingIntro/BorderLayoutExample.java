package com.example.swingIntro;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class BorderLayoutExample implements ActionListener{
	static JTextField nameField;
	public BorderLayoutExample() {
		Frame frame = new Frame();
		//frame.setLayout(new BorderLayout());
		frame.setTitle("JMenuBar Example");
		JMenuItem home = new JMenuItem("Home");
		JMenuItem products = new JMenuItem("Products");
		JMenuItem purchase = new JMenuItem("Purchase");
		JMenuItem sales = new JMenuItem("Sales");
		JMenuItem finance = new JMenuItem("Finance");
		JMenuItem contact = new JMenuItem("Contact");
		JMenuItem aboutUs = new JMenuItem("About Us");
		JMenu services = new JMenu("Services");
		services.add(purchase);
		services.add(sales);
		services.add(finance);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
		menuBar.add(home);
		menuBar.add(products);
		menuBar.add(services);
		menuBar.add(contact);
		menuBar.add(aboutUs);
		
		frame.setJMenuBar(menuBar);
		//frame.add(new JButton("Frame Header"), BorderLayout.NORTH);
		JPanel navbar = new JPanel();
		navbar.setBackground(Color.GRAY);
		navbar.setLayout(new BoxLayout(navbar,BoxLayout.Y_AXIS));
		JButton btn1 = new JButton("Some Text");
		JButton btn2 = new JButton("Some Text");
		JButton btn3 = new JButton("Some Text");
		JButton btn4 = new JButton("Some Text");
		JButton btn5 = new JButton("Some Text");
		JButton btn6 = new JButton("Some Text");
		JButton btn7 = new JButton("Some Text");
		navbar.add(btn1);
		navbar.add(btn2);
		navbar.add(btn3);
		navbar.add(btn4);
		navbar.add(btn5);
		navbar.add(btn6);
		navbar.add(btn7);
		frame.add(navbar, "West");
		
		JTabbedPane tabbedPane = new JTabbedPane();
		
		

		JPanel formPanel = new JPanel();
		formPanel.setLayout(null);
		JLabel formHeader = new JLabel("Personal Information");
		formHeader.setFont(new Font("Algerian", 1, 36));
		formHeader.setBounds(65,0,700, 60);
		formHeader.setBackground(Color.GRAY);
		formHeader.setForeground(Color.DARK_GRAY);
		formPanel.add(formHeader);
		
	
		JLabel nameLabel = new JLabel("Name: ");
		nameLabel.setBounds(115, 70, 150, 20);
		formPanel.add(nameLabel);
		nameField = new JTextField();
		nameField.setBounds(215, 70, 250, 20);
		formPanel.add(nameField);
		
		
		
		JLabel emailLabel = new JLabel("Email: ");
		emailLabel.setBounds(115, 100, 150, 20);
		formPanel.add(emailLabel);
		JTextField emailField = new JTextField();
		emailField.setBounds(215, 100, 250, 20);
		formPanel.add(emailField);
		
		JLabel passwordLabel = new JLabel("Password: ");
		passwordLabel.setBounds(115, 130, 150, 20);
		formPanel.add(passwordLabel);
		JPasswordField passwordField = new JPasswordField();
		passwordField.setBounds(215, 130, 250, 20);
		formPanel.add(passwordField);
		
		JLabel genderLabel = new JLabel("Gender: ");
		genderLabel.setBounds(115, 160, 150, 20);
		formPanel.add(genderLabel);
		ButtonGroup bg = new ButtonGroup();
		JRadioButton maleRadio = new JRadioButton("Male");
		maleRadio.setBounds(215, 160, 80, 20);
		formPanel.add(maleRadio);
		JRadioButton femaleRadio = new JRadioButton("Female");
		femaleRadio.setBounds(295, 160, 80, 20);
		formPanel.add(femaleRadio);
		JRadioButton othersRadio = new JRadioButton("Others");
		othersRadio.setBounds(375, 160, 80, 20);
		formPanel.add(othersRadio);
		bg.add(maleRadio); bg.add(femaleRadio); bg.add(othersRadio);
		
		JLabel languageLabel = new JLabel("Language: ");
		languageLabel.setBounds(115, 190, 150, 20);
		formPanel.add(languageLabel);
		JCheckBox englishCheckBox = new JCheckBox("English");
		englishCheckBox.setBounds(215, 190, 80, 20);
		formPanel.add(englishCheckBox);
		JCheckBox frenchCheckBox = new JCheckBox("French");
		frenchCheckBox.setBounds(295, 190, 80, 20);
		formPanel.add(frenchCheckBox);
		JCheckBox spanishCheckBox = new JCheckBox("Spanish");
		spanishCheckBox.setBounds(375, 190, 80, 20);
		formPanel.add(spanishCheckBox);
		
		JLabel nationalityLabel = new JLabel("Nationality: ");
		nationalityLabel.setBounds(115, 220, 150, 20);
		formPanel.add(nationalityLabel);
		String[] countries = {"Nepal", "India", "Japan", "USA","UK", "Australia"};
		JComboBox<String> nationalityComboBox = new JComboBox<String>(countries);
		nationalityComboBox.setBounds(215, 220, 250, 20);
		formPanel.add(nationalityComboBox);
		
		
		JButton submitButton = new JButton("Submit");
		submitButton.setBounds(115, 260, 350, 40);
		submitButton.setForeground(Color.WHITE);
		submitButton.setBackground(Color.getHSBColor(0.3f, 1f, 0.5f));
		submitButton.setFont(new Font("Times New Roman", 1, 28));
		submitButton.addActionListener(this);
		formPanel.add(submitButton);
		
		
		tabbedPane.add(formPanel, "User Registration Form");
		
		
		
		JPanel homePanel = new JPanel();
		tabbedPane.add(homePanel, "Home");
		JPanel productsPanel = new JPanel();
		tabbedPane.add(productsPanel, "Products");
		frame.add(tabbedPane, "Center");
		
		JPanel iconPanel = new JPanel();
		iconPanel.setLayout(new GridLayout(3,3));
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		JButton b6 = new JButton("6");
		JButton b7 = new JButton("7");
		JButton b8 = new JButton("8");
		iconPanel.add(b1);
		iconPanel.add(b2);
		iconPanel.add(b3);
		iconPanel.add(b4);
		iconPanel.add(b5);
		iconPanel.add(b6);
		iconPanel.add(b7);
		iconPanel.add(b8);
		frame.add(iconPanel, "East");
		
		JButton footer = new JButton("Footer");
		frame.add(footer, "South");
		
		
		
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		String name = nameField.getText();
		System.out.println(name);
		
	}
	
	public static void main(String[] args) {
		BorderLayoutExample ble = new BorderLayoutExample();
	}
}
