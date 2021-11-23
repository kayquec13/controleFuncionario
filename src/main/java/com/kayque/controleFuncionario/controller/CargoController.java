package com.kayque.controleFuncionario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	public ResponseEntity<List<Cargo>> findAllCargos() {
		List<Cargo> cargos = service.findAll();
		return ResponseEntity.ok().body(cargos);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Cargo> findById(@PathVariable Integer id) {
		Cargo cargo = service.findById(id);
		return ResponseEntity.ok().body(cargo);
	}

	@PostMapping
	public ResponseEntity<Cargo> insert(@RequestBody Cargo cargo) {
		cargo = service.insert(cargo);
		return ResponseEntity.ok().body(cargo);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Integer id){
		service.delete(id);
		//Retornando resposta do metodo delete, o noContente retornta uma resposta viazia 204
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<Cargo> update(@PathVariable Integer id, @RequestBody Cargo cargo){
		cargo = service.update(id,cargo);
		return ResponseEntity.ok().body(cargo);
	}
}
