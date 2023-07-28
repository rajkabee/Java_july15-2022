package swing;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

public class Tables extends JFrame {

	private JPanel contentPane;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tables frame = new Tables();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tables() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		List<Student> students = Arrays.asList(
				new Student[] {
					new Student(1, "Sameer Thapa", "kathmandu", true),
					new Student(2, "Sameer Thapa", "kathmandu", true),
					new Student(3, "Sameer Thapa", "kathmandu", true),
					new Student(4, "Sameer Thapa", "kathmandu", true),
					new Student(5, "Sameer Thapa", "kathmandu", true),
					new Student(6, "Sameer Thapa", "kathmandu", false)
				}
				);
		ArrayList<Student> stds = new ArrayList<Student>();
		stds.addAll(students);
		MyTableModel model = new MyTableModel(stds);
		JTable table = new JTable(model);
		JScrollPane pane = new JScrollPane(table);
		contentPane.add(pane);
		
		
		
		setContentPane(contentPane);
	}

}

class MyTableModel extends AbstractTableModel{
	ArrayList<Student> students = new ArrayList<>();
	String[] cols = {"Sn.", "Name", "Address", "Active", "Action"};
	public MyTableModel(ArrayList<Student> students) {
		super();
		this.students = students;
	}
	
	@Override
	public Class<?> getColumnClass(int col) {
		if(col==0) {
			return Integer.class;
		}
		else if(col==3) {
			return Boolean.class;
		}
		else if(col==4) {
			return JButton.class;
		}
		else {
			return String.class;
		}
	}
	@Override
	public int getColumnCount() {
		return cols.length;
	}
	@Override
	public String getColumnName(int col) {
		return cols[col];
	}
	@Override
	public int getRowCount() {
		if(students==null) {
			return 0;
		}
		else {
			return students.size();
		}
	}
	@Override
	public Object getValueAt(int row, int col) {
		Object obj=null;
		if(col==0) {
			obj = students.get(row).getId();
		}
		else if(col==1) {
			obj = students.get(row).getName();
		}
		else if(col==2) {
			obj = students.get(row).getAddress();
		}
		else if(col==3) {
			obj = students.get(row).isActive();
		}
		else if(col==4) {
			obj = new JButton("Update");
		}
		return obj;
		
	}
	
	
	
}
