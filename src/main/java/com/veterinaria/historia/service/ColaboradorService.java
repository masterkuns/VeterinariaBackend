package com.veterinaria.historia.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.veterinaria.historia.model.Colaborador;
import com.veterinaria.historia.repository.ColaboradorInterface;

@Service
public class ColaboradorService implements ColaboradorInterface {
@Autowired
private ColaboradorInterface colaboradorInterface;

@Override
public List<Colaborador> findAll() {

	return colaboradorInterface.findAll();
}

@Override
public List<Colaborador> findAll(Sort sort) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<Colaborador> findAllById(Iterable<Integer> ids) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public <S extends Colaborador> List<S> saveAll(Iterable<S> entities) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void flush() {
	// TODO Auto-generated method stub
	
}

@Override
public <S extends Colaborador> S saveAndFlush(S entity) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void deleteInBatch(Iterable<Colaborador> entities) {
	// TODO Auto-generated method stub
	
}

@Override
public void deleteAllInBatch() {
	// TODO Auto-generated method stub
	
}

@Override
public Colaborador getOne(Integer id) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public <S extends Colaborador> List<S> findAll(Example<S> example) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public <S extends Colaborador> List<S> findAll(Example<S> example, Sort sort) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Page<Colaborador> findAll(Pageable pageable) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public <S extends Colaborador> S save(S entity) {
	return colaboradorInterface.save(entity);
	
}

@Override
public Optional<Colaborador> findById(Integer id) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public boolean existsById(Integer id) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public long count() {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public void deleteById(Integer id) {
	 colaboradorInterface.deleteById(id);
	
}

@Override
public void delete(Colaborador entity) {
	// TODO Auto-generated method stub
	
}

@Override
public void deleteAll(Iterable<? extends Colaborador> entities) {
	// TODO Auto-generated method stub
	
}

@Override
public void deleteAll() {
	// TODO Auto-generated method stub
	
}

@Override
public <S extends Colaborador> Optional<S> findOne(Example<S> example) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public <S extends Colaborador> Page<S> findAll(Example<S> example, Pageable pageable) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public <S extends Colaborador> long count(Example<S> example) {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public <S extends Colaborador> boolean exists(Example<S> example) {
	// TODO Auto-generated method stub
	return false;
}
}
