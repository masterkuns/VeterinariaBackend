package com.veterinaria.historia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name ="detallesHistoria")
public class DetallesHistoriaClinica {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
    private String temperatura;
    private double peso;
    private double frecuenciaCardiaca;
    private double frecuenciaRespiratoria;
    private String alimentacion;
    private String habitad;
    private String observacion;
    private Colaborador colaborador;
    private HistoriaClinica historiaClinica;
}
