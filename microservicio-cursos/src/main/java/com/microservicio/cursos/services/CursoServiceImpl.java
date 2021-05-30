package com.microservicio.cursos.services;


import org.springframework.stereotype.Service;

import com.microservicio.cursos.models.entity.Curso;
import com.microservicio.cursos.models.repository.CursoRepository;
import com.microservicios.commons.services.CommonServiceImpl;


@Service
public class CursoServiceImpl extends CommonServiceImpl<Curso,CursoRepository> implements CursoServices {

	

}
