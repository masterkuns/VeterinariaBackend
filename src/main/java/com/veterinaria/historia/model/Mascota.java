package com.veterinaria.historia.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name ="mascota")
public class Mascota {
	  private Integer MascotaId;
	  private String nombre;
	  private String raza;
	  private Usuario usuario;
	  private String sexo;
}
