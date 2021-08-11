package com.cadastramento.pauta.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.cadastramento.pauta.entities.User;
import com.cadastramento.pauta.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
	
		User u1 = new User(null, "Maria Brown", "37000055532", "voto");
		User u2 = new User(null, "Alex Green", "41000085635", "voto");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}

}
