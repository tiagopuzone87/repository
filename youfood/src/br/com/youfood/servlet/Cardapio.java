package br.com.youfood.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/cardapio" })
public class Cardapio extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<head>");
		out.println("<title>YouFood</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Opção : </h1>");
		out.println("<h1>   </h1>");

		out.println(
				"<input type=\"button\" value=\"Voltar ao menu principal\" onClick=\"window.location.href='http://localhost:8080/youfood/pedido'\">");

		out.println("</body>");
		out.println("</html>");

	}

}
