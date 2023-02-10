package javaBasics.swing.jframes;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	public MyFrame() {
		setTitle("My Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setSize(800, 500);
		//setBounds(300,200,800,500);
		setExtendedState(JFrame.MAXIMIZED_BOTH); 
		setUndecorated(true);
		//setIconImage(Toolkit.getDefaultToolkit().getImage("logo.png"));
		setIconImage(new ImageIcon("resources/statis/images/logo.png").getImage());
		setVisible(true);
	}
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
	}
}
