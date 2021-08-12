package com.cadastramento.pauta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cadastramento.pauta.entities.Pauta;
import com.cadastramento.pauta.repositories.PautaRepository;

@Service
public class PautaService {
	
	@Autowired
	private PautaRepository repository;
	
	public List<Pauta> findAll() {
		return repository.findAll();
	}
	
	public Pauta findById(Long id) {
		Optional<Pauta> obj = repository.findById(id);
		return obj.get();
	}

}
