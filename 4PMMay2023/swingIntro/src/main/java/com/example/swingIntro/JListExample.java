package com.example.swingIntro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;



public class JListExample {
	static JList<String> countryList;
	static JLabel label;
	public static void main(String[] args) {
		Frame frame = new Frame();
		String[] countries = {"Nepal", "China", "India", "Pakistan", "Bangladesh", "Bhutan"};
		frame.setLayout(null);
		countryList = new JList<String>(countries);
		countryList.setBounds(100, 100, 200, 150);
		frame.add(countryList);
		label = new JLabel("Text Here...");
		label.setBounds(100, 260, 200, 20);
		frame.add(label);
		
		JButton button = new JButton("done");
		button.setBounds(150, 300, 100, 30);
		button.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String country = countryList.getSelectedValue();
				label.setText(country);
				
			}
		});
		frame.add(button);
		
		frame.setVisible(true);
	}
}
