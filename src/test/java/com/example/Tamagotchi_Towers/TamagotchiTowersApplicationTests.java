package com.example.Tamagotchi_Towers;

import com.example.Tamagotchi_Towers.models.User;
import com.example.Tamagotchi_Towers.repositories.AnimalRepository;
import com.example.Tamagotchi_Towers.repositories.UserRepository;
import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

//@RunWith(SpringRunner.class)
@SpringBootTest
class TamagotchiTowersApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Autowired
	AnimalRepository animalRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void checkingUserProperties(){
		User user = userRepository.getOne(1L);
		assertEquals("Stuart", user.getUserName());
		assertEquals("ILikePenguins7", user.getPassword());
		assertEquals("fakeImgUrl", user.getImageURL());
		assertEquals(1, user.getAnimals().size());
	}

}
