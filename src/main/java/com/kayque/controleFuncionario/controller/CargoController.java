package com.kayque.controleFuncionario.controller;

import java.math.BigDecimal;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kayque.controleFuncionario.entities.Cargo;

@RestController
@RequestMapping(value = "/cargos")
public class CargoController {

	@GetMapping
	public ResponseEntity<Cargo> findAllCargos(){
		Cargo cargo = new Cargo(1, "Analista", new BigDecimal(3500) );
		return ResponseEntity.ok().body(cargo);
	}
	
}
