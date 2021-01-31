package com.example.Tamagotchi_Towers.models.animals;

import java.util.ArrayList;

public class Penguin extends Animal{

    private AnimalType animalType;
    private ArrayList images;

    public Penguin(){
        this.animalType = AnimalType.PENGUIN;
        this.images = new ArrayList();
    }

    public AnimalType getAnimalType() {
        return animalType;
    }

    public ArrayList getImages() {
        return images;
    }
}
