package com.veterinaria.historia.model;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "historia_Clinica")
public class HistoriaClinica {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@OneToOne
	@JoinColumn(name = "mascota_id")
	private Mascota mascota;
	@Column(name = "fecha_creacion")
	 @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="america/bogota")
	private Timestamp fechaCreacion;

	public HistoriaClinica(Mascota mascota, Timestamp fechaCreacion) {
		super();
		this.mascota = mascota;
		this.fechaCreacion = fechaCreacion;
	}
	public HistoriaClinica() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Timestamp getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Timestamp fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Mascota getMascota() {
		return mascota;
	}

	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}

}
