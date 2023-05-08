package javaSE.dursikshya.example.swing;

import java.awt.GridLayout;

import javax.swing.JButton;

public class GridLayoutExample {
	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setLayout(new GridLayout(3,3));
		JButton button1 = new JButton("Button1");
		JButton button2 = new JButton("Button2");
		JButton button3 = new JButton("Button3");
		JButton button4 = new JButton("Button4");
		JButton button5 = new JButton("Button5");
		JButton button6 = new JButton("Button6");
		JButton button7 = new JButton("Button7");
		JButton button8 = new JButton("Button8");
		JButton button9 = new JButton("Button9");
		JButton button10 = new JButton("Button10");
		JButton button11 = new JButton("Button11");
		JButton button12 = new JButton("Button12");
		JButton button13 = new JButton("Button13");
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		frame.add(button5);
		frame.add(button6);
		frame.add(button7);
		frame.add(button8);
		frame.add(button9);
		frame.add(button10);
		frame.add(button11);
		frame.add(button12);
		frame.add(button13);
		
		
		frame.setVisible(true);
	}
}
