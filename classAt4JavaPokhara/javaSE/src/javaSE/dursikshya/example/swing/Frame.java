package javaSE.dursikshya.example.swing;

import java.awt.Toolkit;

import javax.swing.JFrame;

public class Frame extends JFrame{
	public Frame() {
		setTitle("Dursikshya");
		setBounds(250,100, 800, 500);
		setIconImage(Toolkit.getDefaultToolkit().getImage("resources/logo.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setVisible(true);
	}
//	public static void main(String[] args) {
//		Frame frame = new Frame();
//	}
}