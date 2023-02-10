package javaBasics.swing.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

import org.w3c.dom.css.RGBColor;

import javaBasics.swing.jPanels.JPanelExample;

public class JLabelExample {
	static JTextField nameField;
	static JTextField emailField;
	static JPasswordField passwordField;
	static JFrame frame;
	public static void main(String[] args) {
		frame = new JFrame("JLabel Example");
		frame.setFont(new Font("Arial",1, 24));
		frame.setBounds(300, 150, 800, 500);
		frame.setLayout(null);
		//set default font style
		UIManager.put("Label.font", new FontUIResource(new Font ("Helvetica", Font.BOLD, 20)));
		UIManager.put("Button.font", new FontUIResource(new Font ("Helvetica", Font.BOLD, 24)));
		
		JLabel label1 = new JLabel("Login Form", SwingConstants.CENTER);
		label1.setFont(new Font("Algerian",1, 56));
		label1.setForeground(Color.ORANGE);
		label1.setBounds(200,100,400,60);
		frame.add(label1);
		
		JLabel nameLabel = new JLabel("Name:");
		nameLabel.setBounds(150,200,150, 20);
		frame.add(nameLabel);
		nameField = new JTextField();
		nameField.setBounds(350, 200, 300, 20);
		frame.add(nameField);
		
		JLabel emailLabel= new JLabel("Email:");
		emailLabel.setBounds(150,260,150, 20);
		frame.add(emailLabel);
		emailField = new JTextField();
		emailField.setBounds(350, 260, 300, 20);
		frame.add(emailField);
		
		JLabel passwordLabel= new JLabel("Password:");
		passwordLabel.setBounds(150,320,150, 20);
		frame.add(passwordLabel);
		passwordField = new JPasswordField();
		passwordField.setBounds(350, 320, 300, 20);
		frame.add(passwordField);
		
		JButton submitButton = new JButton("Submit");
		submitButton.setBackground(Color.green);
		submitButton.setForeground(Color.WHITE);
		submitButton.setBounds(150, 380, 500, 30);
		frame.add(submitButton);
		
		submitButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JPanelExample panels = new JPanelExample();
				frame.dispose();
				/*
				JDialog dialog = new JDialog(
							frame, 
							"message", 
							true
						);
				dialog.add(new JLabel(nameField.getText()+"\t"+emailField.getText()));
				dialog.setBounds(400, 200, 200, 100);
				dialog.setVisible(true);
				*/
			}
		});
		
		frame.setVisible(true);
	}
}
