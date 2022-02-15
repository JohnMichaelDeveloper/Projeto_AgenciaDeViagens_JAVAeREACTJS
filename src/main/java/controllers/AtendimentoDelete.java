package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AtendimentoDao;


@WebServlet("/AtendimentoDestroy")
public class AtendimentoDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public AtendimentoDelete() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int atendimentoIdAtend = Integer.parseInt(request.getParameter("atendimentoIdAtend"));
		AtendimentoDao.delete(atendimentoIdAtend);
		
		AtendimentoCriar atendimentoCriar = new AtendimentoCriar();
		atendimentoCriar.doGet(request, response);
		
	}

}
