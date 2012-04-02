package Basic;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.UIManager;

public class JAppletHello extends JApplet{
	
	public void setNativeLookAndFeel() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}catch(Exception e) {
			System.out.println("Error setting native LAF: " + e);
		}
	}
	public void init() {
		setNativeLookAndFeel();
		Container content = getContentPane();
		content.setBackground(Color.black);
		content.setLayout(new FlowLayout());
		content.add(new JButton("Button 1"));
		content.add(new JButton("Button 2"));
		content.add(new JButton("Button 3"));
	}
}
