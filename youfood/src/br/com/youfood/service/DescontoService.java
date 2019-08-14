package br.com.youfood.service;

import java.util.ArrayList;
import java.util.List;

import br.com.youfood.dao.Lanche_Lista;
import br.com.youfood.model.Ingredientes;

public class DescontoService {

	public Double calculaDesconto(List<Ingredientes> ingredientes, Double valorTotal) {

		Lanche_Lista pronto = new Lanche_Lista();
		Custom ing_select = new Custom();

		boolean chave1 = false; // alface
		boolean chave2 = false; // bacon
		boolean chave3 = false; // carne
		int quantidadeItem1 = 3;
		int quantidadeItem2 = 3;
		int quantidadeDesconto1 = 0;
		int quantidadeDesconto2 = 0;
		int contador1 = 1;
		int contador2 = 1;
		Double valorUnitarioCarne = ing_select.opcional(3L).getValor();
		Double valorUnitarioQueijo = ing_select.opcional(5L).getValor();
		Double desconto = 0.0;
		int porcentagem = 10;

		Double valor = 0.0;
		for (int x = 0; x < ingredientes.size(); x++) {

			if (ingredientes.get(x).getId() == 1) {
				chave1 = true;
			} else

			if (ingredientes.get(x).getId() == 2) {
				chave2 = true;
			} else

			if (ingredientes.get(x).getId() == 3) {

				if ((contador1 % 3) == 0 && contador1 >= 3) {
					quantidadeDesconto1++;
				}
				contador1++;

			} else

			if (ingredientes.get(x).getId() == 5) {

				if ((contador2 % 3) == 0 && contador2 >= 3) {
					quantidadeDesconto2++;
				}
				contador2++;
			}
		}

		// Muita carne
		if (quantidadeDesconto1 > 0) {
			valorTotal -= (quantidadeDesconto1 * (valorUnitarioCarne));
		}

		// Muito queijo
		if (quantidadeDesconto2 > 0) {
			valorTotal -= (quantidadeDesconto2 * (valorUnitarioQueijo));
		}

		// Light
		if (chave1 && !chave2) {
			desconto = ((valorTotal * porcentagem) / 100);
		}

		return (valorTotal - desconto);

	}
}
