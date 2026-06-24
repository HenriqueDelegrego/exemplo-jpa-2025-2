package com.delegrego.exemplo_jpa_2025_2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.delegrego.exemplo_jpa_2025_2.entity.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {

}
