package com.example.natashaford.solidlab;


public class Gymnast extends Athlete {

    private String name;
    int pointsDifficulty;
    int pointsExecution;

    public Gymnast(String name, int pointsDifficulty, int pointsExecution){
        super(name);
        this.pointsDifficulty = pointsDifficulty;
        this.pointsExecution = pointsExecution;
    }

    public int calculatePoints() {
        return pointsDifficulty + pointsExecution;
    }
    }
