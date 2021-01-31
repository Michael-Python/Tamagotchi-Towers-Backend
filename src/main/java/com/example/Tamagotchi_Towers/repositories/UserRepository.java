package com.example.Tamagotchi_Towers.repositories;

import com.example.Tamagotchi_Towers.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
