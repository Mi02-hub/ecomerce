package com.senai.ecomerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.ecomerce.entities.Produto;
import com.senai.ecomerce.repositories.ProdutoRepository;

@Service
public class ProdutoServices {
	
	@Autowired
    ProdutoRepository repo;
	
	public List<Produto> buscarTodos() {
		List<Produto> list = repo.findAll();
		return list;
		
	}
 
}
