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

import com.cadastramento.pauta.entities.Pauta;
import com.cadastramento.pauta.services.PautaService;

@RestController
@RequestMapping(value = "/pauta")
public class PautaResource {
	
	@Autowired
	private PautaService service;
	
	@GetMapping
	public ResponseEntity<List<Pauta>> findAll() {
		List<Pauta> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Pauta> findById(@PathVariable Long id){
		Pauta obj = service.findById(id);
		return ResponseEntity.ok().body(obj);	
	}
	
	@PostMapping
	public ResponseEntity<Pauta> insert(@RequestBody Pauta obj){
		obj = service.insert(obj);
		return ResponseEntity.ok().body(obj);
	}
	

}
