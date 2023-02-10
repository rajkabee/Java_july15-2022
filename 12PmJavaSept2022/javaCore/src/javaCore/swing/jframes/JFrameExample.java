package javaCore.swing.jframes;

import javax.swing.JFrame;

public class JFrameExample {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Dursikshya");
		
		//frame.setSize(800, 500);
		frame.setBounds(200, 100, 800, 500);
		//frame.setExtendedState(JFrame.MAXIMIZED_HORIZ);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
