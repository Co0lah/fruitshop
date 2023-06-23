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
	

			getServletContext().getRequestDispatcher("/WEB-INF/login-utilisateur.jsp").forward(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		System.out.println("Login form sent");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		System.out.println("User à taper ses indentifiants => email :  " + email + " |  password : " + password);
		
		
//		utilisateur.setEmail(email);
//		utilisateur.setPassword(password);
		
		HttpSession session=req.getSession();
		
		Utilisateur utilisateur = findUtilisateur(email, password); 
		
	
			if(utilisateur == null) {
				System.out.println("Utilisateur non trouvé");
				req.setAttribute("errorMessage", "identifiants invalides");
				getServletContext().getRequestDispatcher("/WEB-INF/login-utilisateur.jsp").forward(req, resp); 
				
				
			}else {
				session.setAttribute("utilisateur", utilisateur);
				session.setAttribute("prenom", utilisateur.getPrenom());
				session.setAttribute("nom", utilisateur.getNom());
				
				System.out.println("Utilisateur connecté");
				
				String profil = utilisateur.getProfil();
				
				if(profil != null) {
					
					if(utilisateur.getProfil().equals("Admin")) {
						System.out.println("ADMIN PAGE");
						getServletContext().getRequestDispatcher("/gestion-admin").forward(req, resp);
					}else if (utilisateur.getProfil().equals("Magasinier")) {
						System.out.println("MAGASINIER PAGE");
						getServletContext().getRequestDispatcher("/gestion-articles").forward(req, resp);
					}else {
						System.out.println("CLIENT PAGE");
						getServletContext().getRequestDispatcher("/gestion-achats").forward(req, resp); 
					}
					
				}else {
					System.out.println("Pas de profil, non autorisé ");
					getServletContext().getRequestDispatcher("/WEB-INF/login-utilisateur.jsp").forward(req, resp); 	
				}
				
			}
				
		
	}
	
	
	public Utilisateur findUtilisateur(String email, String password) {
		
		Utilisateur utilisateur = new Utilisateur();
		
		try {
			UtilisateurDaoImpl u = new UtilisateurDaoImpl();
		    utilisateur = u.findUser(email, password); 
			System.out.println(utilisateur);
			System.out.println("Email de l'user en BDD : " +utilisateur.getEmail());
			System.out.println("MDP de l'user en BDD : " +utilisateur.getPassword());
			System.out.println("Profil de l'user en BDD : " +utilisateur.getProfil());
		}catch(Exception ex) {
			
		}
			
		return utilisateur;
		
	}
	
}
