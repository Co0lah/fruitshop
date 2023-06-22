package com.fruit.servlet;

import java.io.IOException;

import javax.faces.context.FacesContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fruit.DaoImpl.UtilisateurDaoImpl;
import com.fruit.metier.Utilisateur;

public class LoginServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Login Servlet");		
		
		getServletContext().getRequestDispatcher("/WEB-INF/login-utilisateur.xhtml").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		System.out.println("Login form sent");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		System.out.println("User à taper ses indentifiants => email :  " + email + " |  password : " + password);
		
		UtilisateurDaoImpl u = new UtilisateurDaoImpl();
		Utilisateur utilisateur = u.findUser(email, password); 
		System.out.println(utilisateur);
		System.out.println("Email de l'user en BDD : " +utilisateur.getEmail());
		System.out.println("MDP de l'user en BDD : " +utilisateur.getPassword());
		System.out.println("Profil de l'user en BDD : " +utilisateur.getProfil());
//		utilisateur.setEmail(email);
//		utilisateur.setPassword(password);
		
		HttpSession session=req.getSession();
		//FIND UTILISATEUR
		if(utilisateur.getProfil().equals("client") && utilisateur.getEmail().equals(email) && utilisateur.getPassword().equals(password)){
			
			//utilisateur.setProfil("client"); Pour l'inscription ??
			
			System.out.println("Client connecté, redirection vers l'acceuil ");
			session.setAttribute("utilisateur", utilisateur);
			req.getRequestDispatcher("/WEB-INF/gestion-achats.xhtml").forward(req, resp);
		}else if(utilisateur.getProfil().equals("Magasinier") && utilisateur.getEmail().equals(email) && utilisateur.getPassword().equals(password)){
			
			utilisateur.setProfil("Magasinier");
			session.setAttribute("utilisateur", utilisateur);
			req.getRequestDispatcher("/WEB-INF/gestion-articles.xhtml").forward(req, resp);
			
		}else if (utilisateur.getProfil().equals("Admin") && utilisateur.getEmail().equals(email) && utilisateur.getPassword().equals(password)){
			utilisateur.setProfil("Admin");
			
			session.setAttribute("utilisateur", utilisateur);
			req.getRequestDispatcher("/WEB-INF/gestion-admin.xhtml").forward(req, resp);
			System.out.println("Utilisateur connecté, redirection vers la page gestion-admin.xhtml ");
		}else {
			System.out.println("Utilisateur non trouvé");
			req.setAttribute("errorMessage", "identifiants invalides");
			getServletContext().getRequestDispatcher("/WEB-INF/login-utilisateur.xhtml").forward(req, resp);
		}
		
	}
	
}
