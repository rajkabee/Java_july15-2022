package com.example.jdbcConnection.swingGUI;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BoxLayoutExample extends JFrame {
	public BoxLayoutExample() {
		setTitle("Box Layout Example");
		setBounds(250, 0, 500, 800);
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
		add(btn11);
		add(btn12);
		add(btn13);
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setVisible(true);
	}
	public static void main(String[] args) {
		BoxLayoutExample frame = new BoxLayoutExample();
	}
}	
