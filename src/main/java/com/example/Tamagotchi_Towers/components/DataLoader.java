package com.example.Tamagotchi_Towers.components;

import com.example.Tamagotchi_Towers.models.User;
import com.example.Tamagotchi_Towers.models.animals.*;
import com.example.Tamagotchi_Towers.repositories.AnimalRepository;
import com.example.Tamagotchi_Towers.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner{

    @Autowired
    AnimalRepository animalRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){

        User stuart = new User("Stuart", "ILikePenguins7", "fakeImgUrl");
        userRepository.save(stuart);

        User andy = new User("Andy", "MusicIsLife", "fakeImgUrl");
        userRepository.save(andy);

        User emily = new User("Emily", "IHeartCartoons", "fakeImgUrl");
        userRepository.save(emily);

        User ruth = new User("Ruth", "AnimalGIFsAreGr8", "fakeImgUrl");
        userRepository.save(ruth);

        User michael = new User("Michael", "LoveLearning", "fakeImgUrl");
        userRepository.save(michael);

        Dog toto = new Dog("Toto", michael);
        animalRepository.save(toto);

        Cat salem = new Cat("Salem", ruth);
        animalRepository.save(salem);

        Penguin pingu = new Penguin("Pingu", stuart);
        animalRepository.save(pingu);

        Dragon smaug = new Dragon("Smaug", emily);
        animalRepository.save(smaug);

        Unicorn charlie = new Unicorn("Charlie", andy);
        animalRepository.save(charlie);
    }
}
