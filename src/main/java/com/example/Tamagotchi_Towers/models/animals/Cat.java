package com.example.Tamagotchi_Towers.models.animals;

import com.example.Tamagotchi_Towers.models.User;

import javax.persistence.Entity;
import java.util.ArrayList;

@Entity
public class Cat extends Animal{

    private ArrayList images;

    public Cat(String animalName, User user){
        super(animalName, AnimalType.CAT, 100, 100, 100, 100, 100, user);
        this.images = new ArrayList();
    }

    public Cat(){

    }

    public ArrayList getImages() {
        return images;
    }
}
