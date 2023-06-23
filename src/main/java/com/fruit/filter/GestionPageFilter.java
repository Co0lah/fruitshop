package com.fruit.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.fruit.metier.Utilisateur;

public class GestionPageFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		System.out.println("Gestion de pages Filter START");
		HttpServletRequest req = (HttpServletRequest) request;
		HttpSession session = req.getSession();
		
		
		Utilisateur utilisateur = (Utilisateur) session.getAttribute("utilisateur"); 
		if(utilisateur == null) {
			req.getRequestDispatcher("/WEB-INF/login-utilisateur.jsp"); 
			System.out.println("Pas d'utilsateur, acceuil");
			
			
		}else {
			String profil = utilisateur.getProfil();
			System.out.println("Gestion de pages Filter UTILISATEUR FOUND");
			
			
			if(profil != null) {
				if(utilisateur.getProfil().equals("Admin")) {
					req.getRequestDispatcher("/WEB-INF/gestion-admin.jsp");
					System.out.println("Gestion de pages Filter ADMIN");
					
				}else if (utilisateur.getProfil().equals("Magasinier")) {
					req.getRequestDispatcher("/WEB-INF/gestion-articles.jsp");
					System.out.println("Gestion de pages Filter MAGASINIER");
				}else {
					req.getRequestDispatcher("/WEB-INF/gestion-achats.jsp");
					System.out.println("Gestion de pages Filter CLIENT");
				}
			}else {
				System.out.println("Pas de profil, non autorisé ");
				req.getRequestDispatcher("/WEB-INF/login-utilisateur.jsp");	
			}
		
		}
		
		System.out.println("Gestion de pages Filter END");
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
