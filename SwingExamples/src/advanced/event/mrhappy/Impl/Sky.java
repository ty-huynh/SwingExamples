package advanced.event.mrhappy.Impl;

import advanced.event.mrhappy.Mood;
import advanced.event.mrhappy.MoodEvent;
import advanced.event.mrhappy.MoodListener;

public class Sky implements MoodListener{

	@Override
	public void moodReceived(MoodEvent event) {
		// TODO Auto-generated method stub
		if( event.mood() == Mood.HAPPY ) {
            System.out.println( "Sun is shining!" );
        }
        else if(event.mood() == Mood.ANNOYED) {
            System.out.println( "Cloudy Skies!" );
        }
        else {
            System.out.println( "Lightning rains from the heavens!" );
        }
	}

}
