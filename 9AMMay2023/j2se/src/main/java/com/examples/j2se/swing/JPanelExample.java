package com.examples.j2se.swing;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanelExample {
	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setLayout(null);
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0,0,786, 100);
		JLabel header = new JLabel("Header");
		header.setForeground(Color.WHITE);
		panel.add(header);
		frame.add(panel, "North");
		
		
		JPanel panel1 = new JPanel();
		panel1.setBounds(0, 100, 786, 350);
		JLabel label2 = new JLabel("Content");
		panel1.add(label2);
		frame.add(panel1, "Center");
		
		frame.setVisible(true);
	}
}
