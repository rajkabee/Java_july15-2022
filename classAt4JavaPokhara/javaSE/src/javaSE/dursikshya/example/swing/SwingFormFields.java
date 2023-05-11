package javaSE.dursikshya.example.swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class SwingFormFields {
	static Frame frame;
	static JTextField nameField;
	public static void main(String[] args) {
		frame = new Frame();
		JPanel headerPanel = new JPanel();
		//headerPanel.setOpaque(true);
		//headerPanel.setBackground(Color.ORANGE);
		JLabel header = new JLabel("Registration Form");
		header.setFont(new Font("algerian", 0, 36));
		headerPanel.add(header);
		frame.add(headerPanel, "North");
		
		JPanel formPanel = new JPanel();
		formPanel.setLayout(null);
		
		JLabel nameLabel = new JLabel("Full Name: ");
		nameLabel.setBounds(150, 50, 150, 20);
		formPanel.add(nameLabel);
		
		nameField = new JTextField();
		nameField.setBounds(300, 50, 300, 20);
		formPanel.add(nameField);
		
		JLabel emailLabel = new JLabel("Email: ");
		emailLabel.setBounds(150, 80, 150, 20);
		formPanel.add(emailLabel);
		
		JTextField emailField = new JTextField();
		emailField.setBounds(300, 80, 300, 20);
		formPanel.add(emailField);
		
		JLabel genderLabel = new JLabel("Gender: ");
		genderLabel.setBounds(150, 110, 150, 20);
		formPanel.add(genderLabel);
		
		ButtonGroup bg = new ButtonGroup();
		JRadioButton maleRB = new JRadioButton("Male");
		maleRB.setBounds(300, 110, 100, 20);
		bg.add(maleRB);
		formPanel.add(maleRB);
		JRadioButton femaleRB = new JRadioButton("Female");
		femaleRB.setBounds(400, 110, 100, 20);
		bg.add(femaleRB);
		formPanel.add(femaleRB);
		JRadioButton othersRB = new JRadioButton("Others");
		othersRB.setBounds(500, 110, 100, 20);
		bg.add(othersRB);
		formPanel.add(othersRB);
		
		JLabel subjectsLabel = new JLabel("Interested Subjects: ");
		subjectsLabel.setBounds(150, 140, 150, 20);
		formPanel.add(subjectsLabel);
		
		JCheckBox javaCB = new JCheckBox("Java");
		JCheckBox pythonCB = new JCheckBox("Python");
		JCheckBox javaScriptCB = new JCheckBox("JavaScript");
		javaCB.setBounds(300, 140, 100, 20);
		pythonCB.setBounds(400, 140, 100, 20);
		javaScriptCB.setBounds(500, 140, 100, 20);
		formPanel.add(javaCB);
		formPanel.add(pythonCB);
		formPanel.add(javaScriptCB);
		
		JLabel countryLabel = new JLabel("Country: ");
		countryLabel.setBounds(150, 170, 150, 20);
		formPanel.add(countryLabel);
		
		String countries[] = {"Nepal", "India", "Bangaladesh", "Bhutan", "USA", "UK","France"};
		JComboBox<String> countryCombo = new JComboBox<>(countries);
		countryCombo.setBounds(300, 170, 200, 20);
		formPanel.add(countryCombo);
		
		JButton submitButton = new JButton("Submit");
		submitButton.setFont(new Font("calibri", 1, 24));
		submitButton.setBounds(250, 250, 300, 30);
		submitButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame,"Hello, "+nameField.getText(),"Alert",JOptionPane.WARNING_MESSAGE);     
				
				
			}
		});
		
		
		formPanel.add(submitButton);
		
		
		frame.add(formPanel, "Center");
		frame.setVisible(true);
	}
}
