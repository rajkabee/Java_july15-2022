package com.examples.j2se.swing;

import java.awt.Toolkit;

import javax.swing.JFrame;

public class Frame extends JFrame{

	public Frame() {
		setBounds(350, 200, 800, 500);
		setTitle("JFrame Example");
		setIconImage(Toolkit.getDefaultToolkit().createImage("git_logo.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
//	public static void main(String[] args) {
//		Frame frame = new Frame();
//		frame.setVisible(true);
//	}
	
}
