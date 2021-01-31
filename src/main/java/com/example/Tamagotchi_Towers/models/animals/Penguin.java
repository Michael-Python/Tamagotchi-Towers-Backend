package com.example.Tamagotchi_Towers.models.animals;

import com.example.Tamagotchi_Towers.models.User;

import javax.persistence.Entity;
import java.util.ArrayList;

@Entity
public class Penguin extends Animal{

    private ArrayList images;

    public Penguin(String animalName, int health, int happiness, int cleanliness,
                   int fitness, int hunger, User user){
        super(animalName, AnimalType.PENGUIN, health, happiness, cleanliness, fitness, hunger, user);
        this.images = new ArrayList();
    }

    public Penguin(){

    }

    public ArrayList getImages() {
        return images;
    }
}
