package com.example.natashaford.solidlab;


public abstract class Athlete {

    private String name;


    public Athlete(String name){
        this.name = name;
    }

    public String prepare(){
        return "They have prepared for the event.";
    }

    public String compete(){
        return "They have now competed in the event.";
    }

    public String awardMedal(int points) {
        int i = 0;
        if (points >= 15) i = 1;
        if (points >= 10 && points <= 14) i = 2;
        if (points >= 5 && points <= 9) i = 3;
        switch (i) {
            case 1:
                return " has been awarded gold medal.";
            case 2:
                return " has been awarded silver medal.";
            case 3:
                return " has been awarded bronze medal.";
            default:
                return " hasn't been awarded a medal.";
        }
    }

    public abstract int calculatePoints();

    public String getName() {
        return name;
    }


}
