package com.example.jdbcConnection.swingGUI;

import java.awt.Toolkit;

import javax.swing.JFrame;

public class JFrameExample {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Swing Window");
		//frame.setTitle("My First Swing Application");
		//frame.setSize(800, 500);
		frame.setBounds(200,100,800,500);
		//frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		//frame.setUndecorated(true);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("images/images.png"));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		nextWindow();
		frame.setVisible(true);
	}
	public static void nextWindow() {
		JFrame frame = new JFrame("Next Window");
		//frame.setTitle("My First Swing Application");
		//frame.setSize(800, 500);
		frame.setBounds(400,50,400,500);
		//frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		//frame.setUndecorated(true);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("images/images.png"));
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		//frame.dispose();
		frame.setVisible(true);
	}
}
