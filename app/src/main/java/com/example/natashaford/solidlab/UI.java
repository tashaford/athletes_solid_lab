package com.example.natashaford.solidlab;


public class UI {
    Event event;

    public UI(Event event){
        this.event = event;
    }

    public void runEvent(){
        for (Athlete participant : event.participants){
            System.out.println(participant.getName() + " is taking part in a " + event.getName());
            System.out.println(participant.prepare());
            System.out.println(participant.compete());
            int points = participant.calculatePoints();
            System.out.println(participant.getName() + participant.awardMedal(points));
            System.out.println();
        }
    }

}
