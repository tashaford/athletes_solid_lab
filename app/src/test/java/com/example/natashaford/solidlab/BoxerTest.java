package com.example.natashaford.solidlab;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BoxerTest {

    Athlete boxer;

    @Before
    public void before(){
        boxer = new Boxer ("Natasha", 23, 9);
    }

    @Test
    public void checkCalculatePoints(){
        assertEquals(14, boxer.calculatePoints());
    }

    @Test
    public void checkPrepared(){
        assertEquals("They have prepared for the event.", boxer.prepare());
    }

    @Test
    public void checkCompeted(){
        assertEquals("They have now competed in the event.", boxer.compete());
    }

    @Test
    public void checkMedalAwarded(){
        int points = boxer.calculatePoints();
        assertEquals(" has been awarded silver medal.", boxer.awardMedal(points));
    }
}
