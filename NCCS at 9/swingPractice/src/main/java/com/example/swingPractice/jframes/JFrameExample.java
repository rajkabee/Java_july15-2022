package com.example.swingPractice.jframes;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class JFrameExample {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Dursikshya");
		//frame.setSize(800, 500);
		//frame.setIconImage(Toolkit.getDefaultToolkit().createImage("logo.png"));
		frame.setIconImage(new ImageIcon("logo.png").getImage());
		frame.setBounds(300, 200, 800, 500);
		frame.setVisible(true);
	}
}
