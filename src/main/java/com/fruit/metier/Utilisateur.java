/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fruit.metier;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author celes
 */
@Entity
@Table(name = "utilisateur")
public class Utilisateur {

    //TODO: Check GESTION ROLE, Crypt pwd
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Utilisateur [id=");
        builder.append(id);
        builder.append(", nom=");
        builder.append(nom);
        builder.append(", prenom=");
        builder.append(prenom);
        builder.append(", DateNaissance=");
        builder.append(DateNaissance);
        builder.append(", isActif=");
        builder.append(isActif);
        builder.append(", profil=");
        builder.append(profil);
        builder.append(", email=");
        builder.append(email);
        builder.append(", password=");
        builder.append(password);
        builder.append(", telephone=");
        builder.append(telephone);
        builder.append(", commande=");
        builder.append(commande);
        builder.append(", cartesDePaiement=");
        builder.append(cartesDePaiement);
        builder.append(", commentaires=");
        builder.append(commentaires);
        builder.append(", panier=");
        builder.append(panier);
        builder.append("]");
        return builder.toString();
    }

    private String nom;

    private String prenom;

    private Date DateNaissance;

    private boolean isActif;

    private String profil;

    private String email;

    private String password;

    private String telephone;

    @OneToMany(mappedBy = "utilisateur")
    private List<Adresse> adresse;
    //private Adresse adresse; 

    @OneToMany(mappedBy = "utilisateur")
    private List< Commande> commande;
    //private Commande commande; 

    @OneToMany(mappedBy = "utilisateur")
    private List<CartePaiement> cartesDePaiement;
    //private CartePaiement cartesDePaiement; 

    @OneToMany(mappedBy = "utilisateur")
    private List<Commentaire> commentaires;
    //private String commentaires; 

    @OneToMany(mappedBy = "utilisateur")
    private List<ArticlePanier> panier;

    public Utilisateur() {

    }

    public Utilisateur(String nom, String prenom, Date dateNaissance, boolean isActif, String profil,
            String email, String password, String telephone, List<Adresse> adresse, List<Commande> commande,
            List<CartePaiement> cartesDePaiement, List<Commentaire> commentaires, List<ArticlePanier> panier) {
        super();
        this.nom = nom;
        this.prenom = prenom;
        this.DateNaissance = dateNaissance;
        this.isActif = isActif;
        this.profil = profil;
        this.email = email;
        this.password = password;
        this.telephone = telephone;
        this.adresse = adresse;
        this.commande = commande;
        this.cartesDePaiement = cartesDePaiement;
        this.commentaires = commentaires;
        this.panier = panier;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateNaissance() {
        return DateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        DateNaissance = dateNaissance;
    }

    public boolean isActif() {
        return isActif;
    }

    public void setActif(boolean isActif) {
        this.isActif = isActif;
    }

    public String getProfil() {
        return profil;
    }

    public void setProfil(String profil) {
        this.profil = profil;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

//	public Adresse getAdresse() {
//		return adresse;
//	}
//
//	public void setAdresse(Adresse adresse) {
//		this.adresse = adresse;
//	}
    public List<Adresse> getAdresse() {
        return adresse;
    }

    public void setAdresse(List<Adresse> adresse) {
        this.adresse = adresse;
    }

//	public Commande getCommande() {
//		return commande;
//	}
//
//	public void setCommande(Commande commande) {
//		this.commande = commande;
//	}
    public List<Commande> getCommande() {
        return commande;
    }

    public void setCommande(List<Commande> commande) {
        this.commande = commande;
    }

//	public CartePaiement getCartesDePaiement() {
//		return cartesDePaiement;
//	}
//
//	public void setCartesDePaiement(CartePaiement cartesDePaiement) {
//		this.cartesDePaiement = cartesDePaiement;
//	}
    public List<CartePaiement> getCartesDePaiement() {
        return cartesDePaiement;
    }

    public void setCartesDePaiement(List<CartePaiement> cartesDePaiement) {
        this.cartesDePaiement = cartesDePaiement;
    }

//	public String getCommentaires() {
//		return commentaires;
//	}
//
//	public void setCommentaires(String commentaires) {
//		this.commentaires = commentaires;
//	}
    public void setCommentaires(List<Commentaire> commentaires) {
        this.commentaires = commentaires;
    }

    public List<Commentaire> getCommentaires() {
        return commentaires;
    }

    public List<ArticlePanier> getPanier() {
        return panier;
    }

    public void setPanier(List<ArticlePanier> panier) {
        this.panier = panier;
    }

}
