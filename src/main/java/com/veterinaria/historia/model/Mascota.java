package com.veterinaria.historia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "mascota")
public class Mascota {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Integer MascotaId;
	private String nombre;
	private String raza;
	@ManyToOne
	@JoinColumn(name ="id_usuario")
	private Usuario usuario;
	private String sexo;
}
