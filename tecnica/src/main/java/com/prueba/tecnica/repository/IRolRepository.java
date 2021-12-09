package com.prueba.tecnica.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba.tecnica.entity.RolEntity;

public interface IRolRepository extends JpaRepository<RolEntity, Integer>{
	
}
