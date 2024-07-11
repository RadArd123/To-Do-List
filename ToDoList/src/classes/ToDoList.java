package classes;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class ToDoList {
	
	public static void main(String args[])
	{
		AppFrame frame = new AppFrame();
		
		 ImageIcon appIcon = new ImageIcon("src/resources/1950715.png");
	        if (appIcon.getImageLoadStatus() == java.awt.MediaTracker.COMPLETE) {
	            // Set the icon for the frame
	            frame.setIconImage(appIcon.getImage());
	        } else {
	            System.out.println("Failed to load icon image.");
	        }

	      
	        frame.setVisible(true);
	    }
}
