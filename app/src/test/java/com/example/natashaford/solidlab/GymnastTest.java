package com.example.natashaford.solidlab;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class GymnastTest {

    Athlete gymnast;

    @Before
    public void before(){
        gymnast = new Gymnast ("Natasha", 6, 2);
    }

    @Test
    public void checkCalculatePoints(){
        assertEquals(8, gymnast.calculatePoints());
    }

    @Test
    public void checkPrepared(){
        assertEquals("They have prepared for the event.", gymnast.prepare());
    }

    @Test
    public void checkCompeted(){
        assertEquals("They have now competed in the event.", gymnast.compete());
    }

    @Test
    public void checkMedalAwarded(){
        int points = gymnast.calculatePoints();
        assertEquals(" has been awarded bronze medal.", gymnast.awardMedal(points));
    }
}
