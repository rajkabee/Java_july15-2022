package com.example.swingA.layouts;

import java.awt.GridLayout;

import javax.swing.JButton;

import com.example.swingA.MyFrame;

public class GridLayoutExample {
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
		frame.setLayout(new GridLayout(3,3, 5,10));
		JButton btn1 = new JButton("Button");
		JButton btn2 = new JButton("Button");
		JButton btn3 = new JButton("Button");
		JButton btn4 = new JButton("Button");
		JButton btn5 = new JButton("Button");
		JButton btn6 = new JButton("Button");
		JButton btn7 = new JButton("Button");
		JButton btn8 = new JButton("Button");
		JButton btn9 = new JButton("Button");
		JButton btn10 = new JButton("Button");
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);
		frame.add(btn4);
		frame.add(btn5);
		frame.add(btn6);
		frame.add(btn7);
		frame.add(btn8);
		frame.add(btn9);
		frame.add(btn10);
		frame.setVisible(true);
				
	}
}
