package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AtendimentoDao;
import model.Atendimento;

/**
 * Servlet implementation class AtendimentoFindAndUpdate
 */
@WebServlet("/AtendimentoUpdate")
public class AtendimentoFindAndUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public AtendimentoFindAndUpdate() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int atendimentoIdAtend = Integer.parseInt(request.getParameter("atendimentoIdAtend"));
		Atendimento atendimento = AtendimentoDao.findByPk(atendimentoIdAtend);
		
		request.setAttribute("atendimento", atendimento);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("atendimentoUpdate.jsp");
		requestDispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Atendimento atendimento = new Atendimento();
		
		atendimento.setIdAtend(Integer.parseInt(request.getParameter("idAtend")));
		atendimento.setNome(request.getParameter("nome"));
		atendimento.setEmail(request.getParameter("email"));
		atendimento.setData_do_atend(request.getParameter("data_do_atend"));
		atendimento.setDuvida(request.getParameter("duvida"));
		atendimento.setSatisfacao(request.getParameter("satisfacao"));
		
		
		AtendimentoDao.update(atendimento);
		
		AtendimentoCriar atendimentoCriar  = new AtendimentoCriar ();
		atendimentoCriar.doGet(request, response);
	}

}
