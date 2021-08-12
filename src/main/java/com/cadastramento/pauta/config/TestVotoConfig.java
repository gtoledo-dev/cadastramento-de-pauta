package com.cadastramento.pauta.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.cadastramento.pauta.entities.Voto;
import com.cadastramento.pauta.repositories.VotoRepository;

@Configuration
@Profile("test")
public class TestVotoConfig implements CommandLineRunner{

	@Autowired
	public VotoRepository votoRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Voto v1 = new Voto(null, "12345", "37000055532");
		
		votoRepository.saveAll(Arrays.asList(v1));
		
		
	}

}
