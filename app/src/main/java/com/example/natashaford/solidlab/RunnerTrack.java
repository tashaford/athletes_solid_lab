package com.example.natashaford.solidlab;


public class RunnerTrack {

    public static void main(String[] arg) {
        TrackAthlete athleteOne = new TrackAthlete("Megan");
        UITrackAthlete track = new UITrackAthlete(athleteOne);
        athleteOne.setDistanceSingle(10);
        athleteOne.updateDistanceTotal();
        track.welcome();
    }
}
