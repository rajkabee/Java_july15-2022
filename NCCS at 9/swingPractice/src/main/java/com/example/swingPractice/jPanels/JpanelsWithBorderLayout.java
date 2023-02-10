package com.example.swingPractice.jPanels;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class JpanelsWithBorderLayout {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Dursikshya");
		frame.setDefaultCloseOperation(3);
		frame.setIconImage(new ImageIcon("logo.png").getImage());
		frame.setLayout(new BorderLayout());
		
		
		JPanel topPanel = new JPanel();
		topPanel.setBackground(Color.GRAY);
		topPanel.add(new JLabel("Header"));
		frame.add(topPanel, BorderLayout.NORTH);
		
		
		
		JPanel leftPanel = new JPanel();
		leftPanel.setBackground(Color.DARK_GRAY);
		leftPanel.add(new JLabel("Left Panel"));
		frame.add(leftPanel, BorderLayout.WEST);
		
//		JPanel centerPanel = new JPanel();
//		centerPanel.setBackground(Color.WHITE);
//		centerPanel.add(new JLabel("Center Panel"));
//		frame.add(centerPanel, BorderLayout.CENTER);
		
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
		tabbedPane.setSize(600,400);
		frame.add(tabbedPane, BorderLayout.CENTER);

		JPanel rightPanel = new JPanel();
		rightPanel.setBackground(Color.DARK_GRAY);
		rightPanel.add(new JLabel("Right Panel"));
		frame.add(rightPanel, BorderLayout.EAST);
		
		JPanel bottomPanel = new JPanel();
		bottomPanel.setBackground(Color.GRAY);
		bottomPanel.add(new JLabel("Bottom Panel"));
		frame.add(bottomPanel, BorderLayout.SOUTH);
		
		
		frame.setBounds(300, 200, 800, 500);
		frame.setVisible(true);
	}
}
