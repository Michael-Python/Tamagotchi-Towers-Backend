package com.example.Tamagotchi_Towers.models.animals;

import java.util.ArrayList;

public class Dragon extends Animal{

    private AnimalType animalType;
    private ArrayList images;

    public Dragon(){
        this.animalType = AnimalType.DRAGON;
        this.images = new ArrayList();
    }

    public AnimalType getAnimalType() {
        return animalType;
    }

    public ArrayList getImages() {
        return images;
    }
}
