package com.kayque.controleFuncionario.config;

import java.math.BigDecimal;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.kayque.controleFuncionario.entities.Cargo;
import com.kayque.controleFuncionario.repositories.CargoRepositories;

@Configuration
@Profile("test")
public class ConfigTest implements CommandLineRunner{
	@Autowired
	private CargoRepositories cargoRepositories;

	@Override
	public void run(String... args) throws Exception {	

		Cargo cargo1 = new Cargo(null, "Analista de Sustentação N1", new BigDecimal(3500));
		Cargo cargo2 = new Cargo(null, "Analista de Sustentação N2", new BigDecimal(4800));
		
		cargoRepositories.saveAll(Arrays.asList(cargo1,cargo2));
		
	}
		
}
