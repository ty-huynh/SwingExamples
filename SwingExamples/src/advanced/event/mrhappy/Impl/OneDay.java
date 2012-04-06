package advanced.event.mrhappy.Impl;

import advanced.event.mrhappy.MoodListener;
import advanced.event.mrhappy.MoodEventGenerator;



public class OneDay {
    public static void main( String [] args ) {
        MoodEventGenerator happy = new MoodEventGenerator();
        MoodListener  sky   = new Sky();
        MoodListener  birds = new FlockOfBirds();
        happy.addMoodListener( sky );
        happy.addMoodListener( birds );
        
        System.out.println( "Let's pinch MrHappyObject and find out what happens:" );
        happy.receivePinch();
        
        System.out.println("");
        System.out.println( "Let's hug MrHappyObject and find out what happens:" );
        happy.receiveHug();
        
        System.out.println("");
        System.out.println( "Now, let's make MrHappyObject angry and find out what happens:" );
        System.out.println("");
        System.out.println("one pinch:");
        happy.receivePinch();
        System.out.println("");
        System.out.println("second pinch, look out:");
        happy.receivePinch();
        
        happy.removeMoodListener(sky);
        happy.removeMoodListener(birds);
    }
    
}
