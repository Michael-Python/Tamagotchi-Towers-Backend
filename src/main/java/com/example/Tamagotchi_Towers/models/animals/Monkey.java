package com.example.Tamagotchi_Towers.models.animals;

import com.example.Tamagotchi_Towers.models.User;

import javax.persistence.Entity;
import java.util.ArrayList;

@Entity
public class Monkey extends Animal{

    private ArrayList images;

    public Monkey(String animalName, User user){
        super(animalName, AnimalType.MONKEY, 100, 100, 100, 100, 100, user);
        this.images = new ArrayList();
    }

    public Monkey(){

    }

    public ArrayList getImages() {
        return images;
    }
}
