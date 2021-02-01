package com.example.Tamagotchi_Towers.models.animals;

import com.example.Tamagotchi_Towers.models.User;

import javax.persistence.Entity;
import java.util.ArrayList;

@Entity
public class Unicorn extends Animal{

    private ArrayList images;

    public Unicorn(String animalName, User user){
        super(animalName, AnimalType.UNICORN, 100, 100, 100, 100, 100, user);
        this.images = new ArrayList();
    }

    public Unicorn(){

    }

    public ArrayList getImages() {
        return images;
    }
}
