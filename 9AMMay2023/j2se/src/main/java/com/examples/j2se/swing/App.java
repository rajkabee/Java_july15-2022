package com.examples.j2se.swing;

import java.awt.Toolkit;

import javax.swing.JFrame;

public class App {
	public static void main(String[] args) {
		JFrame frame = new JFrame("App Title"); 
		//frame.setTitle("Application Window");
		frame.setIconImage(Toolkit.getDefaultToolkit().createImage("git_logo.png"));
		//frame.setSize(800, 500);
		frame.setUndecorated(true);
		frame.setBounds(350, 150, 800, 500);
		//frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		
		
		frame.setVisible(true);
	}
}
