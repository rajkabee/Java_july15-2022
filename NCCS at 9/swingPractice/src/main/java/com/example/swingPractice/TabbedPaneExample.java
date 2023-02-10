package com.example.swingPractice;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TabbedPaneExample {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Dursikshya");
		frame.setDefaultCloseOperation(3);
		frame.setIconImage(new ImageIcon("logo.png").getImage());
		
		JPanel panel1 = new JPanel();
		panel1.add(new JLabel("Panel1"));
		
		JPanel panel2 = new JPanel();
		panel2.add(new JLabel("Panel2"));
		
		JPanel panel3 = new JPanel();
		panel3.add(new JLabel("Panel3"));
		
		JTabbedPane tabbedPane = new JTabbedPane();
		tabbedPane.add("Home", panel1);
		tabbedPane.add("Products", panel2);
		tabbedPane.add("Contact", panel3);
		
		frame.add(tabbedPane);
		frame.setBounds(300, 200, 800, 500);
		frame.setVisible(true);
		
		
	}
}
