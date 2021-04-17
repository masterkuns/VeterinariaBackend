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

import com.veterinaria.historia.model.HistoriaClinica;

import com.veterinaria.historia.service.HistoriaClinicaService;

@RestController
@RequestMapping("/historia/")
public class HistoriaClinicaRest {
	@Autowired
	private HistoriaClinicaService historiaClinicaService;
	@GetMapping
	
	private ResponseEntity<List<HistoriaClinica>>getAllhistorias (){
		return ResponseEntity.ok(historiaClinicaService.findAll());
		
	}
	
	@PostMapping
	private ResponseEntity<HistoriaClinica>saveHistoria(@RequestBody HistoriaClinica historia){
		try {
			HistoriaClinica historiaGuardada=historiaClinicaService.save(historia);
			 return ResponseEntity.created(new URI("/historia"+historiaGuardada.getId())).body(historiaGuardada);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
		
	}
	@DeleteMapping (value = "delete/{id}")
	private ResponseEntity<Boolean> deleteHistoria(@PathVariable ("id") Integer id){
		historiaClinicaService.deleteById(id);
		return ResponseEntity.ok(!(historiaClinicaService.findById(id)!=null));
		
	}
}
