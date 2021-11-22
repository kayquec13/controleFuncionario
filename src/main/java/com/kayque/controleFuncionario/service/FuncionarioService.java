package com.kayque.controleFuncionario.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kayque.controleFuncionario.entities.Funcionario;
import com.kayque.controleFuncionario.repositories.FuncionarioRepository;

@Service
public class FuncionarioService {
	@Autowired
	private FuncionarioRepository repository;

	public List<Funcionario> findAll() {
		return repository.findAll();
	}

	public Funcionario findById(Integer id) {

		Optional<Funcionario> funcionario = repository.findById(id);
		return funcionario.get();
	}
}
