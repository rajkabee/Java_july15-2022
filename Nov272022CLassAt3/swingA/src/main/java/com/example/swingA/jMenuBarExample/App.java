package com.example.swingA.jMenuBarExample;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import com.example.swingA.MyFrame;

public class App {
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
		frame.setLayout(new FlowLayout());
		MyMenuBar menuBar = new MyMenuBar();
//		JMenuItem home = new JMenuItem("Home");
//		JMenuItem products = new JMenuItem("Products");
//		JMenuItem sales = new JMenuItem("Sales");
//		JMenuItem purchase = new JMenuItem("Purchase");
//		JMenuItem finance = new JMenuItem("finance");
//		JMenuItem aboutUs = new JMenuItem("About Us");
//		JMenuItem contact = new JMenuItem("Contact");
//		JMenu services = new JMenu("Services");
//		services.add(sales);
//		services.add(purchase);
//		services.add(finance);
//		menuBar.add(home);
//		menuBar.add(products);
//		menuBar.add(services);
//		menuBar.add(aboutUs);
//		menuBar.add(contact);
		frame.setJMenuBar(menuBar);
		frame.setVisible(true);
	}
}
