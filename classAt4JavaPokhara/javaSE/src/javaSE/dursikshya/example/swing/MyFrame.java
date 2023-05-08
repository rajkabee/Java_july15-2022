package javaSE.dursikshya.example.swing;

import java.awt.Toolkit;

import javax.swing.JFrame;

public class MyFrame {
	public static void main(String[] args) {
		JFrame frame = new JFrame("My First Swing Application");
		//frame.setTitle("Dursikshya");
		//frame.setSize(800, 500);
		frame.setBounds(250, 100, 800, 500);
		//frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		//frame.setUndecorated(true);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("resources/logo.png"));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		frame.setVisible(true);
	}
}
