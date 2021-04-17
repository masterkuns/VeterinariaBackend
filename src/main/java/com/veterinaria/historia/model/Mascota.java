package com.veterinaria.historia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "mascota")
public class Mascota {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private String nombre;
	private String raza;
	@ManyToOne
	@JoinColumn(name ="usuario_id")
	private Usuario usuario;
	private String sexo;
	
	
	
	public Mascota() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Mascota(Integer mascotaId, String nombre, String raza, Usuario usuario, String sexo) {
	
		this.nombre = nombre;
		this.raza = raza;
		this.usuario = usuario;
		this.sexo = sexo;
	}
	

	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
		
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
	
}
