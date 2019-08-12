package br.com.youfood.service;

import java.util.ArrayList;
import java.util.List;

import br.com.youfood.dao.Lanche_Lista;
import br.com.youfood.model.Ingredientes;

public class DescontoService {

	public Double calculaDesconto(List<Ingredientes> ingredientes, Double valorTotal) {

		List<Ingredientes> ingredientesUtilizado = (List<Ingredientes>) new Ingredientes();
		Lanche_Lista pronto = new Lanche_Lista();
		Custom ing_select = new Custom();

		boolean chave1 = false; // alface
		boolean chave2 = false; // bacon
		boolean chave3 = false; // carne
		int quantidadeItem1 = 3;
		int quantidadeItem2 = 3;
		int quantidadeDesconto1 = 0;
		int quantidadeDesconto2 = 0;
		int contador1 = 0;
		int contador2 = 0;

		Double valor = 0.0;
		for (int x = 0; x <= ingredientes.size(); x++) {
			ingredientesUtilizado.get(x).setId(ingredientes.get(x).getId());

			if (ingredientes.get(x).getId() == 1) {
				chave1 = true;
			}

			if (ingredientes.get(x).getId() == 2) {
				chave2 = true;
			}

			if (ingredientesUtilizado.get(x).getId() == 3) {
				contador1++;
				if (quantidadeItem1 % contador1 == 0) {
					quantidadeDesconto1++;
				}
			}

			if (ingredientesUtilizado.get(x).getId() == 4) {
				contador2++;
				if (quantidadeItem2 % contador2 == 0) {
					quantidadeDesconto2++;
				}
			}

		}

		// Desconto pelos ingredientes tem alface e nao tem bacon
		if (chave1 && !chave2) {
			valorTotal = ((valorTotal * 10) / 100);
		}

		// Desconto quantidade multipla de porção de carne
		if (quantidadeDesconto1 > 0) {
			valorTotal = (valorTotal - (quantidadeDesconto1 * ing_select.opcional(3L).getValor()));
		}

		// Desconto quantidade multipla de porção de queijo
		if (quantidadeDesconto2 > 0) {
			valorTotal = (valorTotal - (quantidadeDesconto2 * ing_select.opcional(5L).getValor()));
		}

		return valorTotal;

	}
}
