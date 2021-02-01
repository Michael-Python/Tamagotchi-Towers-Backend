package com.example.Tamagotchi_Towers.models.animals;

import com.example.Tamagotchi_Towers.models.User;

import javax.persistence.Entity;
import java.util.ArrayList;

@Entity
public class Dog extends Animal{

    private ArrayList images;

    public Dog(String animalName, User user){
        super(animalName, AnimalType.DOG, 100, 100, 100, 100, 100, user);
        this.images = new ArrayList();
    }

    public Dog(){

    }

    public ArrayList getImages() {
        return images;
    }
}
