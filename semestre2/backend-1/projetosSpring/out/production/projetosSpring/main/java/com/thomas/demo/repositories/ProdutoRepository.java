package com.thomas.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thomas.demo.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
