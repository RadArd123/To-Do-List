package classes;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class AppFrame extends JFrame {

	private TitleBar titleBar;
	private List list;
	private ButtonPanel buttonPanel;
	private JButton addTask;
	private JButton deleteTask;

	AppFrame() {
		// Initialize components
		titleBar = new TitleBar();
		list = new List();
		buttonPanel = new ButtonPanel();
        
		// Set layout manager for the frame
		this.setLayout(new BorderLayout());
		

		// Add components to the frame
		this.add(titleBar, BorderLayout.NORTH);
		this.add(buttonPanel, BorderLayout.SOUTH);
		this.add(list, BorderLayout.CENTER);
		addTask = buttonPanel.getAddTask();
		deleteTask = buttonPanel.getDeleteTask();
		addListeners();

		// Set the size, default close operation, and visibility of the frame
		this.setSize(500, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public void addListeners() {
		addTask.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Task task = new Task();
				list.add(task);
				list.updateNumbers();
				task.getDone().addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent e)

					{
						task.changeState();
						revalidate();

					}
				});
				revalidate();
			}
		});

		deleteTask.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {

				list.removeCompletedTasks();
				repaint();

			}

		});

	}

}
