package javaCore.swing.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

public class FormFields {
	static JTextField nameField;
	static JTextArea descriptionField;
	static JCheckBox catElectronics;
	static JCheckBox catFashion; 
	static JCheckBox catSmartPhones;
	static JCheckBox catLaptops;
	static JRadioButton activeRadio;
	static JRadioButton notActiveRadio;
	static JComboBox sizeBox;
	public static void main(String[] args) {
		setUIFont(new FontUIResource("sans-serif", 3, 18));
		JFrame frame = new JFrame("Swing Form Fields");
		frame.setDefaultCloseOperation(3);
		frame.setBounds(200, 100, 800, 500);
		frame.setLayout(null);		
		JLabel header = new JLabel("Product Form");
		header.setBounds(200, 50, 400, 50);
		header.setFont(new Font("algerian", 1, 48));
		header.setForeground(Color.MAGENTA);
		frame.add(header);
		nameField = new JTextField();
		nameField.setBounds(300, 150, 200, 30);
		nameField.setText("Product Name");
		frame.add(nameField);
		
		descriptionField = new JTextArea();
		descriptionField.setText("Product Description");
		descriptionField.setBounds(300, 190, 200, 60);
		frame.add(descriptionField);
		
		JLabel categoryLabel = new JLabel("Category: ");
		categoryLabel.setBounds(200, 260, 100, 30);
		frame.add(categoryLabel);
		
		catElectronics = new JCheckBox("Electronics", true);
		catElectronics.setBounds(300, 260, 200, 30);
		frame.add(catElectronics);
		
		catFashion = new JCheckBox("Fashion");
		catFashion.setBounds(500, 260, 200, 30);
		frame.add(catFashion);
		
		catSmartPhones = new JCheckBox("SmartPhones");
		catSmartPhones.setBounds(300, 290, 200, 30);
		frame.add(catSmartPhones);
		
		catLaptops = new JCheckBox("Laptops");
		catLaptops.setBounds(500, 290, 200, 30);
		frame.add(catLaptops);
		
		JLabel activeLabel = new JLabel("Is Active: ");
		activeLabel.setBounds(200, 330, 100, 30);
		frame.add(activeLabel);
		
		activeRadio = new JRadioButton("Active", true);
		activeRadio.setBounds(300, 330, 100, 30);
		
		notActiveRadio = new JRadioButton("Inactive");
		notActiveRadio.setBounds(400, 330, 100, 30);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(activeRadio);
		bg.add(notActiveRadio);
		frame.add(activeRadio);
		frame.add(notActiveRadio);
		
		JLabel sizeLabel = new JLabel("Size: ");
		sizeLabel.setBounds(200, 370, 100, 30);
		frame.add(sizeLabel);
		
		String[] sizes = {"S", "M", "L", "Xl", "XXL"};
		sizeBox = new JComboBox(sizes);
		sizeBox.setBounds(300, 370, 200, 30);
		frame.add(sizeBox);
		
		JButton submitButton = new JButton("Submit");
		submitButton.setBounds(300, 420, 200, 30);
		frame.add(submitButton);
		
		submitButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.out.println(nameField.getText());
			}
		});
		
		frame.setVisible(true);
	}
	
	public static void setUIFont (javax.swing.plaf.FontUIResource f){
	    java.util.Enumeration keys = UIManager.getDefaults().keys();
	    while (keys.hasMoreElements()) {
	      Object key = keys.nextElement();
	      Object value = UIManager.get (key);
	      if (value instanceof javax.swing.plaf.FontUIResource)
	        UIManager.put (key, f);
	      }
	    } 
}
