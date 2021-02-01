package com.example.Tamagotchi_Towers.repositories;

import com.example.Tamagotchi_Towers.models.User;
import com.example.Tamagotchi_Towers.models.animals.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {

    List<Animal> findAnimalByName(String name);

    List<Animal> findAnimalByUser(User user);
}
