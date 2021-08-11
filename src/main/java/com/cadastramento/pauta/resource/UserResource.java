package com.cadastramento.pauta.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cadastramento.pauta.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> finAll() {
		User u = new User(1L, "Maria", "940403030", "voto");
		return ResponseEntity.ok().body(u);
	}

}
