package com.cevadabeer.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cevadabeer.api.entities.Cerveja;
import com.cevadabeer.api.repositories.CervejaRepository;

@Service
public class CervejaService {

	@Autowired
	private CervejaRepository repository;
	
	public List<Cerveja> findAll(){
		return repository.findAll();
	}
	
	public Cerveja findById(Long id) {
		Optional<Cerveja> obj = repository.findById(id);
		return obj.get();
	}
}
