package com.veterinaria.historia.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name ="detallesHistoria")
public class DetallesHistoriaClinica {
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
