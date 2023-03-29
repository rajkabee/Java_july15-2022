package com.example.swingA.layouts;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import com.example.swingA.MyFrame;

public class CardLayoutExample{
	static CardLayout cardLayout;
	static Container cPane;
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
		cPane = frame.getContentPane();
		cardLayout = new CardLayout();
		cPane.setLayout(cardLayout);
		//frame.setLayout();
		JButton btn1 = new JButton("Button 1");
		JButton btn2 = new JButton("Button 2");
		JButton btn3 = new JButton("Button 3");
		btn1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				cardLayout.next(cPane);
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				cardLayout.next(cPane);
			}
		});
		
		btn3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				cardLayout.next(cPane);
			}
		});
		
		cPane.add(btn1);
		cPane.add(btn2);
		cPane.add(btn3);
		
		
		frame.setVisible(true);
		
	}
	

}
