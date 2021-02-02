package com.example.Tamagotchi_Towers.models.animals;

import com.example.Tamagotchi_Towers.models.User;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "animals")
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "animal_name")
    private String animalName;

    @Column(name = "animal_type")
    private AnimalType animalType;

    @Column(name = "health")
    private int health;

    @Column(name = "happiness")
    private int happiness;

    @Column(name = "cleanliness")
    private int cleanliness;

    @Column(name = "fitness")
    private int fitness;

    @Column(name = "hunger")
    private int hunger;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    @JsonIgnoreProperties({"animals"})
    private User user;

    @Column
    private ArrayList images;

    public Animal(String animalName, AnimalType animalType, User user){
        this.animalName = animalName;
        this.animalType = animalType;
        this.health = 100;
        this.happiness = 100;
        this.cleanliness = 100;
        this.fitness = 100;
        this.hunger = 100;
        this.user = user;
        this.images = new ArrayList();
    }

    public Animal(){

    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getHealth() {
        return health;
    }

    public int getHappiness() {
        return happiness;
    }

    public int getCleanliness() {
        return cleanliness;
    }

    public int getFitness() {
        return fitness;
    }

    public int getHunger() {
        return hunger;
    }

    public User getUser() {
        return user;
    }

    public AnimalType getAnimalType() {
        return animalType;
    }

    public double getAppetite(){
        return animalType.getAppetite();
    }

    public double getGrooming(){
        return animalType.getGrooming();
    }

    public double getCheeriness(){
        return animalType.getCheeriness();
    }

    public double getActivityLevel(){
        return animalType.getActivityLevel();
    }

    public Long getId() {
        return id;
    }

    public ArrayList getImages() {
        return images;
    }

    public void setImages(ArrayList images) {
        this.images = images;
    }
}
