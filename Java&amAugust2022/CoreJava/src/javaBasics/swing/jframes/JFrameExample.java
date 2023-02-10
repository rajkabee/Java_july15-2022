package javaBasics.swing.jframes;

import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class JFrameExample{
	public static void main(String[] args) {
		JFrame frame = new JFrame("Java JFrame Example");
		frame.setTitle("My Frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setSize(800, 500);
		//frame.setBounds(300,200,800,500);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		//frame.setUndecorated(true);
		//frame.setIconImage(Toolkit.getDefaultToolkit().getImage("logo.png"));
		frame.setIconImage(new ImageIcon("resources/statis/images/logo.png").getImage());
		frame.setVisible(true);
	}
}
