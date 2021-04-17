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

import com.veterinaria.historia.model.Usuario;
import com.veterinaria.historia.service.UsuarioService;

@RestController
@RequestMapping("/usuario/")
public class UsuarioRest {
	@Autowired
	private UsuarioService usuarioService;
	@GetMapping
	private ResponseEntity<List<Usuario>> getAllUsuarios(){
		return ResponseEntity.ok(usuarioService.findAll());
				
				
	}
	@PostMapping
	private ResponseEntity<Usuario>saveUsuario(@RequestBody Usuario  usuario){
		try {
			 Usuario usuarioGuardado=usuarioService.save(usuario);
			 return ResponseEntity.created(new URI("/usuario"+usuarioGuardado.getid())).body(usuarioGuardado);
		} catch (Exception e) {
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		
		}
	}
	@DeleteMapping (value = "delete/{id}")
	private ResponseEntity<Boolean> deletePersona (@PathVariable ("id") Integer id){
		usuarioService.deleteById(id);
		return ResponseEntity.ok(!(usuarioService.findById(id)!=null));
		
	}

}
