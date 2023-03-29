package com.example.swingA.layouts;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.example.swingA.MyFrame;

public class CardLayoutExample2 {
	static CardLayout cardLayout;
	static JPanel panel;
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
		frame.setLayout(new BorderLayout());
		panel = new JPanel();
		cardLayout = new CardLayout();
		panel.setLayout(cardLayout);
		JLabel label1 = new JLabel("label1");
		JLabel label2 = new JLabel("label2");
		JLabel label3 = new JLabel("label3");
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		frame.add(panel, "Center");
		JButton button = new JButton("Next");
		button.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				cardLayout.next(panel);
			}
		});
		frame.add(button, "South");
		frame.setVisible(true);
	}
}
