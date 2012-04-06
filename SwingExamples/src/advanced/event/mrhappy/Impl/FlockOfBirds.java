package advanced.event.mrhappy.Impl;

import advanced.event.mrhappy.Mood;
import advanced.event.mrhappy.MoodEvent;
import advanced.event.mrhappy.MoodListener;

public class FlockOfBirds implements MoodListener {
	public void moodReceived(MoodEvent event) {
        if(event.mood() == Mood.HAPPY) {
            System.out.println( "Birds are singing!" );
        }
        else if(event.mood() == Mood.ANNOYED) {
            System.out.println( "Birds are silent!" );
        }
        else {
            System.out.println( "Birds are flying away!" );
        }
    }
}
