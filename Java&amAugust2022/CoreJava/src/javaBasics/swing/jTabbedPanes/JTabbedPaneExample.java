package javaBasics.swing.jTabbedPanes;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class JTabbedPaneExample {
	static JFrame f;
	public static void main(String[] args) {
		f = new JFrame("JTabbedPane Example");
		//f.setBounds(300, 100, 800, 500);
		f.setExtendedState(JFrame.MAXIMIZED_BOTH);
		f.setUndecorated(true);
		JPanel homePanel = new JPanel();
		homePanel.add(new JLabel("HOME"));
		JPanel productsPanel = new JPanel();
		productsPanel.add(new JLabel("PRODUCTS"));
		JPanel servicesPanel = new JPanel();
		servicesPanel.add(new JLabel("SERVICES"));
		
		JTabbedPane tabbedPane = new JTabbedPane();
		tabbedPane.add("home", homePanel);
		tabbedPane.add("products",productsPanel);
		tabbedPane.add("services", servicesPanel);
		
		tabbedPane.addKeyListener(new KeyListener() {
			
			
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ESCAPE){
		           System.out.println("hello");
		           f.dispose();
		         }
			}

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		f.add(tabbedPane);
		f.setVisible(true);
	}
}
