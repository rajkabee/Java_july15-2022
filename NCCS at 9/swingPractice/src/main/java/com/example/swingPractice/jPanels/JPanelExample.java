package com.example.swingPractice.jPanels;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanelExample {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Dursikshya");
		frame.setIconImage(new ImageIcon("logo.png").getImage());
		frame.setDefaultCloseOperation(3);
		frame.setBounds(300, 200, 800, 500);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		JLabel title = new JLabel("Panel Title");
		panel.add(title);
		panel.setBounds(0,0,786,300);
		frame.add(panel);
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.black);
		JLabel title2 = new JLabel("Panel Title2");
		title2.setFont(new Font("algerian", 1, 34));
		title2.setForeground(Color.white);
		panel2.add(title2);
		panel2.setBounds(0,300,786,165);
		frame.add(panel2);
		
		frame.setLayout(null);
		frame.setVisible(true);
	}
}
