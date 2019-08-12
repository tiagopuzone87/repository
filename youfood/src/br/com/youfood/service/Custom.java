package br.com.youfood.service;

import java.util.List;

import br.com.youfood.model.Ingredientes;
import br.com.youfood.model.Lanche;

public class Custom extends Ingredientes {

	public Ingredientes opcional(Long codigo) {

		Ingredientes ret = new Ingredientes();

		if (codigo == 1) {

			Ingredientes ingredientes1 = new Ingredientes();
			ingredientes1.setId(1L);
			ingredientes1.setDescricao("Alface");
			ingredientes1.setValor(0.4);

			ret = ingredientes1;

		} else if (codigo == 2) {

			Ingredientes ingredientes2 = new Ingredientes();
			ingredientes2.setId(2L);
			ingredientes2.setDescricao("Bacon");
			ingredientes2.setValor(2D);
			ret = ingredientes2;

		} else if (codigo == 3) {

			Ingredientes ingredientes3 = new Ingredientes();
			ingredientes3.setId(3L);
			ingredientes3.setDescricao("Hamburguer de Carne");
			ingredientes3.setValor(3D);
			ret = ingredientes3;

		} else if (codigo == 4) {

			Ingredientes ingredientes4 = new Ingredientes();
			ingredientes4.setId(4L);
			ingredientes4.setDescricao("Ovo");
			ingredientes4.setValor(0.8);
			ret = ingredientes4;
		} else if (codigo == 5) {

			Ingredientes ingredientes5 = new Ingredientes();
			ingredientes5.setId(5L);
			ingredientes5.setDescricao("Queijo");
			ingredientes5.setValor(1.5);
			ret = ingredientes5;

		}
		return ret;

	}
}
