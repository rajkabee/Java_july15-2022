package javaSE.dursikshya.example.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class JListExample implements ActionListener {
	Frame frame;
	JList<String> series;
	public JListExample() {
		frame = new Frame();
		frame.setLayout(null);
		String[] names = {"Game Of Thrones", "Stranger Things", "Breaking Bad", "Chernobyl"};
		DefaultListModel<String> model = new DefaultListModel<>();
		for(int i=0; i<names.length; i++) {
			model.addElement(names[i]);
		}
		series= new JList<>(model);
		series.setBounds(200, 100, 200, 80);
		frame.add(series, "Center");
		JButton button = new JButton("Click me");
		button.addActionListener(this);
		button.setBounds(200, 200, 200, 40);
		frame.add(button);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		JListExample example = new JListExample();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String value = this.series.getSelectedValue();
		JOptionPane.showMessageDialog(frame, value+" selected");
		
	}
}
