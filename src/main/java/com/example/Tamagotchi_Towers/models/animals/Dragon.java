package com.example.Tamagotchi_Towers.models.animals;

import com.example.Tamagotchi_Towers.models.User;

import javax.persistence.Entity;
import java.util.ArrayList;

@Entity
public class Dragon extends Animal{

    private ArrayList images;

    public Dragon(String animalName, int health, int happiness, int cleanliness,
                  int fitness, int hunger, User user){
        super(animalName, AnimalType.DRAGON, health, happiness, cleanliness, fitness, hunger, user);
        this.images = new ArrayList();
    }

    public Dragon(){

    }

    public ArrayList getImages() {
        return images;
    }
}
