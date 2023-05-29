package com.example.jdbcConnection.swingGUI;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CardLayoutExample extends JFrame implements ActionListener{
	CardLayout crd;
	Container cnt ;
	public CardLayoutExample() {
		setTitle("Card Layout Example");
		setBounds(250, 100, 800, 500);
		crd = new CardLayout();
		cnt= getContentPane();
		cnt.setLayout(crd);
		JButton btn1 = new JButton("Apple");
		JButton btn2 = new JButton("Ball");
		JButton btn3 = new JButton("Cat");
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		
		cnt.add("a", btn1);
		cnt.add("b", btn2);
		cnt.add("c", btn3);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		CardLayoutExample frame = new CardLayoutExample();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		crd.next(cnt);
	}
}
