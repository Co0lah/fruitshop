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

public class SinscrireFilter implements Filter{

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("Register Filter BEGIN");
		HttpServletRequest req = (HttpServletRequest) request;
		if(!req.getMethod().equals("POST")  ) {
			
			HttpSession session = req.getSession();

			Utilisateur utilisateur = (Utilisateur) req.getSession().getAttribute("utilisateur");
			

			if (utilisateur != null) {
				String profil = utilisateur.getProfil();
				System.out.println("Utilisateur connecté, redirection vers une des pages de gestion ");
				// TODO change to profil enum
				if(profil != null) {
					if (utilisateur.getProfil().equals("Magasinier")) {
						req.getRequestDispatcher("/WEB-INF/gestion-articles.jsp").forward(request, response);
					} else if (utilisateur.getProfil().equals("Admin")) {
						req.getRequestDispatcher("/WEB-INF/gestion-admin.jsp").forward(request, response);

					} else {
						req.getRequestDispatcher("/WEB-INF/gestion-achats.jsp").forward(request, response);
					}
				}else {
					session.removeAttribute("utilisateur");
					req.getRequestDispatcher("/WEB-INF/login-utilisateur.jsp").forward(request, response);
				}
			

			}else {
				System.out.println("Pas d'utilisateur connecté, page d'inscription");
				chain.doFilter(request, response);
			}
		}else {
			 chain.doFilter(request, response );
		}
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
