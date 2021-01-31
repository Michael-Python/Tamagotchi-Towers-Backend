package com.example.Tamagotchi_Towers.models.animals;

import java.util.ArrayList;

public class Cat extends Animal{

    private AnimalType animalType;
    private ArrayList images;

    public Cat(){
        this.animalType = AnimalType.CAT;
        this.images = new ArrayList();
    }

    public AnimalType getAnimalType() {
        return animalType;
    }

    public ArrayList getImages() {
        return images;
    }
}
