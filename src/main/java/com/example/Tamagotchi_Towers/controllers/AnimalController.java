package com.example.Tamagotchi_Towers.controllers;

import com.example.Tamagotchi_Towers.models.animals.Animal;
import com.example.Tamagotchi_Towers.repositories.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AnimalController {

    @Autowired
    AnimalRepository animalRepository;

    @GetMapping(value = "/animals")
    public ResponseEntity<List<Animal>> getAllAnimals(){
        return new ResponseEntity<>(animalRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/animals/{id}")
    public ResponseEntity getAnimal(@PathVariable Long id){
        return new ResponseEntity(animalRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/animals")
    public ResponseEntity<Animal> postAnimal(@RequestBody Animal animal){
        animalRepository.save(animal);
        return new ResponseEntity<>(animal, HttpStatus.CREATED);
    }
}
