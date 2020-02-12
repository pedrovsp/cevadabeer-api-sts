package com.cevadabeer.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cevadabeer.api.entities.Producao;
import com.cevadabeer.api.repositories.ProducaoRepository;

@Service
public class ProducaoService {

	@Autowired
	private ProducaoRepository repository;
	
	public List<Producao> findAll(){
		return repository.findAll();
	}
	
	public Producao findById(Long id) {
		Optional<Producao> obj = repository.findById(id);
		return obj.get();
	}
	
	public Producao insert(Producao obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	public Producao update(Long id, Producao obj) {
		Producao entity = repository.getOne(id);
		updateData(entity, obj);
		return repository.save(entity);
	}

	private void updateData(Producao entity, Producao obj) {
		entity.setCerveja(obj.getCerveja());
		entity.setDtInicio(obj.getDtInicio());
		entity.setDtFim(obj.getDtFim());
		entity.setQuantidadeEmLitros(obj.getQuantidadeEmLitros());
	}
}
