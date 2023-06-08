package com.examples.j2se.swing;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class BorderLayoutExample {
	public static void main(String[] args) {
		Frame frame = new Frame();
		//frame.setLayout(new BorderLayout());
		JButton header = new JButton("NORTH");
		//JButton leftSideBar = new JButton("WEST");
		JPanel leftSideBar = new JPanel();
		leftSideBar.setLayout(new BoxLayout(leftSideBar, BoxLayout.Y_AXIS));
		JButton navLink1 = new JButton("Link");
		JButton navLink2 = new JButton("Link");
		JButton navLink3 = new JButton("Link");
		JButton navLink4 = new JButton("Link");
		JButton navLink5 = new JButton("Link");
		leftSideBar.add(navLink1);
		leftSideBar.add(navLink2);
		leftSideBar.add(navLink3);
		leftSideBar.add(navLink4);
		leftSideBar.add(navLink5);
		
		//JButton content = new JButton("CENTER");
		JPanel content = new JPanel();
		content.setLayout(new GridLayout(3,3));
		JButton btn1 = new JButton("button");
		JButton btn2 = new JButton("button");
		JButton btn3 = new JButton("button");
		JButton btn4 = new JButton("button");
		JButton btn5 = new JButton("button");
		JButton btn6 = new JButton("button");
		JButton btn7 = new JButton("button");
		JButton btn8 = new JButton("button");
		JButton btn9 = new JButton("button");
		JButton btn10 = new JButton("button");
		content.add(btn1);
		content.add(btn2);
		content.add(btn3);
		content.add(btn4);
		content.add(btn5);
		content.add(btn6);
		content.add(btn7);
		content.add(btn8);
		content.add(btn9);
		content.add(btn10);
		
		
		
		//JButton rightSideBar = new JButton("EAST");
		JPanel rightSideBar = new JPanel();
		rightSideBar.setLayout(new BoxLayout(rightSideBar, BoxLayout.X_AXIS));
		JButton navLink6 = new JButton("a");
		JButton navLink7 = new JButton("b");
		JButton navLink8 = new JButton("c");
		rightSideBar.add(navLink6);
		rightSideBar.add(navLink7);
		rightSideBar.add(navLink8);
		JButton footer = new JButton("SOUTH");
		
		frame.add(header, "North");
		frame.add(leftSideBar, "West");
		frame.add(content,BorderLayout.CENTER);
		frame.add(rightSideBar, BorderLayout.EAST);
		frame.add(footer, "South");
		
		frame.setVisible(true);
		
		
 	}
}	
