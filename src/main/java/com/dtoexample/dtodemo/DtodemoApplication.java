package com.dtoexample.dtodemo;

import com.dtoexample.dtodemo.model.Location;
import com.dtoexample.dtodemo.model.User;
import com.dtoexample.dtodemo.repository.LocationRepository;
import com.dtoexample.dtodemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DtodemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DtodemoApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private LocationRepository locationRepository;

	@Override
	public void run(String... args) throws Exception {

		Location location = new Location();
		location.setPlace("Pune");
		location.setDescripton("Nice Location");
		location.setLongitude(40.5);
		location.setLatitude(30.5);
		locationRepository.save(location);

		User user1 = new User();
		user1.setFirstName("John");
		user1.setLastName("Doe");
		user1.setEmail("john@doe.com");
		user1.setPassword("password");
		user1.setLocation(location);
		userRepository.save(user1);
	}

}
