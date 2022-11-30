package com.best2log.best2log.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.best2log.best2log.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
