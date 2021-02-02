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

        User stuart = new User("Stuart", "1", "fakeImgUrl");
        userRepository.save(stuart);

        User andy = new User("Andy", "2", "fakeImgUrl");
        userRepository.save(andy);

        User emily = new User("Emily", "3", "fakeImgUrl");
        userRepository.save(emily);

        User ruth = new User("Ruth", "4", "fakeImgUrl");
        userRepository.save(ruth);

        User michael = new User("Michael", "5", "fakeImgUrl");
        userRepository.save(michael);

        Animal toto = new Animal("Toto", AnimalType.DOG, michael);
        animalRepository.save(toto);

        Animal salem = new Animal("Salem", AnimalType.CAT, ruth);
        animalRepository.save(salem);
        salem.addImageURL("catHeart");
        salem.addImageURL("catMeow");
        salem.addImageURL("catExclamation");
        salem.addImageURL("catRIP");
        animalRepository.save(salem);

        Animal pingu = new Animal("Pingu", AnimalType.PENGUIN, stuart);
        animalRepository.save(pingu);

        Animal smaug = new Animal("Smaug", AnimalType.DRAGON, emily);
        animalRepository.save(smaug);

        Animal charlie = new Animal("Charlie", AnimalType.UNICORN, andy);
        animalRepository.save(charlie);
    }
}
