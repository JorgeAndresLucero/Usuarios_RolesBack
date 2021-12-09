package com.prueba.tecnica.services;

import java.util.List;


import com.prueba.tecnica.entity.UsuarioEntity;

public interface IUsuarioService {
	public List<UsuarioEntity> getAll();
	public UsuarioEntity getUsuarioById(Integer id);
	
	public List<UsuarioEntity> getMatch(String cadena);
	
	public UsuarioEntity crearUsuario(UsuarioEntity usuarioEntity);
	
	public UsuarioEntity actualizarUsuario(UsuarioEntity usuarioEntity);
	
	public void eliminarUsuario(Integer id);
}
