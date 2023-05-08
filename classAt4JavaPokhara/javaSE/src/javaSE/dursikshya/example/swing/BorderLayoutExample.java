package javaSE.dursikshya.example.swing;

import java.awt.BorderLayout;

import javax.swing.JButton;

public class BorderLayoutExample {
	public static void main(String[] args) {
		Frame frame = new Frame();
		//frame.setLayout(new BorderLayout());
		JButton button1 = new JButton("Button1");
		JButton button2 = new JButton("Button2");
		JButton button3 = new JButton("Button3");
		JButton button4 = new JButton("Button4");
		JButton button5 = new JButton("Button5");
		frame.add(button1, BorderLayout.NORTH);
		frame.add(button2, "West");
		frame.add(button3, "East");
		frame.add(button4, "Center");
		frame.add(button5, "South");
		
		
		frame.setVisible(true);
	}
}
