package com.cadastramento.pauta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cadastramento.pauta.entities.Sessao;
import com.cadastramento.pauta.repositories.SessaoRepository;

@Service
public class SessaoService {
	
	@Autowired
	public SessaoRepository repository;
	
	public List<Sessao> findAll(){
		return repository.findAll();
	}

}