package br.com.youfood.testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.DecimalFormat;

import org.junit.jupiter.api.Test;

import br.com.youfood.model.Lanche;
import br.com.youfood.service.DescontoService;
import br.com.youfood.service.LancheService;

public class PersonalizadoTest {
	
	DecimalFormat df = new DecimalFormat("#,###.00");

	//Teste para obter o desconto sobre o valor do ingrediente, no qual a cada três, são cobrados dois.
	@Test
	public void calculaDescontoMuitaCarneTest() {

		Double result = 85.0;
		ListaLancheDescontoEnvironment produto = new ListaLancheDescontoEnvironment();
		LancheService obterValor = new LancheService();
		Lanche pedido = new Lanche();
		DescontoService descontoService = new DescontoService();

		pedido = produto.obterMuitaCarneEnvironment();
		Double valorTotal = obterValor.obterIngredientesValor(pedido.getIngredientes());
		descontoService.calculaDesconto(pedido.getIngrediente(), valorTotal);

		assertEquals(result, valorTotal);

	}
	
	//Teste para obter o desconto sobre o valor do ingrediente, no qual a cada três, são cobrados dois.
	@Test
	public void calculaDescontoMuitoQueijoTest() {

		Double result = 38.0;
		ListaLancheDescontoEnvironment produto = new ListaLancheDescontoEnvironment();
		LancheService obterValor = new LancheService();
		Lanche pedido = new Lanche();
		DescontoService descontoService = new DescontoService();

		pedido = produto.obterMuitoQueijoEnvironment();
		Double valorTotal = obterValor.obterIngredientesValor(pedido.getIngredientes());
		descontoService.calculaDesconto(pedido.getIngrediente(), valorTotal);

		assertEquals(result, valorTotal);

	}
	
	//Teste para obter o desconto sobre o valor total da promoção LIGHT
	@Test
	public void calculaDescontoLightTest() {

		String result = df.format(62.64);
		ListaLancheDescontoEnvironment produto = new ListaLancheDescontoEnvironment();
		LancheService obterValor = new LancheService();
		Lanche pedido = new Lanche();
		DescontoService descontoService = new DescontoService();

		pedido = produto.obterLightEnvironment();
		Double valorTotal = obterValor.obterIngredientesValor(pedido.getIngredientes());
		descontoService.calculaDesconto(pedido.getIngrediente(), valorTotal);

		assertEquals(result, df.format(valorTotal));

	}

}
