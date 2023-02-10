package javaCore.swing.jMenuBars;

import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;

import javaCore.swing.jframes.MyFrame;

public class JMenuBarExample {
	public static class MyFrame extends JFrame {
		public MyFrame() {
			setTitle("Dursikshya");
			setIconImage(Toolkit.getDefaultToolkit().getImage("SmallLogo.png"));
			setBounds(200,100, 800,500);
			setDefaultCloseOperation(3);
			
		}
	}
	
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
		//menu items
		JMenuItem file = new JMenuItem("File"); 
		JMenuItem cut = new JMenuItem("Cut"); 
		JMenuItem copy = new JMenuItem("Copy"); 
		JMenuItem paste = new JMenuItem("Paste"); 
		JMenuItem help = new JMenuItem("Help"); 
		JMenuItem about = new JMenuItem("About");
		
		//menu
		JMenu edit = new JMenu("Edit");
		edit.add(cut);
		edit.add(copy);
		edit.add(paste);
		
		//menubar
		JMenuBar menuBar = new JMenuBar();
		menuBar.add(file);
		menuBar.add(edit);
		menuBar.add(help);
		menuBar.add(about);
		menuBar.setLayout(new FlowLayout(0));
		frame.setJMenuBar(menuBar);
		
		frame.setVisible(true);
	}
	
}
