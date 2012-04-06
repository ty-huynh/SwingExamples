package advanced.event.mrhappy;

import java.util.EventObject;

public class MoodEvent extends EventObject {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Mood _mood;
	
	public MoodEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}
	
	public MoodEvent(Object source, Mood mood) {
		super(source);
		_mood = mood;
	}
	
	public Mood mood() {
		return _mood;
	}
}
