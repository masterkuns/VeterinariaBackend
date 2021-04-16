package com.veterinaria.historia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name ="historia")
public class HistoriaClinica {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	  private Integer id;
	  private Mascota mascota;
	  private int fechaCreacion;
	  
}
