package br.com.youfood.testes;

import java.util.ArrayList;
import java.util.List;

import br.com.youfood.model.Ingredientes;
import br.com.youfood.model.Lanche;
import br.com.youfood.service.Custom;
import br.com.youfood.service.LancheService;

public class ListaIngredientesEnvironment {

	public Ingredientes ListaEnvironment1() {

		Ingredientes ingredientes = new Ingredientes();
		ingredientes.setId(1L);
		ingredientes.setDescricao("Alface");
		ingredientes.setValor(12.6);
		return ingredientes;
	}

	public Ingredientes ListaEnvironment2() {

		Ingredientes ingredientes = new Ingredientes();
		ingredientes.setId(2L);
		ingredientes.setDescricao("Bacon");
		ingredientes.setValor(3.4);
		return ingredientes;

	}

	public Ingredientes ListaEnvironment3() {

		Ingredientes ingredientes = new Ingredientes();
		ingredientes.setId(3L);
		ingredientes.setDescricao("Carne");
		ingredientes.setValor(23D);
		return ingredientes;

	}

	public Ingredientes ListaEnvironment4() {

		Ingredientes ingredientes = new Ingredientes();
		ingredientes.setId(5L);
		ingredientes.setDescricao("Queijo");
		ingredientes.setValor(5.5);
		return ingredientes;

	}

	public Lanche obterIngredientesEnvironment() {

		Lanche lanche1 = new Lanche();
		List<Ingredientes> itens1 = new ArrayList<Ingredientes>();

		itens1.add(ListaEnvironment1());
		itens1.add(ListaEnvironment2());
		itens1.add(ListaEnvironment3());
		lanche1.setId(1L);
		lanche1.setIngredientes(itens1);
		lanche1.setDescricao("X-Tudo");
		return lanche1;

	}

}
