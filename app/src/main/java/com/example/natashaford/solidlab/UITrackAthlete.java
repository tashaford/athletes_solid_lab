package com.example.natashaford.solidlab;


import android.text.style.SubscriptSpan;

import java.util.Scanner;

public class UITrackAthlete {

    TrackAthlete trackAthlete;
    ViewLogger viewLogger;
    SaveLogger saveLogger;
    private Scanner sc;

    public UITrackAthlete(TrackAthlete trackAthlete){
        this.trackAthlete = trackAthlete;
        this.viewLogger = new ViewLogger();
        this.saveLogger = new SaveLogger();
        sc = new Scanner(System.in);
    }

    public void welcome(){
        System.out.println("Would you like to save to text file or print to screen?");
        System.out.println("Please write 1 to save or 2 to print");
        int input = sc.nextInt();
        runTrackAthlete(input);
    }

    public void runTrackAthlete(int selection){
        if (selection == 1) {
            writeToSave(trackAthlete.getName() + " has went out for a run.");
            writeToSave("They ran " + trackAthlete.getDistanceSingle() + " kilometers for this run.");
            writeToSave("They have ran a total of " + trackAthlete.getDistanceTotal() + " so far.");
            writeToSave("");
        }
        if (selection == 2){
            putToViewer(trackAthlete.getName() + " has went out for a run.");
            putToViewer("They ran " + trackAthlete.getDistanceSingle() + " kilometers for this run.");
            putToViewer("They have ran a total of " + trackAthlete.getDistanceTotal() + " so far.");
            putToViewer("");
        }
    }

    public void writeToSave(String string){
        saveLogger.output(string);
    }

    public void putToViewer(String string){
        viewLogger.output(string);
    }


}
