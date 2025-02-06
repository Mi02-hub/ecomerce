package com.senai.ecomerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.ecomerce.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
