package javaSE.dursikshya.example.swing;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanelExample {
	public static void main(String[] args) {
		Frame frame = new Frame();
		JPanel headerPanel = new JPanel();
		JLabel header = new JLabel("Application Header");
		header.setFont(new Font("algerian", 0, 36));
		headerPanel.add(header);
		frame.add(headerPanel, "North");
		frame.setVisible(true);
	}
}
