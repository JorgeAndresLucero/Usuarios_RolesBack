package com.prueba.tecnica.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.tecnica.entity.UsuarioEntity;
import com.prueba.tecnica.repository.IUsuarioRepository;

@Service
public class UsuarioService implements IUsuarioService{

	@Autowired
	private IUsuarioRepository usuarioRepository;
	@Override
	public List<UsuarioEntity> getAll() {
		return usuarioRepository.findAll();
	}

	@Override
	public UsuarioEntity getUsuarioById(Integer id) {
	
		return usuarioRepository.getById(id);
	}

	@Override
	public UsuarioEntity crearUsuario(UsuarioEntity usuarioEntity) {
		
		return usuarioRepository.save(usuarioEntity);
	}

	@Override
	public UsuarioEntity actualizarUsuario(UsuarioEntity usuarioEntity) {
		
		return usuarioRepository.save(usuarioEntity);
	}

	@Override
	public void eliminarUsuario(Integer id) {
		
		usuarioRepository.deleteById(id);
	}

	@Override
	public List<UsuarioEntity> getMatch(String cadena) {
		
		return usuarioRepository.obtenerUsuariosPorCoicidencias(cadena);
	}

}
