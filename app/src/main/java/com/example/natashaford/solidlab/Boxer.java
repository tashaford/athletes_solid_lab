package com.example.natashaford.solidlab;


public class Boxer extends Athlete {

    private String name;
    int hitsGiven;
    int hitsTaken;

    public Boxer(String name, int hitsGiven, int hitsTaken) {
        super(name);
        this.hitsGiven = hitsGiven;
        this.hitsTaken = hitsTaken;
    }

    public int calculatePoints(){
        return hitsGiven - hitsTaken;
    }
}