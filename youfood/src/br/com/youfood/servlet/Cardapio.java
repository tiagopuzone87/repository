package br.com.youfood.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.youfood.dao.Lanche_Lista;
import br.com.youfood.model.Lanche;
import br.com.youfood.service.LancheService;

@WebServlet(urlPatterns = { "/adicionarProduto" })
public class Cardapio extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		String codigo = request.getParameter("codigo");

		DecimalFormat df = new DecimalFormat("#,###.00");
		Lanche_Lista produto = new Lanche_Lista();
		LancheService obterValor = new LancheService();
		Lanche pedido = new Lanche();

		pedido = produto.obterLanchePronto(Long.parseLong(codigo));

		out.println("<html>");
		out.println("<head>");
		out.println("<body>");
		if (pedido.getDescricao() != null) {
			Double valorTotal = obterValor.obterIngredientesValor(pedido.getIngredientes());
			out.println("<h1> Seu Pedido : <h1>" + pedido.getDescricao() + " , Valor total R$" + df.format(valorTotal)
					+ "</h1>");
			out.println("<h3> Ingredientes: </h3>");
			for (int x = 0; x < pedido.getIngredientes().size(); x++) {
				out.println(pedido.getIngredientes().get(x).getDescricao() + " -  Valor unit�rio: "
						+ (pedido.getIngredientes().get(x).getValor()) + "<br/>");
			}
		} else {
			out.println("<h1> Op��o n�o encontrada. </h1>");
		}
		out.println("<br />");
		out.println(
				"<input type=\"button\" value=\"Voltar ao menu principal\" onClick=\"window.location.href='http://localhost:8080/youfood/pedido'\">");
		out.println("<b />");
		out.println("</body>");
		out.println("</html>");

	}

}
