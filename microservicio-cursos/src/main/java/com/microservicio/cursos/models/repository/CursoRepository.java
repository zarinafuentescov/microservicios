package com.microservicio.cursos.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.microservicio.cursos.models.entity.Curso;

public interface CursoRepository extends CrudRepository<Curso, Long>{

}
