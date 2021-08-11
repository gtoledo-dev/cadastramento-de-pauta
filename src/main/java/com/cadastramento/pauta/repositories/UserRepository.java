package com.cadastramento.pauta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cadastramento.pauta.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
