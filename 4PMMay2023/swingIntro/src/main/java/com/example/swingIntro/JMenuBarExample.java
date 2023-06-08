package com.example.swingIntro;

import java.awt.FlowLayout;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JMenuBarExample {
	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setTitle("JMenuBar Example");
		JMenuItem home = new JMenuItem("Home");
		JMenuItem products = new JMenuItem("Products");
		JMenuItem purchase = new JMenuItem("Purchase");
		JMenuItem sales = new JMenuItem("Sales");
		JMenuItem finance = new JMenuItem("Finance");
		JMenuItem contact = new JMenuItem("Contact");
		JMenuItem aboutUs = new JMenuItem("About Us");
		JMenu services = new JMenu("Services");
		services.add(purchase);
		services.add(sales);
		services.add(finance);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
		menuBar.add(home);
		menuBar.add(products);
		menuBar.add(services);
		menuBar.add(contact);
		menuBar.add(aboutUs);
		
		frame.setJMenuBar(menuBar);
		
		
		frame.setVisible(true);
	}
}
