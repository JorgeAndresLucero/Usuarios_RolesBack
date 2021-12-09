package com.prueba.tecnica.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "usuario")
@Data
public class UsuarioEntity {
	@Id
	@Column(name = "ID_USUARIO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_usuario;
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column (name = "ACTIVO")
	private String activo;
	@Column (name = "ROL")
    private Integer rol;
	
	
	
	
	
}
