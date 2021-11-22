package com.kayque.controleFuncionario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kayque.controleFuncionario.entities.Cargo;
import com.kayque.controleFuncionario.service.CargoService;

@RestController
@RequestMapping(value = "/cargos")
public class CargoController {
	@Autowired
	private CargoService service;
	
	@GetMapping
	public ResponseEntity<List<Cargo>> findAllCargos(){
		List<Cargo> cargos =  service.findAll();
		return ResponseEntity.ok().body(cargos);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Cargo> findById(@PathVariable Integer id){
		Cargo cargo = service.findById(id);
		return ResponseEntity.ok().body(cargo);
	}
	
}
