/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.fruit.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fruit.metier.Adresse;
import com.fruit.metier.CartePaiement;
import com.fruit.metier.Utilisateur;

public class SinscrireServlet extends HttpServlet {
	
	public SinscrireServlet() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//CHECK IF USER IS NULL 
		
			
			getServletContext().getRequestDispatcher("/WEB-INF/add-utilisateur.jsp");
	
	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Sinscrire servlet : Formulaire d'enregistrement reçu");
		String nom =  req.getParameter("nom");
		String prenom =  req.getParameter("prenom");
		String dateNaissance =  req.getParameter("dateNaissance");
		String email =  req.getParameter("email");
		String password =  req.getParameter("password");
		String telephone = req.getParameter("telephone");
		String numeroRue = req.getParameter("numeroRue");
		String rue = req.getParameter("rue");
		String codePostal = req.getParameter("codePostal");
		String ville = req.getParameter("ville");
		String nomProprietaire = req.getParameter("nomProprietaire");
		String prenomProprietaire = req.getParameter("prenomProprietaire");
		String numeroCarte = req.getParameter("numeroCarte");
		String cryptogramme = req.getParameter("cryptogramme");
		String dateExpiration = req.getParameter("dateExpiration");
	
		Utilisateur utilisateur = new Utilisateur(); 
		utilisateur.setNom(nom);
		utilisateur.setPrenom(prenom);
		utilisateur.setEmail(email);
		utilisateur.setPassword(password);
		utilisateur.setTelephone(telephone);
		
		com.fruit.metier.Adresse adresse = new com.fruit.metier.Adresse(); 
		adresse.setNumero(Integer.parseInt(numeroRue));
		adresse.setRue(rue);
		adresse.setCodePostal(Integer.parseInt(codePostal));
		adresse.setVille(ville);
		adresse.setUtilisateur(utilisateur);
		
		com.fruit.metier.CartePaiement cartePaiement = new com.fruit.metier.CartePaiement(); 
		cartePaiement.setNomProprietaire(nomProprietaire);
		cartePaiement.setPrenomProprietaire(prenomProprietaire);
		cartePaiement.setNumero(numeroCarte);
		cartePaiement.setCryptogramme(cryptogramme);
		cartePaiement.setUtilisateur(utilisateur);
		
		
		
		System.out.println("nom:" + nom);
		
		req.getRequestDispatcher("/WEB-INF/acceuil.jsp").forward(req, resp);
	}
	
}
