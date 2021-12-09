package com.prueba.tecnica.services;

import java.util.List;
import com.prueba.tecnica.entity.RolEntity;
public interface IRolService {
	public List<RolEntity> getAll();
	
	public RolEntity getRolById(Integer id);
	
	public RolEntity crearRol(RolEntity rolEntity);
	
	public RolEntity actualizarRol(RolEntity rolEntity);
	
	public void eliminarRol(Integer id);
}
