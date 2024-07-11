package classes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class TitleBar extends JPanel {

	TitleBar() {
		this.setPreferredSize(new Dimension(500, 100));
		this.setBackground(Color.LIGHT_GRAY);
		JLabel titleText = new JLabel("To-Do-List");
		titleText.setPreferredSize(new Dimension(180, 80));
		Font font = new Font("Sans-serif", Font.BOLD, 28);
		titleText.setFont(font);
		this.add(titleText);

	}

}
