package com.veterinaria.historia.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name ="colaborador")
public class Colaborador {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
    private String nombre;
    private String apellido;
    private String cargo;
    private String especialidad;
    @Column(name = "tipo_documento")
    private String tipoDocumento;
    @Column(name = "documento_identificacion")
    private Integer documentoIdentificacion;
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
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public Integer getDocumentoIdentificacion() {
		return documentoIdentificacion;
	}
	public void setDocumentoIdentificacion(Integer documentoIdentificacion) {
		this.documentoIdentificacion = documentoIdentificacion;
	}
    
    
    
    
}
