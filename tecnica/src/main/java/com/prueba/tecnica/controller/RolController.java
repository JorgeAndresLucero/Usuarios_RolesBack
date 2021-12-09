 package com.prueba.tecnica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.tecnica.entity.RolEntity;
import com.prueba.tecnica.services.IRolService;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path = "api/v1/rol")
public class RolController {

	//Listar todos
	@Autowired
	private IRolService rolService;
	//Listar todos
	
	@GetMapping(path = "/all")
	public List<RolEntity> getAll(){
		
		return rolService.getAll();
	}
	//listar uno
	
	//Crear
	
	//Eliminar
}
