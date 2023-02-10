package com.example.swingPractice;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ActionListenerExample {
	static JTextField titleField;
	static JLabel title;
	public static void main(String[] args) {
		JFrame frame = new JFrame("Action Listener Example");
		frame.setBounds(300,200,800,500);
		frame.setDefaultCloseOperation(3);
		frame.setLayout(null);
		title = new JLabel("Title");
		title.setFont(new Font("serif", 1, 56));
		title.setBounds(100, 100, 600, 60);
		frame.add(title);
		
		titleField = new JTextField();
		titleField.setBounds(200, 250, 400, 20);
		frame.add(titleField);
		
		JButton button = new JButton("Set Title");
		button.setBounds(200, 280, 400, 30);
		button.setFont(new Font("serif", 1, 26));
		frame.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				title.setText(titleField.getText());
				System.out.println(titleField.getText());
				titleField.setText("");
			}
		});
		frame.setVisible(true);
	}
}
