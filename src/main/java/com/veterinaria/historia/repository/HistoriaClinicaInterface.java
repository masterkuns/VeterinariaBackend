package com.veterinaria.historia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.veterinaria.historia.model.HistoriaClinica;

public interface HistoriaClinicaInterface extends JpaRepository<HistoriaClinica, Integer> {

}
