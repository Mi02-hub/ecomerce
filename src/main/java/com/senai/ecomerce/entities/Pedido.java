package com.senai.ecomerce.entities;

import java.time.Instant;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_pedidos")
public class Pedido {
	 @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
	 
	private Long id;
	private Instant momento;
	private String status;
	
	@ManyToOne
    @JoinColumn(name= "cliente_id")
	private Usuario cliente;
	
	@OneToOne(mappedBy = "pedido", cascade = CascadeType.ALL)
	private Pagamento pagamento;
	
	//aqui (<>) é para listar os pedidos
	
	@OneToMany(mappedBy = "id.pedido")
	private Set<ItemDoPedido> itens = new HashSet<>();
	
	public Pedido() {
		
	
	}



	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public Instant getMomento() {
		return momento;
	}




	public void setMomento(Instant momento) {
		this.momento = momento;
	}




	public String getStatus() {
		return status;
	}




	public void setStatus(String status) {
		this.status = status;
	}




	public Pedido(Long id, Instant momento, String status) {
	
		this.id = id;
		this.momento = momento;
		this.status = status;
	}




	public Set<ItemDoPedido> getItens() {
		return itens;
	}


	public List<Produto> getProduto(){
		return itens.stream().map(x -> x.getProduto()).toList();
    }


	
}
