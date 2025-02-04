package com.senai.ecomerce.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.senai.ecomerce.services.ProdutoServices;

@RestController
@RequestMapping(value = "/produto")
public class ProdutoController {
	
	@Autowired
	ProdutoServices service;
		
	@GetMapping
	public ResponseEntity<?> buscar(){
		
	 return ResponseEntity.ok(service.buscarTodos());
	}

}
