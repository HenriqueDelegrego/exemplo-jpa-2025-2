package com.delegrego.exemplo_jpa_2025_2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delegrego.exemplo_jpa_2025_2.entity.Funcionario;
import com.delegrego.exemplo_jpa_2025_2.repository.FuncionarioRepository;

@Service
public class FuncionarioService {

	@Autowired
	FuncionarioRepository funcionarioRepository;

	// CRUD

	// Create
	public void cadastrarFuncionario(Funcionario funcionario) {
		funcionarioRepository.save(funcionario);
	}

}
