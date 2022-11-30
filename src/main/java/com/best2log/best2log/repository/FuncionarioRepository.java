package com.best2log.best2log.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.best2log.best2log.entity.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {

}