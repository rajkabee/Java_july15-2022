package javaBasics.swing.layouts;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GridLayoutExample {
	public static void main(String[] args) {
		JFrame f = new JFrame("Grid Layout Example");
		f.setExtendedState(JFrame.MAXIMIZED_BOTH);
		//f.setUndecorated(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new BorderLayout());
		JPanel productsPanel = new JPanel();
		productsPanel.setSize(500, 600);
		productsPanel.setLayout(new GridLayout(0,4,10,10));
		JButton b1 = new JButton("One");
		JButton b2 = new JButton("Two");
		JButton b3 = new JButton("Three");
		JButton b4 = new JButton("Four");
		JButton b5 = new JButton("Five");
		JButton b6 = new JButton("Six");
		JButton b7 = new JButton("Seven");
		JButton b8 = new JButton("Eight");
		JButton b9 = new JButton("Nine");
		productsPanel.add(b1);productsPanel.add(b2);productsPanel.add(b3);
		productsPanel.add(b4);productsPanel.add(b5);productsPanel.add(b6);
		productsPanel.add(b7);productsPanel.add(b8);productsPanel.add(b9);
		
		JPanel billPanel = new JPanel();
		billPanel.setBackground(Color.BLACK);
		billPanel.setPreferredSize(new Dimension(500, 500));
		//billPanel.setMinimumSize(new Dimension(500, 500));
		JButton bill = new JButton("Bill");
		billPanel.add(bill);
		f.add(productsPanel, BorderLayout.CENTER);
		f.add(billPanel, BorderLayout.EAST);
		
		f.setVisible(true);
		
	}
}
