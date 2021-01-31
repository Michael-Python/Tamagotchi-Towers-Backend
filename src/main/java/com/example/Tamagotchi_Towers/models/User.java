package com.example.Tamagotchi_Towers.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "password")
    private String password;

    @Column(name = "display_image")
    private String imageURL;

    @JsonIgnoreProperties({"user"})
    @OneToMany(mappedBy = "user")
    private List<Animal> animals;

    public User(String userName, String password, String imageURL){
        this.userName = userName;
        this.password = password;
        this.imageURL = imageURL;
        this.animals = new ArrayList<Animal>();
    }

    public User(){

    }

}
