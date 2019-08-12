package br.com.youfood.service;

import java.util.ArrayList;
import java.util.List;

import br.com.youfood.model.Ingredientes;
import br.com.youfood.model.Lanche;

public class AdicionaIngredientesService {

	List<Ingredientes> itensSelecionados = new ArrayList<Ingredientes>();
	Custom ing = new Custom();

	public List<Ingredientes> obterQuantidadeLista(Long codigo, String quantidade) {

		if (quantidade != null && !quantidade.isEmpty()) {
			for (int x = 0; x <  Long.parseLong(quantidade); x++) {

				itensSelecionados.add(ing.opcional(codigo));
			}
		}
		return itensSelecionados;
	}

}
