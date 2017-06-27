package com.example.natashaford.solidlab;

import java.util.ArrayList;


public class Event {

    ArrayList<Athlete> participants;
    private String name;

    public Event(String name){
        this.name = name;
        this.participants = new ArrayList<Athlete>();
    }

    public void addParticipant(Athlete participant){
        participants.add(participant);
    }

    public String getName() {
        return name;
    }
}
