package com.veterinaria.historia.rest;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.veterinaria.historia.model.Mascota;

import com.veterinaria.historia.service.MascotaService;

@RestController
@RequestMapping("/mascota/")
public class MascotaRest {
@Autowired
private  MascotaService mascotaService;
@GetMapping
private ResponseEntity<List<Mascota>> getallmascotas(){
	return ResponseEntity.ok(mascotaService.findAll());
	
}


@PostMapping
private ResponseEntity<Mascota>saveMascota(@RequestBody Mascota  mascota){
	try {
		 Mascota mascotaGuardada=mascotaService.save(mascota);
		 return ResponseEntity.created(new URI("/mascota"+mascotaGuardada.getId())).body(mascotaGuardada);
	} catch (Exception e) {
	return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
	}
}

@DeleteMapping (value = "delete/{id}")
private ResponseEntity<Boolean> deleteMascota(@PathVariable ("id") Integer id){
	mascotaService.deleteById(id);
	return ResponseEntity.ok(!(mascotaService.findById(id)!=null));
	
}


}
