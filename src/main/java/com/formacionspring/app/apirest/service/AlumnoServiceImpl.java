package com.formacionspring.app.apirest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formacionspring.app.apirest.dao.AlumnoDao;
import com.formacionspring.app.apirest.entity.Alumno;
import com.formacionspring.app.apirest.entity.ComunidadAutonoma;

@Service
public class AlumnoServiceImpl implements AlumnoService{

	
	@Autowired
	private AlumnoDao alumnoDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Alumno> findAll() {
		return (List<Alumno>) alumnoDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Alumno findById(Long id) {
		// TODO Auto-generated method stub
		return alumnoDao.findById(id).orElse(null);
	}

	@Override
	public Alumno save(Alumno alumno) {
		// TODO Auto-generated method stub
		return alumnoDao.save(alumno);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		alumnoDao.deleteById(id);
	}

	@Override
	public List<ComunidadAutonoma> findAllComunidadAutonomas() {
		// TODO Auto-generated method stub
		return alumnoDao.findAllComunidadAutonomas();
	}
	

}
