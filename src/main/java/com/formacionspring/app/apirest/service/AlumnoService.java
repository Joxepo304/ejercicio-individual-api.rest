package com.formacionspring.app.apirest.service;

import java.util.List;

import com.formacionspring.app.apirest.entity.Alumno;
import com.formacionspring.app.apirest.entity.ComunidadAutonoma;

public interface AlumnoService {

public List<Alumno> findAll();
	
	public Alumno findById(Long id);
	
	public Alumno save(Alumno alumno);
	
	public void delete(Long id);
	
	public List <ComunidadAutonoma> findAllComunidadAutonomas();
}
