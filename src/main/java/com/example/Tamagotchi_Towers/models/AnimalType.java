package com.example.Tamagotchi_Towers.models;

public enum AnimalType {

    DOG(1.2,1.5,1,1.75),
    CAT(1.2,1, 1.25, 1),
    MONKEY(1.5, 1.75, 1.25, 1.75),
    PENGUIN(1.25,2,1, 1.25),
    UNICORN(2,1,1,2),
    DRAGON(3,1.5,2, 1.5);

    private final double appetite;
    private final double grooming;
    private final double cheeriness;
    private final double activityLevel;

    AnimalType(double appetite, double grooming, double cheeriness, double activityLevel){
        this.appetite = appetite;
        this.grooming = grooming;
        this.cheeriness = cheeriness;
        this.activityLevel = activityLevel;
    }

    public double getAppetite() {
        return appetite;
    }

    public double getGrooming() {
        return grooming;
    }

    public double getCheeriness() {
        return cheeriness;
    }

    public double getActivityLevel() {
        return activityLevel;
    }
}
