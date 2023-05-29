package com.example.jdbcConnection.swingGUI;

import java.awt.BorderLayout;

import javax.swing.JButton;

public class BorderLayoutExample {
	public static void main(String[] args) {
		Frame frame = new Frame("Border Layout Example");
		//frame.setLayout(new BorderLayout());
		JButton topBar = new JButton("North");
		JButton leftBar = new JButton("West");
		JButton centerBar = new JButton("Center");
		JButton rightBar = new JButton("East");
		JButton bottomBar = new JButton("South");
		frame.add(topBar, BorderLayout.NORTH);
		frame.add(leftBar, "West");
		frame.add(centerBar, "Center");
		frame.add(rightBar, "East");
		frame.add(bottomBar, "South");
		
		
		
		
		frame.setVisible(true);
	}
}
