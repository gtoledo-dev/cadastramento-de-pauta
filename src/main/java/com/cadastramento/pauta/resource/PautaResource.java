package com.cadastramento.pauta.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cadastramento.pauta.entities.Pauta;
import com.cadastramento.pauta.services.PautaService;

@RestController
@RequestMapping(value = "/users")
public class PautaResource {
	
	@Autowired
	private PautaService service;
	
	@GetMapping
	public ResponseEntity<List<Pauta>> findAll() {
		List<Pauta> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

}
