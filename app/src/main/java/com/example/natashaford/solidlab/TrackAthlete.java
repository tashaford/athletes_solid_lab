package com.example.natashaford.solidlab;


public class TrackAthlete {
    private int distanceSingle = 0;
    private int distanceTotal = 0;
    private String name;

    public TrackAthlete(String name) {
        this.name = name;
    }

    public int getDistanceSingle(){
        return distanceSingle;
    }

    public void updateDistanceTotal() {
        distanceTotal += distanceSingle;
    }

    public int getDistanceTotal(){
        return distanceTotal;
    }

    public String getName() {
        return name;
    }

    public void setDistanceSingle(int distanceSingle) {
        this.distanceSingle = distanceSingle;
    }
}
