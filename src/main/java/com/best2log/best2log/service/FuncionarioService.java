package com.best2log.best2log.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.best2log.best2log.entity.Funcionario;
import com.best2log.best2log.repository.FuncionarioRepository;

@Service
public class FuncionarioService {
    
    @Autowired
    FuncionarioRepository funcionarioRepository;

    public List<Funcionario> getAllFuncionarios(){
        return funcionarioRepository.findAll(); 
    }
    
    public Funcionario getFuncionarioById(int id) {
        return funcionarioRepository.findById(id).orElse(null);
    }

    public Funcionario saveFuncionario(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }
    public Funcionario updateFuncionario(Funcionario funcionario, Integer id) {
        Funcionario funcionarioExistente = getFuncionarioById(id);
        funcionario.setAllAtributos(funcionario);
        return funcionarioRepository.save(funcionarioExistente);
    }

    public Funcionario deleteFuncionario(Integer id) {
        funcionarioRepository.deleteById(id);
        return getFuncionarioById(id);
    }
}