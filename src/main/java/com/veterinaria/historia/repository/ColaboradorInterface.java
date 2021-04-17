package com.veterinaria.historia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.veterinaria.historia.model.Colaborador;

public interface ColaboradorInterface extends JpaRepository<Colaborador, Integer> {
	
}
