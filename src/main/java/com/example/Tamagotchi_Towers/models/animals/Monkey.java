package com.example.Tamagotchi_Towers.models.animals;

import java.util.ArrayList;

public class Monkey extends Animal{

    private AnimalType animalType;
    private ArrayList images;

    public Monkey(){
        this.animalType = AnimalType.MONKEY;
        this.images = new ArrayList();
    }

    public AnimalType getAnimalType() {
        return animalType;
    }

    public ArrayList getImages() {
        return images;
    }
}
