package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AutenticacaoLogin")
public class AutenticacaoLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AutenticacaoLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			//obtendo os campos do formulario
			String login = request.getParameter("login");
			String senha = request.getParameter("senha");
			//instanciando a classe dao
			dao.LoginDao dao = new dao.LoginDao();
			String status = dao.validaLogin(login, senha);
			//verifica se o login e valido
			if (status.equals("valido")) {
				// se for valido, redirecionamos para o menu
				response.sendRedirect("menu.jsp");
			}
			else {
				//caso contrario, voltamos para o login
				request.getSession().setAttribute("erro", "Usuario ou Senha informados sao invalidos!");
				response.sendRedirect("login.jsp");	
			}
		}
		catch (Exception e) {}
		
	}
	
}
