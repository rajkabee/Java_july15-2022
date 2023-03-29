package windowsBuilderProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.ImageIcon;

public class App {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App window = new App();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public App() {
		initialize();
	}


	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 790, 508);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton header = new JButton("HEADER");
		header.setIcon(new ImageIcon("C:\\Users\\Kabiraj\\Desktop\\logo.png"));
		header.setFont(new Font("Calibri", Font.BOLD, 36));
		frame.getContentPane().add(header, BorderLayout.NORTH);
		
		JButton leftNavbar = new JButton("LeftNavbar");
		frame.getContentPane().add(leftNavbar, BorderLayout.WEST);
		
		JButton mainContent = new JButton("Main Content");
		frame.getContentPane().add(mainContent, BorderLayout.CENTER);
		
		JButton rightBar = new JButton("Right Bar");
		frame.getContentPane().add(rightBar, BorderLayout.EAST);
		
		JButton footer = new JButton("Footer");
		frame.getContentPane().add(footer, BorderLayout.SOUTH);
	}

}
