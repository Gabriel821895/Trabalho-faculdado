package com.baozi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.baozi.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}