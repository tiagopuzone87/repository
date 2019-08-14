package br.com.youfood.testes;

import java.util.ArrayList;
import java.util.List;

import br.com.youfood.model.Ingredientes;
import br.com.youfood.model.Lanche;

public class ListaLancheDescontoEnvironment {

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

	public Lanche obterMuitaCarneEnvironment() {

		Lanche lanche1 = new Lanche();
		List<Ingredientes> itens1 = new ArrayList<Ingredientes>();

		itens1.add(ListaEnvironment1());
		itens1.add(ListaEnvironment2());
		itens1.add(ListaEnvironment3());
		itens1.add(ListaEnvironment3());
		itens1.add(ListaEnvironment3());
		itens1.add(ListaEnvironment3());
		lanche1.setId(1L);
		lanche1.setIngredientes(itens1);
		lanche1.setDescricao("CarneTest");
		return lanche1;

	}

	public Lanche obterMuitoQueijoEnvironment() {

		Lanche lanche1 = new Lanche();
		List<Ingredientes> itens1 = new ArrayList<Ingredientes>();

		itens1.add(ListaEnvironment1());
		itens1.add(ListaEnvironment2());
		itens1.add(ListaEnvironment4());
		itens1.add(ListaEnvironment4());
		itens1.add(ListaEnvironment4());
		itens1.add(ListaEnvironment4());
		itens1.add(ListaEnvironment4());
		lanche1.setId(1L);
		lanche1.setIngredientes(itens1);
		lanche1.setDescricao("QueijoTest");
		return lanche1;

	}

	public Lanche obterLightEnvironment() {

		Lanche lanche1 = new Lanche();
		List<Ingredientes> itens1 = new ArrayList<Ingredientes>();

		itens1.add(ListaEnvironment1());
		itens1.add(ListaEnvironment3());
		itens1.add(ListaEnvironment3());
		itens1.add(ListaEnvironment4());
		itens1.add(ListaEnvironment4());
		lanche1.setId(1L);
		lanche1.setIngredientes(itens1);
		lanche1.setDescricao("QueijoTest");
		return lanche1;

	}

}
