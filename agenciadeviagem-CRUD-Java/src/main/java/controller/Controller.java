package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAO;
import model.Passagens;
import model.Pessoas;

@WebServlet(urlPatterns = { "/Controller", "/main", "/mainPessoas", "/insert", "/insertPessoas", "/select", "/selectPessoas", "/update", "/updatePessoas", "/delete", "/deletePessoas"})
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DAO dao = new DAO();
	Passagens passagem = new Passagens();
	Pessoas cadastro = new Pessoas();

	public Controller() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
		System.out.println(action);
		if (action.equals("/main")) {
			passagens(request, response);
		} else if (action.equals("/mainPessoas")) {
			cadastros(request, response);
		} else if (action.equals("/insert")) {
			adicionarPassagem(request, response);
		} else if (action.equals("/insertPessoas")) {
			adicionarCadastro(request, response);
		} else if (action.equals("/select")) {
			listarPassagem(request, response);
		} else if (action.equals("/selectPessoas")) {
			listarCadastro(request, response);
		} else if (action.equals("/update")) {
			editarPassagem(request, response);
		} else if (action.equals("/updatePessoas")) {
			editarCadastro(request, response);
		} else if (action.equals("/delete")) {
			removerPassagem(request, response);
		} else if (action.equals("/deletePessoas")) {
			removerCadastro(request, response);
		} else {
			response.sendRedirect("index.jsp");
		}
		dao.test();
	}

	// Passagens
	protected void passagens(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ArrayList<Passagens> lista = dao.listarPassagem();
		request.setAttribute("passagens", lista);
		RequestDispatcher rd = request.getRequestDispatcher("passagens.jsp");
		rd.forward(request, response);
	}
	
	// Cadastro
	protected void cadastros(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ArrayList<Pessoas> lista = dao.listarCadastro();
		request.setAttribute("cadastros", lista);
		RequestDispatcher rd = request.getRequestDispatcher("pessoas.jsp");
		rd.forward(request, response);
	}

	// Adicionar passagem
	protected void adicionarPassagem(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {	
		passagem.setOrigem(request.getParameter("origem"));
		passagem.setDestino(request.getParameter("destino"));
		passagem.setTrecho(request.getParameter("trecho"));
		passagem.setDataIda(request.getParameter("dataIda"));
		passagem.setDataVolta(request.getParameter("dataVolta"));
		passagem.setQtdPassageiros(Integer.parseInt(request.getParameter("qtdPassageiros")));
		dao.inserirPassagem(passagem);
		response.sendRedirect("main");
	}
	
	// Adicionar cadastro
	protected void adicionarCadastro(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {		
		cadastro.setNome(request.getParameter("nome"));
		cadastro.setCpf(request.getParameter("cpf"));
		dao.inserirCadastro(cadastro);
		response.sendRedirect("mainPessoas");
	}

	// Listar passagem
	protected void listarPassagem(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		passagem.setCodPassagens(Integer.parseInt(request.getParameter("codPassagens")));
		dao.selecionarPassagem(passagem);
		request.setAttribute("codPassagens", passagem.getCodPassagens());
		request.setAttribute("origem", passagem.getOrigem());
		request.setAttribute("destino", passagem.getDestino());
		request.setAttribute("trecho", passagem.getTrecho());
		request.setAttribute("dataIda", passagem.getDataIda());
		request.setAttribute("dataVolta", passagem.getDataVolta());
		request.setAttribute("qtdPassageiros", passagem.getQtdPassageiros());
		RequestDispatcher rd = request.getRequestDispatcher("editarPassagem.jsp");
		rd.forward(request, response);
	}
	
	// Listar cadastro
	protected void listarCadastro(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		cadastro.setCodPessoa(Integer.parseInt(request.getParameter("codPessoa")));
		dao.selecionarCadastro(cadastro);
		request.setAttribute("codPessoa", cadastro.getCodPessoa());
		request.setAttribute("nome", cadastro.getNome());
		request.setAttribute("cpf", cadastro.getCpf());
		RequestDispatcher rd = request.getRequestDispatcher("editarCadastro.jsp");
		rd.forward(request, response);
	}

	// Editar passagem
	protected void editarPassagem(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		passagem.setCodPassagens(Integer.parseInt(request.getParameter("codPassagens")));
		passagem.setOrigem(request.getParameter("origem"));
		passagem.setDestino(request.getParameter("destino"));
		passagem.setTrecho(request.getParameter("trecho"));
		passagem.setDataIda(request.getParameter("dataIda"));
		passagem.setDataVolta(request.getParameter("dataVolta"));
		passagem.setQtdPassageiros(Integer.parseInt(request.getParameter("qtdPassageiros")));
		dao.alterarPassagem(passagem);
		response.sendRedirect("main");
	}
	
	// Editar cadastro
	protected void editarCadastro(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		cadastro.setCodPessoa(Integer.parseInt(request.getParameter("codPessoa")));
		cadastro.setNome(request.getParameter("nome"));
		cadastro.setCpf(request.getParameter("cpf"));
		dao.alterarCadastro(cadastro);
		response.sendRedirect("mainPessoas");
	}

	// Deletar passagem
	protected void removerPassagem(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		passagem.setCodPassagens(Integer.parseInt(request.getParameter("codPassagens")));
		dao.deletarPassagem(passagem);
		response.sendRedirect("main");
	}
	
	// Deletar cadastro
	protected void removerCadastro(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		cadastro.setCodPessoa(Integer.parseInt(request.getParameter("codPessoa")));
		dao.deletarCadastro(cadastro);
		response.sendRedirect("mainPessoas");
	}
}
