package com.senai.ecomerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.ecomerce.entities.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long>{

}
