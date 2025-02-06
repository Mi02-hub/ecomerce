package com.senai.ecomerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.ecomerce.entities.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
