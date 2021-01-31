package com.example.Tamagotchi_Towers.models.animals;

import com.example.Tamagotchi_Towers.models.User;

import javax.persistence.Entity;
import java.util.ArrayList;

@Entity
public class Monkey extends Animal{

    private ArrayList images;

    public Monkey(String animalName, int health, int happiness, int cleanliness,
                  int fitness, int hunger, User user){
        super(animalName, AnimalType.MONKEY, health, happiness, cleanliness, fitness, hunger, user);
        this.images = new ArrayList();
    }

    public Monkey(){

    }

    public ArrayList getImages() {
        return images;
    }
}
