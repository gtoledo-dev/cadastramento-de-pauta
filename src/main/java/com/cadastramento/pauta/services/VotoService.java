package com.cadastramento.pauta.services;

import java.util.List;
import java.util.Optional;

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
	
	public Voto findById(Long id) {
		Optional<Voto> obj = repository.findById(id);
		return obj.get();
	}
	
	public Voto insert(Voto obj) {
		return repository.save(obj);
	}

}
