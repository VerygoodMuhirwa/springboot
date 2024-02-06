package com.example.demo;

import com.example.demo.Repository.UserRepository;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User user1 = User.builder()
				.firstname("Verygood")
				.lastname("Muhirwa")
				.email("verygoodmuhirwa2@gmail.com")
				.build();
		userRepository.save(user1);

		User user2 = User.builder()
				.firstname("Nduwayo")
				.lastname("Nathan")
				.email("nduwayonathan5@gmail.com")
				.build();
		userRepository.save(user2);

		User user3 = User.builder()
				.firstname("Shima")
				.lastname("Lisa")
				.email("shimalisa2@gmail.com")
				.build();
		userRepository.save(user3);

		User user4 = User.builder()
				.firstname("Mwungere")
				.lastname("Elite")
				.email("elitemwungere56@gmail.com")
				.build();
		userRepository.save(user4);

		User user5 = User.builder()
				.firstname("Rukundo")
				.lastname("Emmanuel")
				.email("rukundoemmanuel@gmail.com")
				.build();
		userRepository.save(user5);



	}
}
	