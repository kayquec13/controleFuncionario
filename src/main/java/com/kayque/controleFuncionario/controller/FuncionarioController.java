package com.kayque.controleFuncionario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kayque.controleFuncionario.entities.Funcionario;
import com.kayque.controleFuncionario.service.FuncionarioService;

@RestController
@RequestMapping(value = "/funcionarios")
public class FuncionarioController {
	@Autowired
	public FuncionarioService service;

	@GetMapping
	public ResponseEntity<List<Funcionario>> findAllFuncionarios() {
		List<Funcionario> funcionarios = service.findAll();
		return ResponseEntity.ok().body(funcionarios);
	}

	@GetMapping(value="/{id}")
	public ResponseEntity<Funcionario> findById(@PathVariable Integer id) {
		Funcionario funcionario = service.findById(id);
		return ResponseEntity.ok().body(funcionario);
	}

}
