package com.rajkabee.swingApp;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class JMenuBarExample extends JFrame{
	public JMenuBarExample() {
		setBounds(250, 100, 800, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JMenuBar Example");
		//setLayout(new FlowLayout());
		JMenuItem files = new JMenuItem("Files");
		files.addActionListener(new ActionListener() {
			JFrame frame = new JFrame();
			public void actionPerformed(ActionEvent e) {
				 JOptionPane.showMessageDialog(frame,"Hello, Welcome to Javatpoint.");  
				
			}
		});
		JMenuItem products = new JMenuItem("Products");
		JMenuItem sales = new JMenuItem("Sales");
		JMenuItem purchase = new JMenuItem("Purchase");
		JMenuItem finance = new JMenuItem("Finance");
		JMenuItem aboutUs = new JMenuItem("About Us");
		JMenuItem contact = new JMenuItem("Contact");
		JMenu services = new JMenu("Services");
		services.add(sales);
		services.add(purchase);
		services.add(finance);
		JMenuBar menuBar = new JMenuBar();
		menuBar.add(files);
		menuBar.add(products);
		menuBar.add(services);
		menuBar.add(aboutUs);
		//menuBar.add(Box.createHorizontalGlue());
		menuBar.add(contact);
		menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
		//add(menuBar, "North");
		setJMenuBar(menuBar);
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		JMenuBarExample frame = new JMenuBarExample();
		frame.setVisible(true);
	}
	
}
