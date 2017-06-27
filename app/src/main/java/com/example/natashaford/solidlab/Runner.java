package com.example.natashaford.solidlab;


public class Runner {

    public static void main(String[] arg) {
        Athlete boxerOne = new Boxer("Robert", 21, 13);
        Athlete boxerTwo = new Boxer("Chuck", 32, 15);
        Event boxingMatch = new Event("boxing match");
        boxingMatch.addParticipant(boxerOne);
        boxingMatch.addParticipant(boxerTwo);
        UI uiBoxing = new UI(boxingMatch);
        uiBoxing.runEvent();

        Athlete gymnastOne = new Gymnast("Laura", 4, 6);
        Event gymnasticTournament = new Event("gymnastic tournament");
        gymnasticTournament.addParticipant(gymnastOne);
        UI uiGymnastic = new UI(gymnasticTournament);
        uiGymnastic.runEvent();
    }

}
