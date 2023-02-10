package javaCore.swing.jframes;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class MyFrame extends JFrame {

	public MyFrame() {
		setTitle("Dursikshya");
		setIconImage(Toolkit.getDefaultToolkit().getImage("SmallLogo.png"));
		setBounds(200,100, 800,500);
		setDefaultCloseOperation(3);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
	}
	
	
}
