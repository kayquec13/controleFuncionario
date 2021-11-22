package com.kayque.controleFuncionario.config;

import java.math.BigDecimal;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.kayque.controleFuncionario.entities.Cargo;
import com.kayque.controleFuncionario.entities.Funcionario;
import com.kayque.controleFuncionario.repositories.CargoRepositories;
import com.kayque.controleFuncionario.repositories.FuncionarioRepository;

@Configuration
@Profile("test")
public class ConfigTest implements CommandLineRunner{
	@Autowired
	private CargoRepositories cargoRepositories;
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;
	

	@Override
	public void run(String... args) throws Exception {	

		Cargo cargo1 = new Cargo(null, "Analista de Sustentação N1", new BigDecimal(3500));
		Cargo cargo2 = new Cargo(null, "Analista de Sustentação N2", new BigDecimal(4800));
		
		cargoRepositories.saveAll(Arrays.asList(cargo1,cargo2));
		
		Funcionario funcionario1 = new Funcionario(null, "Kayque Cintra Benatti",cargo1);
		Funcionario funcionario2 = new Funcionario(null, "Tiago Torres", cargo2);
		
		funcionarioRepository.saveAll(Arrays.asList(funcionario1,funcionario2));
	}
		
}
