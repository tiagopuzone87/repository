package br.com.youfood.service;

import java.util.List;

import br.com.youfood.model.Ingredientes;
import br.com.youfood.model.Lanche;

import br.com.youfood.service.DescontoService;

public class LancheService {

	public Lanche montagem(List<Ingredientes> ingredientes, String descricao) {

		DescontoService descontoService = new DescontoService();
		Lanche lanche1 = new Lanche();
		Double valor = 0D;
		lanche1.setDescricao(descricao);

		for (Ingredientes ingredientesAdd : ingredientes) {
			lanche1.getIngrediente().add(ingredientesAdd);
		}

		for (int x = 0; x <= lanche1.getIngrediente().size(); x++) {
			valor += lanche1.getIngrediente().get(x).getValor();
		}

		lanche1.setValor(valor);

		descontoService.calculaDesconto(ingredientes, lanche1.getValor());

		return lanche1;

	}

}
