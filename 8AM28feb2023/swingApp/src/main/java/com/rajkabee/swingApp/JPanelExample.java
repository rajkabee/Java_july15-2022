package com.rajkabee.swingApp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanelExample{
	public static void main(String[] args) {
		Frame frame = new Frame("jpanels");
		JPanel headerPanel = new JPanel();
		headerPanel.setLayout(new BorderLayout());
		headerPanel.setBackground(Color.cyan);
		JLabel headerLabel = new JLabel("Application Header");
		headerLabel.setFont(new Font("algerian",1 ,46));
		
		headerPanel.add(headerLabel, "North");
		JLabel addressLabel = new JLabel("Kathmandu, Nepal");
		headerPanel.add(addressLabel, "South");
		frame.add(headerPanel, "North");
		
		JPanel contentPanel= new JPanel();
		contentPanel.setBackground(Color.DARK_GRAY);
		frame.add(contentPanel, "Center");
		
		
		JPanel footerPanel= new JPanel();
		footerPanel.setBackground(Color.CYAN);
		JButton callbutton = new JButton("Call");
		JButton contactbutton = new JButton("Contact");
		JButton emailbutton = new JButton("Email");
		footerPanel.add(callbutton);
		footerPanel.add(contactbutton);
		footerPanel.add(emailbutton);
		frame.add(footerPanel, "South");
		
		
		frame.setVisible(true);
	}
}
