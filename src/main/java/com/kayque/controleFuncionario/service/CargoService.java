package com.kayque.controleFuncionario.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kayque.controleFuncionario.entities.Cargo;
import com.kayque.controleFuncionario.repositories.CargoRepositories;

@Service
public class CargoService {
	@Autowired
	private CargoRepositories repository;

	public List<Cargo> findAll() {
		return repository.findAll();
	}
	
	public Cargo findById(Integer id) {
		Optional<Cargo> cargo = repository.findById(id);
		return cargo.get();
	}
	
	public Cargo insert(Cargo cargo) {
		return repository.save(cargo);
	}
	
	public void delete(Integer id) {
		repository.deleteById(id);
	}
	
	private void atualizaCargo (Cargo cargo, Cargo obj) {
		cargo.setNomeCargo(obj.getNomeCargo());
		cargo.setSalario(obj.getSalario());
	}
	
	public Cargo update(Integer id, Cargo obj) {
		Cargo cargo = repository.getOne(id);
		atualizaCargo(cargo, obj);
		return repository.save(cargo);
	}
	
	
	
}
