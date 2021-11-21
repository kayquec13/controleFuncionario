package com.kayque.controleFuncionario.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kayque.controleFuncionario.entities.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario,Integer> {

}
