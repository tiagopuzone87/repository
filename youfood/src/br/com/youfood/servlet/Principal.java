package br.com.youfood.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/pedido" }, initParams = { 
		@WebInitParam(name = "param1", value = "value1"),
		@WebInitParam(name = "param2", value = "value2") })
public class Principal extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<head>");
		out.println("<title>YouFood</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Bem vindo ao YouFood Lanches!</h1>");
		out.println("<h1> ;) </h1>");
		out.println("<h1>Escolha uma das opções...</h1>");
		out.println("<h1> -> 1 Para acessar o cardápio. </h1>");
		out.println("<input type=\"button\" value=\"Cardapio\" onClick=\"window.location.href='http://localhost:8080/youfood/produto.html'\">");
		out.println("<h1> -> 2 Para montar um lanche personalizado.  </h1>");
		out.println("<input type=\"button\" value=\"Custom\" onClick=\"window.location.href='http://localhost:8080/youfood/personalizado'\">");
		out.println("</body>");
		out.println("</html>");
		
		

	}

}
