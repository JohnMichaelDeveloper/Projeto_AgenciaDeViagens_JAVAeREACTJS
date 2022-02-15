package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CadastroDao;
import model.Cadastro;

/**
 * Servlet implementation class CadastroFindAndUpdate
 */
@WebServlet("/CadastroUpdate")
public class CadastroFindAndUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public CadastroFindAndUpdate() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int cadastroId = Integer.parseInt(request.getParameter("cadastroId"));
		Cadastro cadastro = CadastroDao.findByPk(cadastroId);
		
		request.setAttribute("cadastro", cadastro);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("formUpdate.jsp");
		requestDispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Cadastro cadastro = new Cadastro();
		
		cadastro.setId(Integer.parseInt(request.getParameter("id")));
		cadastro.setNome(request.getParameter("nome"));
		cadastro.setCpf(request.getParameter("cpf"));
		cadastro.setNascimento(request.getParameter("nascimento"));
		cadastro.setLogin(request.getParameter("login"));
		cadastro.setSenha(request.getParameter("senha"));
		cadastro.setTipoDeConta(request.getParameter("tipoDeConta"));
		
		CadastroDao.update(cadastro);
		
		CadastroCreateAndFind cadastroCreateAndFind = new CadastroCreateAndFind();
		cadastroCreateAndFind.doGet(request, response);
	}

}
