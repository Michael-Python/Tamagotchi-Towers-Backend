package com.example.Tamagotchi_Towers.models.animals;

import com.example.Tamagotchi_Towers.models.User;

import javax.persistence.Entity;
import java.util.ArrayList;

@Entity
public class Cat extends Animal{

    private AnimalType animalType;
    private ArrayList images;

    public Cat(String animalName, int health, int happiness, int cleanliness,
               int fitness, int hunger, User user){
        super(animalName, health, happiness, cleanliness, fitness, hunger, user);
        this.animalType = AnimalType.CAT;
        this.images = new ArrayList();
    }

    public Cat(){

    }

    public AnimalType getAnimalType() {
        return animalType;
    }

    public ArrayList getImages() {
        return images;
    }
}
