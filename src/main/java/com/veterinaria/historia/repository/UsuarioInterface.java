package com.veterinaria.historia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.veterinaria.historia.model.Usuario;

public interface UsuarioInterface extends JpaRepository<Usuario, Integer> {

}
