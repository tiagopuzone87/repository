package br.com.youfood.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.youfood.dao.Lanche_Lista;
import br.com.youfood.model.Ingredientes;
import br.com.youfood.model.Lanche;
import br.com.youfood.service.AdicionaIngredientesService;
import br.com.youfood.service.Custom;
import br.com.youfood.service.LancheService;

@WebServlet(urlPatterns = { "/personalizaProduto" })
public class Personalizado extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		DecimalFormat df = new DecimalFormat("#,###.00");

		LancheService obterValor = new LancheService();
		Lanche pedido = new Lanche();
		List<Ingredientes> itensSelecionados = new ArrayList<Ingredientes>();
		Custom ing = new Custom();

		AdicionaIngredientesService addIng = new AdicionaIngredientesService();

		Long codigo1 = 1L;
		Long codigo2 = 2L;
		Long codigo3 = 3L;
		Long codigo4 = 4L;
		Long codigo5 = 5L;
		String quantidade1 = request.getParameter("cod1");
		String quantidade2 = request.getParameter("cod2");
		String quantidade3 = request.getParameter("cod3");
		String quantidade4 = request.getParameter("cod4");
		String quantidade5 = request.getParameter("cod5");

		out.println("<html>");
		out.println("<head>");
		out.println("<title>YouFood</title>");
		out.println("</head>");

		itensSelecionados = addIng.obterQuantidadeLista(codigo1, quantidade1);
		itensSelecionados = addIng.obterQuantidadeLista(codigo2, quantidade2);
		itensSelecionados = addIng.obterQuantidadeLista(codigo3, quantidade3);
		itensSelecionados = addIng.obterQuantidadeLista(codigo4, quantidade4);
		itensSelecionados = addIng.obterQuantidadeLista(codigo5, quantidade5);

		pedido.setIngredientes(itensSelecionados);

		out.println("<br />");

		out.println("<body>");

		if (pedido.getIngredientes() != null) {

			out.println("<h3> Ingredientes : </h3>");
			for (int x = 0; x < pedido.getIngredientes().size(); x++) {
				out.println(pedido.getIngredientes().get(x).getDescricao() + " -  Valor unitário: "
						+ (pedido.getIngredientes().get(x).getValor()) + "<br/>");
			}

			Double valorTotal = obterValor.obterIngredientesValor(pedido.getIngredientes());
			out.println("<h1> Valor total R$" + df.format(valorTotal) + "</h1>");
		}
		out.println("<br />");
		out.println(
				"<input type=\"button\" value=\"Voltar ao menu principal\" onClick=\"window.location.href='http://localhost:8080/youfood/pedido'\">");

		out.println("</body>");
		out.println("</html>");

	}

}
