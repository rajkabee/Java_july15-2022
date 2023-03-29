package com.example.swingA.layouts;

import java.awt.BorderLayout;

import javax.swing.JButton;

import com.example.swingA.MyFrame;

public class BorderLayoutExample {
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
		frame.setLayout(new BorderLayout(10,20));
		JButton header = new JButton("Header");
		JButton content = new JButton("Main Content");
		JButton leftSideBar = new JButton("Left Side Bar");
		JButton rightSideBar = new JButton("Right Side Bar");
		JButton footer = new JButton("Footer");
		
		frame.add(header, "North");
		frame.add(leftSideBar, "West");
		frame.add(content, "Center");
		frame.add(rightSideBar, "East");
		frame.add(footer, "South");
		
		frame.setVisible(true);
	}
}
