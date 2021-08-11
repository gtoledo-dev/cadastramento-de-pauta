package com.cadastramento.pauta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cadastramento.pauta.entities.Pauta;

public interface PautaRepository extends JpaRepository<Pauta, Long> {

}
