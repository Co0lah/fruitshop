package com.fruit.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.fruit.metier.Utilisateur;





/**
 * Servlet Filter implementation class LoginFilter
 */
@WebFilter("/LoginFilter")
public class LoginFilter implements Filter {

    /**
     * Default constructor. 
     */
    public LoginFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("Login Filter START");
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
				System.out.println("Pas d'utilisateur connecté, page de connexeion");
				req.getRequestDispatcher("/WEB-INF/login-utilisateur.jsp").forward(request, response);
			}
		}else {
			 chain.doFilter(request, response );
		}

		

		System.out.println("Login Filter END");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
