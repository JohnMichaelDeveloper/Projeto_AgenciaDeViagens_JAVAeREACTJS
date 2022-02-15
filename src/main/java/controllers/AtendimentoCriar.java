package controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AtendimentoDao;
import model.Atendimento;


@WebServlet("/Criar")
public class AtendimentoCriar extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public AtendimentoCriar() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pesquisa = request.getParameter("pesquisa");
		
		if(pesquisa == null) {
			pesquisa="";
		}
		
		List<Atendimento> atendimentos = AtendimentoDao.find(pesquisa);
		
		request.setAttribute("atendimentos", atendimentos);
		RequestDispatcher resquesDispatcher = request.getRequestDispatcher("listaAtendimentos.jsp");
		resquesDispatcher.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Atendimento atendimento = new Atendimento();
		
		atendimento.setNome(request.getParameter("nome"));
		atendimento.setEmail(request.getParameter("email"));
		atendimento.setData_do_atend(request.getParameter("data_do_atend"));
		atendimento.setDuvida(request.getParameter("duvida"));
		atendimento.setSatisfacao(request.getParameter("satisfacao"));
		
		AtendimentoDao.create(atendimento);
		
		doGet(request, response);
	}

}
