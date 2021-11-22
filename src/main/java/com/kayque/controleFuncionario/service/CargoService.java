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
}
