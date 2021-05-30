package com.microservicios.commons.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;


public class CommonServiceImpl<E, R extends CrudRepository<E, Long>> implements CommonService<E> {

	@Autowired
	protected R repo;
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<E> findAll() {
		
		return repo.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<E> findById(Long id) {
		
		return repo.findById(id);
	}

	@Override
	public E save(E entity) {
		
		return repo.save(entity);
	}

	@Override
	public void deleteById(Long id) {
		
		repo.deleteById(id);
	}

}
