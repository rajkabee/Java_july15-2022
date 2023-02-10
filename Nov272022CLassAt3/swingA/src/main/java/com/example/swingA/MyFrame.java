package com.example.swingA;

import java.awt.Toolkit;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	public MyFrame(){
		setTitle("Dursikshya");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 100, 800, 500);
		setUndecorated(false);
		setIconImage(Toolkit.getDefaultToolkit().createImage("logo.png"));
	}
}
