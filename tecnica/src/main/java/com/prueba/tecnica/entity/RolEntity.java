package com.prueba.tecnica.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "rol")
@Data
public class RolEntity {
	@Id
	@Column(name = "id_rol")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_rol;
	
	@Column(name = "nombre")
	private String nombre_rol;

	
}
