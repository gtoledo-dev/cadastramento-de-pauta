package com.cadastramento.pauta.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cadastramento.pauta.entities.Sessao;
import com.cadastramento.pauta.services.SessaoService;

@RestController
@RequestMapping(value = "/sessao")
public class SessaoResource {
	
	@Autowired
	public SessaoService service;
	
	@GetMapping
	public ResponseEntity<List<Sessao>> findAll(){
		List<Sessao> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

}
