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

import com.veterinaria.historia.model.Colaborador;
import com.veterinaria.historia.model.Mascota;
import com.veterinaria.historia.service.ColaboradorService;

@RestController
@RequestMapping("/colaborador/")
public class ColaboradorRest {
	@Autowired
	private ColaboradorService colaboradorService;
	@GetMapping
	private ResponseEntity<List<Colaborador>>getAllColaborador(){
		return ResponseEntity.ok(colaboradorService.findAll());
		
	}
	@PostMapping
	private ResponseEntity<Colaborador>saveColaborador(@RequestBody Colaborador colaborador){
		try {
			 Colaborador colaboradorGuardado=colaboradorService.save(colaborador);
			 return ResponseEntity.created(new URI("/colaborador"+colaborador.getId())).body(colaboradorGuardado);
		} catch (Exception e) {
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	
	@DeleteMapping (value = "delete/{id}")
	private ResponseEntity<Boolean> deleteColaborador(@PathVariable ("id") Integer id){
		colaboradorService.deleteById(id);
		return ResponseEntity.ok(!(colaboradorService.findById(id)!=null));
		
	}
}
	
	

