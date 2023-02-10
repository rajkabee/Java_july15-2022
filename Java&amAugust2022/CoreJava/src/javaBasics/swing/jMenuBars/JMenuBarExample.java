package javaBasics.swing.jMenuBars;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class JMenuBarExample extends JFrame{
	public JMenuBarExample() {
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setLayout(new BorderLayout());
		JPanel topPanel = new JPanel();
		topPanel.setBackground(Color.GRAY);
		topPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		topPanel.add(new MyMenuBar());
		add(topPanel, BorderLayout.NORTH);
		
		JPanel westPanel = new JPanel();
		westPanel.setBackground(Color.BLUE);
		westPanel.setLayout(new GridLayout(0,1));
		MyMenuBar menubar = new MyMenuBar();
		menubar.setLayout(new GridLayout(0,1));
		westPanel.add(menubar);
		add(westPanel, BorderLayout.WEST);
		
		JPanel centerPanel = new JPanel();
		centerPanel.setBackground(Color.CYAN);
		centerPanel.add(new JLabel("Center Panel"));
		add(centerPanel, BorderLayout.CENTER);
		
		JPanel eastPanel = new JPanel();
		eastPanel.setBackground(Color.BLUE);
		eastPanel.add(new JLabel("East Panel"));
		add(eastPanel, BorderLayout.EAST);
		
		JPanel bottomPanel = new JPanel();
		bottomPanel.setBackground(Color.DARK_GRAY);
		bottomPanel.add(new JLabel("Bottom Panel"));
		add(bottomPanel, BorderLayout.SOUTH);
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		JFrame Frame = new JMenuBarExample();
	}
	
	private static class MyMenuBar extends JMenuBar{
		public MyMenuBar() {
			JMenuItem home = new JMenuItem("Home");
			JMenuItem products = new JMenuItem("Products");
			JMenuItem purchase = new JMenuItem("Purchase");
			JMenuItem sales = new JMenuItem("Sales");
			JMenuItem finance = new JMenuItem("Finance");
			JMenuItem contact = new JMenuItem("Contact");
			JMenuItem help = new JMenuItem("Help");
			JMenu services = new JMenu("Services");
			services.add(purchase);
			services.add(sales);
			services.add(finance);
			add(home);
			add(products);
			add(services);
			add(contact);
			add(help);
		}
	}
	
}

