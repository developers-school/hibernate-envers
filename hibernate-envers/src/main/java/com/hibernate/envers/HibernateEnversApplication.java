package com.hibernate.envers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

@SpringBootApplication
public class HibernateEnversApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateEnversApplication.class, args);
	}

	 @Bean
	 ApplicationRunner init(UserDetailsRepository userRepository) {
	     return (ApplicationArguments args) -> dataSetup(userRepository);
	 }
	 
	 private void dataSetup(UserDetailsRepository userRepository) {

	        UserDetails userDetails = new UserDetails(1, "developers_school", 1360);

	        userRepository.save(userDetails);// Create

	        userDetails.setFollowersCount(1450);
	        userRepository.save(userDetails);// Update-1

	        userDetails.setFollowersCount(1580);// Update-2
	        userRepository.save(userDetails);

	        userRepository.delete(userDetails);// Delete
	    }
}
