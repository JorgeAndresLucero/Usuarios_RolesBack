package com.prueba.tecnica.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.prueba.tecnica.entity.UsuarioEntity;

public interface IUsuarioRepository extends JpaRepository<UsuarioEntity, Integer> {

	@Query("SELECT u FROM UsuarioEntity u WHERE u.nombre LIKE ?1")	
	List<UsuarioEntity> obtenerUsuariosPorCoicidencias(String cadena);
}
