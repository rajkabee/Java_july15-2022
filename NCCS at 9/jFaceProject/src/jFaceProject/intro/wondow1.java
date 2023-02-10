package jFaceProject.intro;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class wondow1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					wondow1 window = new wondow1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public wondow1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 801, 461);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
