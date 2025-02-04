package com.senai.ecomerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.senai.ecomerce.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
