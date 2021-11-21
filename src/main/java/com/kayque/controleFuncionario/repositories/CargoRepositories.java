package com.kayque.controleFuncionario.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kayque.controleFuncionario.entities.Cargo;

public interface CargoRepositories extends JpaRepository<Cargo, Integer> {

}
