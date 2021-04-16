package com.veterinaria.historia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.veterinaria.historia.model.Mascota;

public interface MascotaInterface extends JpaRepository<Mascota,Integer> {

}
