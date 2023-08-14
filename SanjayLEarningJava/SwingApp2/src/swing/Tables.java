package swing;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

public class Tables extends JFrame implements ActionListener{

	static private JPanel contentPane;
	static private ArrayList<JButton> editList;

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

		List<Student> students = Arrays.asList(new Student[] { new Student(1, "Sameer Thapa", "kathmandu", true),
				new Student(2, "Sameer Thapa", "kathmandu", true), new Student(3, "Sameer Thapa", "kathmandu", true),
				new Student(4, "Sameer Thapa", "kathmandu", true), new Student(5, "Sameer Thapa", "kathmandu", true),
				new Student(6, "Sameer Thapa", "kathmandu", false) });
		ArrayList<Student> stds = new ArrayList<Student>();
		stds.addAll(students);
		editList = new ArrayList<>();
		for (int i = 0; i < stds.size(); i++) {
			JButton editButton = new JButton("EDIT");
			editButton.addActionListener(this);
			editList.add(editButton);
		}
		MyTableModel model = new MyTableModel(stds);
		JTable table = new JTable(model);
		table.addMouseListener(new JTableButtonMouseListener(table));
		JScrollPane pane = new JScrollPane(table);
		TableCellRenderer buttonRenderer = new JTableButtonRenderer();
		table.getColumn("Action").setCellRenderer(buttonRenderer);

		contentPane.add(pane);

		setContentPane(contentPane);
	}

	class MyTableModel extends AbstractTableModel {
		ArrayList<Student> students = new ArrayList<>();
		String[] cols = { "Sn.", "Name", "Address", "Active", "Action" };

		public MyTableModel(ArrayList<Student> students) {
			super();
			this.students = students;
		}

		@Override
		public Class<?> getColumnClass(int col) {
			if (col == 0) {
				return Integer.class;
			} else if (col == 3) {
				return Boolean.class;
			} else if (col == 4) {
				return JButton.class;
			} else {
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
			if (students == null) {
				return 0;
			} else {
				return students.size();
			}
		}

		@Override
		public Object getValueAt(int row, int col) {
			Object obj = null;
			if (col == 0) {
				obj = students.get(row).getId();
			} else if (col == 1) {
				obj = students.get(row).getName();
			} else if (col == 2) {
				obj = students.get(row).getAddress();
			} else if (col == 3) {
				obj = students.get(row).isActive();
			} else if (col == 4) {
				obj = editList.get(row);
			}
			return obj;

		}
	}

	class JTableButtonRenderer extends DefaultTableCellRenderer {
		@Override
		public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
				int row, int column) {
			JButton button = (JButton) value;
			return button;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton clickedBtn = (JButton) e.getSource();
		for(JButton btn: editList) {
			if(btn.equals(clickedBtn)) {
				editStudent();
			}
		}
		
	}

	private void editStudent() {
		System.out.println("Student edit called!");
		
	}
	class JTableButtonMouseListener extends MouseAdapter {
        private final JTable table;
 
        public JTableButtonMouseListener(JTable table) {
            this.table = table;
        }
 
        public void mouseClicked(MouseEvent e) {
            int column = table.getColumnModel().getColumnIndexAtX(e.getX()); // get the coloum of the button
            int row    = e.getY()/table.getRowHeight(); //get the row of the button
 
                    //*Checking the row or column is valid or not
            if (row < table.getRowCount() && row >= 0  && column < table.getColumnCount() && column >= 0)  {
                Object value = table.getValueAt(row, column);
                if (value instanceof JButton) {
                    //perform a click event
                    ((JButton)value).doClick();
                }
            }
        }
    }
}