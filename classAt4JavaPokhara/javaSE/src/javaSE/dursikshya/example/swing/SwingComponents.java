package javaSE.dursikshya.example.swing;

import java.awt.ComponentOrientation;
import java.awt.FlowLayout;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class SwingComponents {
	public static void main(String[] args) {
		Frame frame = new Frame();
		JMenuItem home= new JMenuItem("Home");
		JMenuItem products= new JMenuItem("Products");
		JMenuItem sales= new JMenuItem("Sales");
		JMenuItem purchase= new JMenuItem("Purchase");
		JMenuItem finance= new JMenuItem("Finance");
		JMenuItem aboutUs= new JMenuItem("About Us");
		JMenuItem contact= new JMenuItem("Contact");
		JMenu services = new JMenu("Services");
		services.add(sales);
		services.add(purchase);
		services.add(finance);
		JMenuBar menuBar = new JMenuBar();
		menuBar.add(home);
		menuBar.add(services);
		menuBar.add(products);
		menuBar.add(aboutUs);
		menuBar.add(contact);
		menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
		frame.setJMenuBar(menuBar);
		frame.setVisible(true);
	}
}
