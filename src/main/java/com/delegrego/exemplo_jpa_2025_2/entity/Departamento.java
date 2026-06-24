package com.delegrego.exemplo_jpa_2025_2.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "departamento")
public class Departamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_departamento")
	private int idDepartamento;

	@Column(name = "nome_departamento")
	private String nomeDepartamento;

	public Departamento(int idDepartamento, String nomeDepartamento) {
		super();
		this.idDepartamento = idDepartamento;
		this.nomeDepartamento = nomeDepartamento;
	}

	public Departamento() {

	}

	public int getIdDepartamento() {
		return idDepartamento;
	}

	public void setIdDepartamento(int idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	public String getNomeDepartamento() {
		return nomeDepartamento;
	}

	public void setNomeDepartamento(String nomeDepartamento) {
		this.nomeDepartamento = nomeDepartamento;
	}

	@Override
	public String toString() {
		return "Departamento [idDepartamento=" + idDepartamento + ", nomeDepartamento=" + nomeDepartamento + "]";
	}

}
