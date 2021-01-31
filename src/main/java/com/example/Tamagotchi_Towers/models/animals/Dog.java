package com.example.Tamagotchi_Towers.models.animals;

import java.util.ArrayList;

public class Dog extends Animal{

    private AnimalType animalType;
    private ArrayList images;

    public Dog(){
        this.animalType = AnimalType.DOG;
        this.images = new ArrayList();
    }

    public AnimalType getAnimalType() {
        return animalType;
    }

    public ArrayList getImages() {
        return images;
    }
}
