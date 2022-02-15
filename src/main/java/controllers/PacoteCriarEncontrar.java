package controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PacoteDao;
import model.Pacote;


@WebServlet("/CriarEncontrar")
public class PacoteCriarEncontrar extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public PacoteCriarEncontrar() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pesquisa = request.getParameter("pesquisa");
		
		if(pesquisa == null) {
			pesquisa="";
		}
		
		List<Pacote> pacotes = PacoteDao.find(pesquisa);
		
		request.setAttribute("pacotes", pacotes);
		RequestDispatcher resquesDispatcher = request.getRequestDispatcher("listaPacotes.jsp");
		resquesDispatcher.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Pacote pacote = new Pacote();
		
		pacote.setNome(request.getParameter("nome"));
		pacote.setOrigem(request.getParameter("origem"));
		pacote.setDestino(request.getParameter("destino"));
		pacote.setSaida(request.getParameter("saida"));
		pacote.setRetorno(request.getParameter("retorno"));
		pacote.setPreco_Unt(request.getParameter("preco_Unt"));
		pacote.setInform_add(request.getParameter("inform_add"));
		
		PacoteDao.create(pacote);
		
		doGet(request, response);
	}

}
