package com.examples.j2se.swing;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ActionListenerExample extends JFrame implements ActionListener{
	JTextField nameField;
	public ActionListenerExample() {
		setTitle("ActionListenerExample");
		setDefaultCloseOperation(3);
		setBounds(350, 100, 800, 500);
		Container contentPane = getContentPane();
		setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		JPanel namePanel = new JPanel();
		namePanel.setLayout(null);
		JLabel nameLabel = new JLabel("Name: ");
		nameLabel.setBounds(100,0,100,20);
		nameField = new JTextField();
		nameField.setBounds(250,0,200, 20);
		namePanel.add(nameLabel);
		namePanel.add(nameField);
		contentPane.add(namePanel);
		JButton button = new JButton("Submit");
		contentPane.add(button);
		button.addActionListener(this);
		
		
		setVisible(true);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String name = this.nameField.getText();
		System.out.println(name);
		
	}
	public static void main(String[] args) {
		ActionListenerExample window = new ActionListenerExample();
	}

}
