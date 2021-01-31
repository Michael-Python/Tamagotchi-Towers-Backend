package com.example.Tamagotchi_Towers.models.animals;

import java.util.ArrayList;

public class Unicorn extends Animal{

    private AnimalType animalType;
    private ArrayList images;

    public Unicorn(){
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
