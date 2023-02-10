package javaBasics.swing.jPanels;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanelExample extends JFrame{
	public JPanelExample() {
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setLayout(new BorderLayout());
		JPanel topPanel = new JPanel();
		topPanel.setBackground(Color.GRAY);
		topPanel.add(new JLabel("Top Panel"));
		add(topPanel, BorderLayout.NORTH);
		
		JPanel westPanel = new JPanel();
		westPanel.setBackground(Color.BLUE);
		westPanel.add(new JLabel("West Panel"));
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
	/*
	public static void main(String[] args) {
		JFrame Frame = new JPanelExample();
	}
	*/
}
