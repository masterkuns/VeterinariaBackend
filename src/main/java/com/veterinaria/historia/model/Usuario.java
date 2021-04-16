package com.veterinaria.historia.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name ="usuario")
public class Usuario {
	  private Integer usuarioId;
	  private String nombre;
	  private String apellido;
	  private String tipoDocumento;
	  private Integer documentoIdentificacion;
	  private String estado;
	  private String sexo;
	  
	  
	  
	public Integer getUsuarioId() {
		return usuarioId;
	}
	public void setUsuarioId(Integer usuarioId) {
		this.usuarioId = usuarioId;
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
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
}
