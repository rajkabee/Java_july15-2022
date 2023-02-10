package com.example.swingA.jFrameExample;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class JFrameExample extends JFrame{
	
	
	
	public JFrameExample(){
		setTitle("Dursikshya");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 100, 800, 500);
		setUndecorated(false);
		setIconImage(Toolkit.getDefaultToolkit().createImage("logo.png"));
		setVisible(true);
	}


	public static void main(String[] args) {
		JFrame frame = new JFrameExample();
	}
}
