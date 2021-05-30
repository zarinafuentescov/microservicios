package com.microusuarios.usuarios.services;

import org.springframework.stereotype.Service;

import com.microservicio.commons.alumnos.models.entity.Alumno;
import com.microservicios.commons.services.CommonServiceImpl;
import com.microusuarios.usuarios.models.repository.AlumnoRepository;

@Service
public class AlumnoServiceImpl extends CommonServiceImpl<Alumno, AlumnoRepository> implements AlumnoService {

	

}
