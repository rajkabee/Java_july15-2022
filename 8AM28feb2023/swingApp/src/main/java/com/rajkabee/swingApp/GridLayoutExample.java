package com.rajkabee.swingApp;

import java.awt.GraphicsConfiguration;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutExample extends JFrame{
	
	
	
	
	public GridLayoutExample() {
		setBounds(250,150,800,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(3,3));
		JButton btn1 = new JButton("one");
		JButton btn2 = new JButton("two");
		JButton btn3 = new JButton("three");
		JButton btn4 = new JButton("four");
		JButton btn5 = new JButton("five");
		JButton btn6 = new JButton("six");
		JButton btn7 = new JButton("seven");
		JButton btn8 = new JButton("eignt");
		JButton btn9 = new JButton("nine");
		JButton btn10 = new JButton("ten");
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(btn6);
		add(btn7);
		add(btn8);
		add(btn9);
		add(btn10);
		
		setVisible(true);
		
	}


	public static void main(String[] args) {
		new GridLayoutExample();
	}
}
