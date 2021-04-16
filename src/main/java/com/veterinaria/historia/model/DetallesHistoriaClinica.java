package com.veterinaria.historia.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "detalle_historia_clinica")
public class DetallesHistoriaClinica {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String temperatura;
	private double peso;
	@Column(name = "frecuencia_cardiaca")
	private double frecuenciaCardiaca;
	@Column(name = "frecuencia_respiratoria")
	private double frecuenciaRespiratoria;
	private String alimentacion;
	private String habitad;
	private String observacion;
	@OneToOne
	@JoinColumn(name = "colaborador_id")
	private Colaborador colaborador;
	@ManyToOne
	@JoinColumn(name = "historia_clinica_id")

	private HistoriaClinica historiaClinica;
	

	public DetallesHistoriaClinica() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DetallesHistoriaClinica(String temperatura, double peso, double frecuenciaCardiaca,
			double frecuenciaRespiratoria, String alimentacion, String habitad, String observacion,
			Colaborador colaborador, HistoriaClinica historiaClinica) {
		super();
		this.temperatura = temperatura;
		this.peso = peso;
		this.frecuenciaCardiaca = frecuenciaCardiaca;
		this.frecuenciaRespiratoria = frecuenciaRespiratoria;
		this.alimentacion = alimentacion;
		this.habitad = habitad;
		this.observacion = observacion;
		this.colaborador = colaborador;
		this.historiaClinica = historiaClinica;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(String temperatura) {
		this.temperatura = temperatura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getFrecuenciaCardiaca() {
		return frecuenciaCardiaca;
	}

	public void setFrecuenciaCardiaca(double frecuenciaCardiaca) {
		this.frecuenciaCardiaca = frecuenciaCardiaca;
	}

	public double getFrecuenciaRespiratoria() {
		return frecuenciaRespiratoria;
	}

	public void setFrecuenciaRespiratoria(double frecuenciaRespiratoria) {
		this.frecuenciaRespiratoria = frecuenciaRespiratoria;
	}

	public String getAlimentacion() {
		return alimentacion;
	}

	public void setAlimentacion(String alimentacion) {
		this.alimentacion = alimentacion;
	}

	public String getHabitad() {
		return habitad;
	}

	public void setHabitad(String habitad) {
		this.habitad = habitad;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public Colaborador getColaborador() {
		return colaborador;
	}

	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}

	public HistoriaClinica getHistoriaClinica() {
		return historiaClinica;
	}

	public void setHistoriaClinica(HistoriaClinica historiaClinica) {
		this.historiaClinica = historiaClinica;
	}

}
