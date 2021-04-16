package com.veterinaria.historia.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.veterinaria.historia.model.Usuario;
import com.veterinaria.historia.repository.UsuarioInterface;

@Service
public class UsuarioService implements UsuarioInterface{
@Autowired
private UsuarioInterface usuarioInterface;

@Override
public List<Usuario> findAll() {
	// TODO Auto-generated method stub
	return usuarioInterface.findAll();
}

@Override
public List<Usuario> findAll(Sort sort) {
	// TODO Auto-generated method stub
	return usuarioInterface.findAll(sort);
}

@Override
public List<Usuario> findAllById(Iterable<Integer> ids) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public <S extends Usuario> List<S> saveAll(Iterable<S> entities) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void flush() {
	// TODO Auto-generated method stub
	
}

@Override
public <S extends Usuario> S saveAndFlush(S entity) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void deleteInBatch(Iterable<Usuario> entities) {
	// TODO Auto-generated method stub
	
}

@Override
public void deleteAllInBatch() {
	// TODO Auto-generated method stub
	
}

@Override
public Usuario getOne(Integer id) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public <S extends Usuario> List<S> findAll(Example<S> example) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public <S extends Usuario> List<S> findAll(Example<S> example, Sort sort) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Page<Usuario> findAll(Pageable pageable) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public <S extends Usuario> S save(S entity) {
	// TODO Auto-generated method stub
	return usuarioInterface.save(entity);
}

@Override
public Optional<Usuario> findById(Integer id) {
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
	usuarioInterface.deleteById(id);
	
}

@Override
public void delete(Usuario entity) {
usuarioInterface.delete(entity);
	
}

@Override
public void deleteAll(Iterable<? extends Usuario> entities) {
	// TODO Auto-generated method stub
	
}

@Override
public void deleteAll() {
	// TODO Auto-generated method stub
	
}

@Override
public <S extends Usuario> Optional<S> findOne(Example<S> example) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public <S extends Usuario> Page<S> findAll(Example<S> example, Pageable pageable) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public <S extends Usuario> long count(Example<S> example) {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public <S extends Usuario> boolean exists(Example<S> example) {
	// TODO Auto-generated method stub
	return false;
}
}
