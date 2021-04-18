package com.veterinaria.historia.rest;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.veterinaria.historia.model.Colaborador;
import com.veterinaria.historia.model.DetallesHistoriaClinica;
import com.veterinaria.historia.service.ColaboradorService;
import com.veterinaria.historia.service.DetallesHistoriaClinicaService;

@RestController
@RequestMapping("/detalles/")
public class DetallesHistoriaClinicaRest {
	@Autowired
	private DetallesHistoriaClinicaService detallesHistoriaClinicaService;
	@GetMapping
	private ResponseEntity<List<DetallesHistoriaClinica>>getAllDetallesHistoriaClinica(){
		return ResponseEntity.ok(detallesHistoriaClinicaService.findAll());
		
	}
	
	@PostMapping
	private ResponseEntity<DetallesHistoriaClinica>saveDetallesHistoriaClinica(@RequestBody DetallesHistoriaClinica detallesHistoriaClinica){
		try {
			DetallesHistoriaClinica detallesHistoriaClinicaGuardado=detallesHistoriaClinicaService.save(detallesHistoriaClinica);
			 return ResponseEntity.created(new URI("/colaborador"+detallesHistoriaClinica.getId())).body(detallesHistoriaClinicaGuardado);
		} catch (Exception e) {
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
}
