package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PacoteDao;


@WebServlet("/PacoteDestroy")
public class PacoteDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public PacoteDelete() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int pacoteIdPacotes = Integer.parseInt(request.getParameter("pacoteIdPacotes"));
		PacoteDao.delete(pacoteIdPacotes);
		
		PacoteCriarEncontrar pacoteCriarEncontrar = new PacoteCriarEncontrar();
		pacoteCriarEncontrar.doGet(request, response);
		
	}

}
