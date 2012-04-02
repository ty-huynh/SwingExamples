package Basic;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class ExitListener extends WindowAdapter {
	
	public void windowClosing(WindowEvent e) {
		System.out.println("hey");
		System.exit(0);
	}
}

public class HelloSwing {
	
	public void createAndShowGUI() {
		//setup a window
		JFrame frame = new JFrame("Hello Swing");
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//create component and add to content pane
		JLabel label = new JLabel("Hello World");
		frame.getContentPane().add(label);
		
		frame.getContentPane().add(new JButton("Press to Exit"));
		frame.addWindowListener(new ExitListener());
		//Display window
		frame.setSize(400, 150);
//		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				(new HelloSwing()).createAndShowGUI();
			}
		});
	}
}
