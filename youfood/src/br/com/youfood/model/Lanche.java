package br.com.youfood.model;

import java.util.ArrayList;
import java.util.List;

public class Lanche {

	private Long id;
	private String descricao;
	private List<Ingredientes> ingredientes;
	private Double valor;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Ingredientes> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(List<Ingredientes> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public List<Ingredientes> getIngrediente() {
	    return ingredientes;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	

}
