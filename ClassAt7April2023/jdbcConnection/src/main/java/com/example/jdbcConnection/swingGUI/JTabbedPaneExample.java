package com.example.jdbcConnection.swingGUI;

import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class JTabbedPaneExample {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		JFrame frame = new JFrame("JTable Example");
		frame.setBounds(250,100, 800,500);
		frame.setDefaultCloseOperation(3);
		
		JTabbedPane pane = new JTabbedPane();
		JPanel home = new JPanel();
		home.add(new JLabel("Home Tab"));
		JPanel deposit = new JPanel();
		deposit.add(new JLabel("Deposit Tab"));
		JPanel withdraw = new JPanel();
		withdraw.add(new JLabel("Withdraw Tab"));
		JPanel cheque = new JPanel();
		cheque.add(new JLabel("Cheque Tab"));
		pane.add("Home", home);
		pane.add("cheque",cheque);
		pane.add("deposit",deposit);
		pane.add("withdraw", withdraw);
		frame.add(pane, "Center");
		
		
		frame.setVisible(true);
	}
}
