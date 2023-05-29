package com.example.jdbcConnection.swingGUI;

import java.awt.FlowLayout;

import javax.swing.JButton;

public class FlowLayoutExample {
	public static void main(String[] args) {
		Frame frame = new Frame("Flow Layout Example");
		frame.setLayout(new FlowLayout(FlowLayout.TRAILING));
		JButton btn1 = new JButton("1");
		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("3");
		JButton btn4 = new JButton("4");
		JButton btn5 = new JButton("5");
		JButton btn6 = new JButton("6");
		JButton btn7 = new JButton("7");
		JButton btn8 = new JButton("8");
		JButton btn9 = new JButton("9");
		JButton btn10 = new JButton("10");
		JButton btn11 = new JButton("11");
		JButton btn12 = new JButton("12");
		JButton btn13 = new JButton("13");
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
		frame.add(btn11);
		frame.add(btn12);
		frame.add(btn13);
		frame.setVisible(true);
	}
}
