package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PacoteDao;
import model.Pacote;

/**
 * Servlet implementation class PacoteFindAndUpdate
 */
@WebServlet("/PacoteUpdate")
public class PacoteFindAndUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public PacoteFindAndUpdate() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int pacoteIdPacotes = Integer.parseInt(request.getParameter("pacoteIdPacotes"));
		Pacote pacote = PacoteDao.findByPk(pacoteIdPacotes);
		
		request.setAttribute("pacote", pacote);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("pacotesUpdate.jsp");
		requestDispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Pacote pacote = new Pacote();
		
		pacote.setIdPacotes(Integer.parseInt(request.getParameter("idPacotes")));
		pacote.setNome(request.getParameter("nome"));
		pacote.setOrigem(request.getParameter("origem"));
		pacote.setDestino(request.getParameter("destino"));
		pacote.setSaida(request.getParameter("saida"));
		pacote.setRetorno(request.getParameter("retorno"));
		pacote.setPreco_Unt(request.getParameter("preco_Unit"));
		pacote.setInform_add(request.getParameter("inform_add"));
		
		PacoteDao.update(pacote);
		
		PacoteCriarEncontrar pacoteCriarEncontrar = new PacoteCriarEncontrar();
		pacoteCriarEncontrar.doGet(request, response);
	}

}
