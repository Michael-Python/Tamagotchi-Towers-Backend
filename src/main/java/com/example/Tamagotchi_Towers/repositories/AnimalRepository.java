package com.example.Tamagotchi_Towers.repositories;

import com.example.Tamagotchi_Towers.models.animals.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {
}
