package classes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class ButtonPanel extends JPanel {

	JButton addTask;
	JButton deleteTask;
	 
	Border emptyBorder = BorderFactory.createEmptyBorder();

	ButtonPanel(){
	   
	   this.setPreferredSize(new Dimension(500, 100));
	   this.setBackground(Color.LIGHT_GRAY);
	   
	   addTask = new JButton("Add Task");
	   addTask.setBorder(emptyBorder);
	   addTask.setFont(new Font("Sans-serif",Font.PLAIN,20));
	   this.add(addTask); 
	   
	   this.add(Box.createHorizontalStrut(20));
	   deleteTask = new JButton("Delete Task");
	   deleteTask.setBorder(emptyBorder);
	   deleteTask.setFont(new Font("Sans-serif",Font.PLAIN,20));
	   this.add(deleteTask);
	   
   }
	public JButton getAddTask() {
		return addTask;
	}
	public JButton getDeleteTask() {
		return deleteTask;
	}

}
