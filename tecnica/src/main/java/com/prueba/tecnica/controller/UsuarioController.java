package com.prueba.tecnica.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.prueba.tecnica.entity.UsuarioEntity;
import com.prueba.tecnica.services.IUsuarioService;

@RestController
@RequestMapping(path = "api/v1/usuario")
@CrossOrigin(origins = "*")
public class UsuarioController {

	@Autowired
	private IUsuarioService usuarioService;
	//Listar todos
	
	@GetMapping(path = "/all")
	public List<UsuarioEntity> getAll(){
		
		return usuarioService.getAll();
		
	}
	
	//listar las coindicencias
	
	@GetMapping(path = "/match/{cadena}")
	public List<UsuarioEntity> getMatch(@PathVariable String cadena){
		return usuarioService.getMatch(cadena);
	}
	
	/**
	* Crear usuario
	* @author jlucero
	* @version 0.1, 2021/12/05
	*/
	@PostMapping(path = "/crear" , consumes = "application/json",produces = "application/json" )
	public UsuarioEntity crearEmpresa(@RequestBody UsuarioEntity usuarioEntity){
		return usuarioService.actualizarUsuario(usuarioEntity);
	}
	
	
	/**
	* Actualizar usuario
	* @author jlucero
	* @version 0.1, 2021/12/05
	*/
	@PostMapping(path = "/actualizar" , consumes = "application/json", produces = "application/json" )
	public UsuarioEntity actualizarUsuario(@RequestBody UsuarioEntity usuarioEntity){
		return usuarioService.crearUsuario(usuarioEntity);
	}
	
	

	/**
	* Eliminar usuario
	* @author jlucero
	* @version 0.1, 2021/12/05
	*/
	@CrossOrigin(origins = "*")
	@DeleteMapping(path = "/eliminar/{id}")
	public void eliminarEmpresa(@PathVariable Integer id) {

		 usuarioService.eliminarUsuario(id);
	}
	
	

}
