package br.com.youfood.service;

import java.util.List;

import br.com.youfood.model.Ingredientes;
import br.com.youfood.model.Lanche;

import br.com.youfood.service.DescontoService;

public class LancheService {

	public Double obterIngredientesValor(List<Ingredientes> ingredientes) {

		DescontoService descontoService = new DescontoService();
		Double valor = 0D;

		for (int x = 0; x < ingredientes.size(); x++) {
			valor += ingredientes.get(x).getValor();
		}

//		descontoService.calculaDesconto(ingredientes, valor);

		return valor;

	}

}
