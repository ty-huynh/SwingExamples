package advanced.event.mrhappy.Impl;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import advanced.event.mrhappy.Mood;
import advanced.event.mrhappy.MoodEvent;
import advanced.event.mrhappy.MoodEventGenerator;
import advanced.event.mrhappy.MoodListener;

public class MrHappyGUI extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	MoodEventGenerator _happy = new MoodEventGenerator();
	private JComboBox _cbbStatus;
	private JLabel _lbStatus = new JLabel("Status: ");
	private JTextField _tfStatus = new JTextField("Status: ", 20);
	private Mood status[] = {Mood.HAPPY, Mood.ANNOYED, Mood.ANGRY};
	private MrHappyGUI _init() {
		_cbbStatus = new JComboBox(status);
		_cbbStatus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				MrHappyGUI.this._lbStatus.setText("Status: " + _cbbStatus.getSelectedItem().toString());
				MrHappyGUI.this._happy.changeMood((Mood)MrHappyGUI.this._cbbStatus.getSelectedItem());
			}
		});
		_happy.addMoodListener(new MoodListener() {
			
			@Override
			public void moodReceived(MoodEvent event) {
				// TODO Auto-generated method stub
				MrHappyGUI.this._tfStatus.setText("Status: " + event.mood().toString());
			}
		});
		
		setLayout(new BorderLayout());
		add(_lbStatus, BorderLayout.NORTH);
		add(_cbbStatus, BorderLayout.CENTER);
		add(_tfStatus, BorderLayout.SOUTH);
		
		return this;
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("MR HAPPY EVENT");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout(FlowLayout.CENTER));
		frame.add(new MrHappyGUI()._init());
		frame.setSize(400, 200);
		frame.setVisible(true);
	}
}
