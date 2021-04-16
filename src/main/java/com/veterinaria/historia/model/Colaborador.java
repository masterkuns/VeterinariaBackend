package com.veterinaria.historia.model;

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
    private String tipo_documento;
    private Integer documento_identificacion;
    
    
    
    
}
