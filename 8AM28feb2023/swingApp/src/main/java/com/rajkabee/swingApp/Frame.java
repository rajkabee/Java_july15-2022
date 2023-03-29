package com.rajkabee.swingApp;

import javax.swing.JFrame;

public class Frame extends JFrame{
	public Frame(String title) {
		setBounds(250, 100, 800, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(title);
	}
}
