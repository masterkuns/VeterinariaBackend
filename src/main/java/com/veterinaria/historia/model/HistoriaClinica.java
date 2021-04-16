package com.veterinaria.historia.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name ="historia")
public class HistoriaClinica {
	  private Integer historiaId;
	  private Mascota mascota;
	  private int fechaCreacion;
}
