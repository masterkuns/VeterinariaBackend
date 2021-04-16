package com.veterinaria.historia.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.veterinaria.historia.model.Mascota;
import com.veterinaria.historia.service.MascotaService;

@RestController
@RequestMapping("/mascota/")
public class MascotaRest {
@Autowired
private  MascotaService mascotaService;
private ResponseEntity<List<Mascota>> getallmascotas(){
	return ResponseEntity.ok(mascotaService.findAll());
	
}
@GetMapping("{id}")
private ResponseEntity<List<Mascota>> getallmascotasById(@PathVariable("id") Integer id){
	return ResponseEntity.ok(mascotaService.FindAllByUsuario(id));
	
}
}
