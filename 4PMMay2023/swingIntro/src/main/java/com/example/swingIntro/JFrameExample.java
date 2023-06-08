package com.example.swingIntro;

import java.awt.Toolkit;

import javax.swing.JFrame;

public class JFrameExample {
	public static void main(String[] args) {
		JFrame frame = new JFrame("My first Swing Application");
		//frame.setTitle("Java App Window");
		frame.setIconImage(Toolkit.getDefaultToolkit().createImage("github.png"));
		//frame.setSize(800, 500);
		frame.setBounds(250, 100, 800, 500);
		//frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		frame.setDefaultCloseOperation(3);
		
		frame.setVisible(true);
	}
}
