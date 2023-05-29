package com.example.jdbcConnection.swingGUI;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JMenuBarExample extends JFrame{

	public JMenuBarExample(String title) {
		setTitle(title);
		setBounds(200, 100, 800, 500);
		setDefaultCloseOperation(3);
		JMenuItem home = new JMenuItem("Home");
		JMenuItem aboutUs = new JMenuItem("About Us");
		JMenuItem contact = new JMenuItem("Contact");
		JMenuItem products = new JMenuItem("Produts");
		JMenuItem sales = new JMenuItem("Sales");
		JMenuItem purchase = new JMenuItem("Purchase");
		JMenuItem finance = new JMenuItem("Finance");
		JMenuItem consultancy = new JMenuItem("Consultancy");
		JMenu services = new JMenu("Services");
		services.add(purchase);
		services.add(sales);
		services.add(finance);
		services.add(consultancy);
		JMenuBar menuBar = new JMenuBar();
		menuBar.add(home);
		menuBar.add(products);
		menuBar.add(services);
		menuBar.add(contact);
		menuBar.add(aboutUs);
		menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
		setJMenuBar(menuBar);
		
	}
	public static void main(String[] args) {
		JMenuBarExample frame = new JMenuBarExample("JMenuBar Example");
		
		
		frame.setVisible(true);
	}
	
}
