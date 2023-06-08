package com.example.swingIntro;

import java.awt.Toolkit;

import javax.swing.JFrame;

public class Frame extends JFrame{
	public Frame() {
		setTitle("Java App Window");
		setIconImage(Toolkit.getDefaultToolkit().createImage("github.png"));
		//setSize(800, 500);
		setBounds(250, 100, 800, 500);
		//setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(3);
		
	}
	/*
	 * public static void main(String[] args) { Frame frame = new Frame();
	 * 
	 * frame.setVisible(true); }
	 */
	
}
