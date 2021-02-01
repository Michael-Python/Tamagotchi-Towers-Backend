package com.example.Tamagotchi_Towers.models.animals;

import com.example.Tamagotchi_Towers.models.User;

import javax.persistence.Entity;
import java.util.ArrayList;

@Entity
public class Dragon extends Animal{

    private ArrayList images;

    public Dragon(String animalName, User user){
        super(animalName, AnimalType.DRAGON, 100, 100, 100, 100, 100, user);
        this.images = new ArrayList();
    }

    public Dragon(){

    }

    public ArrayList getImages() {
        return images;
    }
}
