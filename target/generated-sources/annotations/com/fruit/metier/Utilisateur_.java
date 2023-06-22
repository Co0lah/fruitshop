package com.fruit.metier;

import com.fruit.metier.Adresse;
import com.fruit.metier.ArticlePanier;
import com.fruit.metier.CartePaiement;
import com.fruit.metier.Commande;
import com.fruit.metier.Commentaire;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-06-22T23:03:56")
@StaticMetamodel(Utilisateur.class)
public class Utilisateur_ { 

    public static volatile SingularAttribute<Utilisateur, String> profil;
    public static volatile SingularAttribute<Utilisateur, Date> DateNaissance;
    public static volatile SingularAttribute<Utilisateur, String> telephone;
    public static volatile SingularAttribute<Utilisateur, Boolean> isActif;
    public static volatile ListAttribute<Utilisateur, Commande> commande;
    public static volatile SingularAttribute<Utilisateur, String> nom;
    public static volatile ListAttribute<Utilisateur, ArticlePanier> panier;
    public static volatile SingularAttribute<Utilisateur, String> password;
    public static volatile ListAttribute<Utilisateur, CartePaiement> cartesDePaiement;
    public static volatile ListAttribute<Utilisateur, Adresse> adresse;
    public static volatile ListAttribute<Utilisateur, Commentaire> commentaires;
    public static volatile SingularAttribute<Utilisateur, Integer> id;
    public static volatile SingularAttribute<Utilisateur, String> prenom;
    public static volatile SingularAttribute<Utilisateur, String> email;

}