package com.example.jdbcConnection.swingGUI;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
	public MyFrame(String title){
		setTitle(title);
		setBounds(200, 100, 800, 500);
		setDefaultCloseOperation(3);
		
		
		
	}
	public static void main(String[] args) {
		MyFrame frame = new MyFrame("My Frame");
		frame.setVisible(true);
	}
}
