package com.example.Tamagotchi_Towers.models.animals;

import com.example.Tamagotchi_Towers.models.User;

import java.util.ArrayList;

public class Unicorn extends Animal{

    private AnimalType animalType;
    private ArrayList images;

    public Unicorn(String animalName, int health, int happiness, int cleanliness,
                   int fitness, int hunger, User user){
        super(animalName, health, happiness, cleanliness, fitness, hunger, user);
        this.animalType = AnimalType.UNICORN;
        this.images = new ArrayList();
    }

    public AnimalType getAnimalType() {
        return animalType;
    }

    public ArrayList getImages() {
        return images;
    }
}
