package com.example.swingPractice.jframes;


import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;

public class JFrameClassExample {
	public static void main(String[] args) {
		MyFrame frame = new MyFrame("Dursikshya");
		frame.setVisible(true);
		
	}
	
	public static class MyFrame extends JFrame{

		public MyFrame(String title)  {
			setTitle(title);
			
			setIconImage(new ImageIcon("logo.png").getImage());
			setJMenuBar(new MyMenuBar());
			setBounds(350, 200, 800, 500);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		}	
	}
	
	public static class MyMenuBar extends JMenuBar{
		public MyMenuBar() {
			JMenuItem home = new JMenuItem("Home");
			JMenuItem products = new JMenuItem("Products");
			JMenuItem sales = new JMenuItem("Sales");
			JMenuItem purchase = new JMenuItem("Purchase");
			JMenuItem finance = new JMenuItem("Finance");
			JMenu services = new JMenu("Serviecs");
			services.add(sales);
			services.add(purchase);
			services.add(finance);
			add(home);
			add(products);
			add(services);
			setLayout(new FlowLayout(0));
			
			
			
		}
		
	}
}
