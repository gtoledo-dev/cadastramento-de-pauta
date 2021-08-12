package com.cadastramento.pauta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cadastramento.pauta.entities.Voto;
import com.cadastramento.pauta.repositories.VotoRepository;

@Service
public class VotoService {
	
	@Autowired
	public VotoRepository repository;
	
	public List<Voto> findAll(){
		return repository.findAll();
	}

}
