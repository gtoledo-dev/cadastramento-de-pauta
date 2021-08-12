package com.cadastramento.pauta.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.cadastramento.pauta.entities.Sessao;
import com.cadastramento.pauta.repositories.SessaoRepository;

@Configuration
@Profile("test")
public class TestSessaoConfig implements CommandLineRunner{
	
	@Autowired
	public SessaoRepository sessaoRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Sessao s1 = new Sessao(null, "123", "11/08/2021", "2 min");
		
		sessaoRepository.saveAll(Arrays.asList(s1));
		
	}

}
