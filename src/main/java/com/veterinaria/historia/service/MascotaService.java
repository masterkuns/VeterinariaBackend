package com.veterinaria.historia.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.veterinaria.historia.model.Mascota;
import com.veterinaria.historia.repository.MascotaInterface;

import javassist.expr.NewArray;

@Service
public class MascotaService implements MascotaInterface {
	@Autowired
	private MascotaInterface mascotaInterface;

	@Override
	public List<Mascota> findAll() {
		// TODO Auto-generated method stub
		return mascotaInterface.findAll();
	}

	@Override
	public List<Mascota> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}
	public List <Mascota> FindAllByUsuario(Integer id){
	List<Mascota> mascotaRespuestas=new ArrayList<>();
	List <Mascota> mascotas=mascotaInterface.findAll();
	for (Mascota mascota : mascotas) {
		for(int i=0;i<mascotas.size();i++) {
			if (mascotas.get(i).getUsuario().getid()==id)
				mascotaRespuestas.add(mascotas.get(id));
		}
		
	}
	return mascotaRespuestas;
		
	}

	@Override
	public List<Mascota> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Mascota> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Mascota> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteInBatch(Iterable<Mascota> entities) {
		// TODO Auto-generated method stub
		
	}
	

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Mascota getOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Mascota> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Mascota> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Mascota> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Mascota> S save(S entity) {
		return mascotaInterface.save(entity);

	}
public void id(Integer id) {
        
    }

	@Override
	public Optional<Mascota> findById(Integer id) {
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
		mascotaInterface.deleteById(id);
		
	}

	@Override
	public void delete(Mascota entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Mascota> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Mascota> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Mascota> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Mascota> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Mascota> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}
}
