package com.kayque.controleFuncionario.entities;

import java.io.Serializable;
import java.math.BigDecimal;

public class Cargo implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer idCargo;
	private String nomeCargo;
	private BigDecimal salario;

	public Cargo() {

	}

	public Cargo(Integer idCargo, String nomeCargo, BigDecimal salario) {
		super();
		this.idCargo = idCargo;
		this.nomeCargo = nomeCargo;
		this.salario = salario;
	}

	public Integer getIdCargo() {
		return idCargo;
	}

	public void setIdCargo(Integer idCargo) {
		this.idCargo = idCargo;
	}

	public String getNomeCargo() {
		return nomeCargo;
	}

	public void setNomeCargo(String nomeCargo) {
		this.nomeCargo = nomeCargo;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idCargo == null) ? 0 : idCargo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cargo other = (Cargo) obj;
		if (idCargo == null) {
			if (other.idCargo != null)
				return false;
		} else if (!idCargo.equals(other.idCargo))
			return false;
		return true;
	}

}
