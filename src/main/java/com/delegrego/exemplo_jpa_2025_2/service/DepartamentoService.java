package com.delegrego.exemplo_jpa_2025_2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delegrego.exemplo_jpa_2025_2.entity.Departamento;
import com.delegrego.exemplo_jpa_2025_2.repository.DepartamentoRepository;

@Service
public class DepartamentoService {

	@Autowired
	DepartamentoRepository departamentoRepository;

	// CRUD

	// Create
	public void cadastrarDepartamento(Departamento departamento) {
		departamentoRepository.save(departamento);
	}

	// Read
	public List<Departamento> listarDepartamentos() {
		return departamentoRepository.findAll();
	}

	// Update
	public void atualizarDepartamento(Departamento departamento) {
		departamentoRepository.save(departamento);
	}

	// Delete
	public void deletarDepartamento(int id) {
		departamentoRepository.deleteById(id);
	}

}
