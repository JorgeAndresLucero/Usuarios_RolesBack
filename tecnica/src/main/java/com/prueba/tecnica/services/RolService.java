package com.prueba.tecnica.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.tecnica.entity.RolEntity;
import com.prueba.tecnica.repository.IRolRepository;

@Service
public class RolService implements IRolService{
	@Autowired
	private IRolRepository rolRepository;
	@Override
	public List<RolEntity> getAll() {

		return rolRepository.findAll();
	}

	@Override
	public RolEntity getRolById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RolEntity crearRol(RolEntity rolEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RolEntity actualizarRol(RolEntity rolEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminarRol(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
