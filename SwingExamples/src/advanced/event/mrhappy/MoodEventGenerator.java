package advanced.event.mrhappy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MoodEventGenerator {
	
	private Mood _mood = Mood.HAPPY;
	@SuppressWarnings("rawtypes")
	private List _listeners = new ArrayList();
	
	public synchronized void receivePinch() {
		if (_mood == Mood.HAPPY) {
			_mood = Mood.ANNOYED;
			_fireMoodEvent();
		} else {
			_mood = Mood.ANGRY;
			_fireMoodEvent();
		}
	}
	
	public synchronized void receiveHug() {
        if( _mood == Mood.ANGRY ) {
            _mood = Mood.ANNOYED;
            _fireMoodEvent();
        } else {
            _mood = Mood.HAPPY;
            _fireMoodEvent();
        }
    }
	
	public synchronized void changeMood(Mood mood) {
		_mood = mood;
		_fireMoodEvent();
	}
	
    @SuppressWarnings("unchecked")
	public synchronized void addMoodListener( MoodListener l ) {
        _listeners.add( l );
    }
    
    public synchronized void removeMoodListener( MoodListener l ) {
        _listeners.remove( l );
    }
     
    private synchronized void _fireMoodEvent() {
        MoodEvent mood = new MoodEvent( this, _mood );
        @SuppressWarnings("rawtypes")
		Iterator listeners = _listeners.iterator();
        while( listeners.hasNext() ) {
            ( (MoodListener) listeners.next() ).moodReceived( mood );
        }
    }
	
}
