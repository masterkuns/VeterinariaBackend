package com.veterinaria.historia.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.veterinaria.historia.model.DetallesHistoriaClinica;
import com.veterinaria.historia.repository.DetallesHistoriaClinicaInterface;

@Service
public class DetallesHistoriaClinicaService implements DetallesHistoriaClinicaInterface {
@Autowired
private DetallesHistoriaClinicaInterface detallesHistoriaClinicaInterface;

@Override
public List<DetallesHistoriaClinica> findAll() {
	// TODO Auto-generated method stub
	return detallesHistoriaClinicaInterface.findAll();
}

@Override
public List<DetallesHistoriaClinica> findAll(Sort sort) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<DetallesHistoriaClinica> findAllById(Iterable<Integer> ids) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public <S extends DetallesHistoriaClinica> List<S> saveAll(Iterable<S> entities) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void flush() {
	// TODO Auto-generated method stub
	
}

@Override
public <S extends DetallesHistoriaClinica> S saveAndFlush(S entity) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void deleteInBatch(Iterable<DetallesHistoriaClinica> entities) {
	// TODO Auto-generated method stub
	
}

@Override
public void deleteAllInBatch() {
	// TODO Auto-generated method stub
	
}

@Override
public DetallesHistoriaClinica getOne(Integer id) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public <S extends DetallesHistoriaClinica> List<S> findAll(Example<S> example) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public <S extends DetallesHistoriaClinica> List<S> findAll(Example<S> example, Sort sort) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Page<DetallesHistoriaClinica> findAll(Pageable pageable) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public <S extends DetallesHistoriaClinica> S save(S entity) {
	return detallesHistoriaClinicaInterface.save(entity);
	
}

@Override
public Optional<DetallesHistoriaClinica> findById(Integer id) {
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
detallesHistoriaClinicaInterface.deleteById(id);
	
}

@Override
public void delete(DetallesHistoriaClinica entity) {
	// TODO Auto-generated method stub
	
}

@Override
public void deleteAll(Iterable<? extends DetallesHistoriaClinica> entities) {
	// TODO Auto-generated method stub
	
}

@Override
public void deleteAll() {
	// TODO Auto-generated method stub
	
}

@Override
public <S extends DetallesHistoriaClinica> Optional<S> findOne(Example<S> example) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public <S extends DetallesHistoriaClinica> Page<S> findAll(Example<S> example, Pageable pageable) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public <S extends DetallesHistoriaClinica> long count(Example<S> example) {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public <S extends DetallesHistoriaClinica> boolean exists(Example<S> example) {
	// TODO Auto-generated method stub
	return false;
}
}
