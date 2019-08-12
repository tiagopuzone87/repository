package br.com.youfood.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.youfood.model.Ingredientes;
import br.com.youfood.model.Lanche;
import br.com.youfood.service.Custom;
import br.com.youfood.service.LancheService;

public class Lanche_Lista extends Lanche {

	public Lanche obterLanchePronto(Long codigo) {

		Lanche ret = new Lanche();
		Custom ing = new Custom();
		LancheService obterValor = new LancheService();

		if (codigo == 1L) {
			Lanche lanche1 = new Lanche();
			List<Ingredientes> itens1 = new ArrayList<Ingredientes>();
			itens1.add(ing.opcional(2L));
			itens1.add(ing.opcional(3L));
			itens1.add(ing.opcional(5L));
			lanche1.setDescricao("X-Bacon");
			lanche1.setIngredientes(itens1);
			lanche1.setValor(obterValor.obterIngredientesValor(itens1));
			ret = lanche1;

		}

		else if (codigo == 2) {

			Lanche lanche2 = new Lanche();
			List<Ingredientes> itens2 = new ArrayList<Ingredientes>();
			itens2.add(ing.opcional(3L));
			itens2.add(ing.opcional(5L));
			lanche2.setDescricao("X-Burguer");
			lanche2.setIngredientes(itens2);
			ret = lanche2;

		} else if (codigo == 3) {

			Lanche lanche3 = new Lanche();
			List<Ingredientes> itens3 = new ArrayList<Ingredientes>();
			itens3.add(ing.opcional(4L));
			itens3.add(ing.opcional(3L));
			itens3.add(ing.opcional(5L));
			lanche3.setDescricao("X-Egg");
			lanche3.setIngredientes(itens3);
			ret = lanche3;

		} else if (codigo == 4) {

			Lanche lanche4 = new Lanche();
			List<Ingredientes> itens4 = new ArrayList<Ingredientes>();
			itens4.add(ing.opcional(2L));
			itens4.add(ing.opcional(3L));
			itens4.add(ing.opcional(4L));
			itens4.add(ing.opcional(5L));
			lanche4.setDescricao("X-Egg-Bacon");
			lanche4.setIngredientes(itens4);
			ret = lanche4;
		}

		return ret;

	}

}
