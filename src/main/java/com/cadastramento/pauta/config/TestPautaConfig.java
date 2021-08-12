package com.cadastramento.pauta.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.cadastramento.pauta.entities.Pauta;
import com.cadastramento.pauta.repositories.PautaRepository;

@Configuration
@Profile("test")
public class TestPautaConfig implements CommandLineRunner{
	
	@Autowired
	private PautaRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
	
		Pauta u1 = new Pauta(null, "Maria Brown", "voto");
		Pauta u2 = new Pauta(null, "Alex Green", "voto");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}

}
