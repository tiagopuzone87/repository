package br.com.youfood.dao;

import java.util.List;

import br.com.youfood.model.Ingredientes;
import br.com.youfood.model.Lanche;
import br.com.youfood.service.Custom;

public class Lanche_Lista extends Lanche {

	public Lanche montagem(Long codigo) {

		Lanche ret = new Lanche();
		Custom ing = new Custom();

		if (codigo == 1) {
			Lanche lanche1 = new Lanche();
			List<Ingredientes> itens1 = (List<Ingredientes>) new Ingredientes();
			itens1.add((Ingredientes) ing.opcional(1L));
			itens1.add((Ingredientes) ing.opcional(3L));
			itens1.add((Ingredientes) ing.opcional(5L));
			lanche1.setDescricao("X-Bacon");
			lanche1.setIngredientes(itens1);
			ret = lanche1;

		} else if (codigo == 2) {

			Lanche lanche2 = new Lanche();
			List<Ingredientes> itens2 = (List<Ingredientes>) new Ingredientes();
			itens2.add((Ingredientes) ing.opcional(3L));
			itens2.add((Ingredientes) ing.opcional(5L));
			lanche2.setDescricao("X-Burguer");
			lanche2.setIngredientes(itens2);
			ret = lanche2;

		} else if (codigo == 3) {

			Lanche lanche3 = new Lanche();
			List<Ingredientes> itens3 = (List<Ingredientes>) new Ingredientes();
			itens3.add((Ingredientes) ing.opcional(2L));
			itens3.add((Ingredientes) ing.opcional(4L));
			itens3.add((Ingredientes) ing.opcional(5L));
			lanche3.setDescricao("X-Egg");
			lanche3.setIngredientes(itens3);
			ret = lanche3;

		} else if (codigo == 4) {

			Lanche lanche4 = new Lanche();
			List<Ingredientes> itens4 = (List<Ingredientes>) new Ingredientes();
			itens4.add((Ingredientes) ing.opcional(2L));
			itens4.add((Ingredientes) ing.opcional(3L));
			itens4.add((Ingredientes) ing.opcional(4L));
			itens4.add((Ingredientes) ing.opcional(5L));
			lanche4.setDescricao("X-Egg-Bacon");
			lanche4.setIngredientes(itens4);
			ret = lanche4;
		}

		return ret;

	}

}
