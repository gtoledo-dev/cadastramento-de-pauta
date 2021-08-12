package com.cadastramento.pauta.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cadastramento.pauta.entities.Voto;
import com.cadastramento.pauta.services.VotoService;

@RestController
@RequestMapping(value = "/voto")
public class VotoResource {
	
	@Autowired
	public VotoService service;
	
	@GetMapping
	public ResponseEntity<List<Voto>> findAll(){
		List<Voto> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Voto> findById(@PathVariable Long id){
		Voto obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
		
	}
	
	@PostMapping
	public ResponseEntity<Voto> insert(@RequestBody Voto obj){
		obj = service.insert(obj);
		return ResponseEntity.ok().body(obj);
	}

}
