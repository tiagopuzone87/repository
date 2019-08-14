package br.com.youfood.testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.youfood.dao.Lanche_Lista;
import br.com.youfood.model.Lanche;
import br.com.youfood.service.DescontoService;
import br.com.youfood.service.LancheService;

public class cardapioTest {

	@Test
	public void pedidoCardapioTest() {

		Double result = 39.0;
		ListaIngredientesEnvironment produto = new ListaIngredientesEnvironment();
		LancheService obterValor = new LancheService();
		Lanche pedido = new Lanche();

		pedido = produto.obterIngredientesEnvironment();
		Double valorTotal = obterValor.obterIngredientesValor(pedido.getIngredientes());

		assertEquals(result, valorTotal);

	}

}
