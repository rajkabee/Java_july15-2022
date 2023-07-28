import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;

public class AppWindow {
	static JLabel nameLabel;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppWindow window = new AppWindow();
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
	public AppWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 985, 515);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		nameLabel = new JLabel("");
		
		JButton submitButton = new JButton("Submit");
		submitButton.setBackground(new Color(0, 128, 255));
		submitButton.setForeground(new Color(255, 255, 255));
		frame.getContentPane().add(submitButton, BorderLayout.CENTER);
		
		submitButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				nameLabel.setText("Subah Thakuri");
			}
			
		});
		
		
		frame.getContentPane().add(nameLabel, BorderLayout.NORTH);
	}

}
