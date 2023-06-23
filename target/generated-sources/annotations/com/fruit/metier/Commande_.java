package com.fruit.metier;

import com.fruit.metier.Adresse;
import com.fruit.metier.CartePaiement;
import com.fruit.metier.LigneDeCommande;
import com.fruit.metier.Utilisateur;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-06-23T06:15:10")
@StaticMetamodel(Commande.class)
public class Commande_ { 

    public static volatile SingularAttribute<Commande, LocalDateTime> dateCreation;
    public static volatile SingularAttribute<Commande, Integer> numero;
    public static volatile SingularAttribute<Commande, Utilisateur> utilisateur;
    public static volatile SingularAttribute<Commande, LocalDateTime> dateLivraison;
    public static volatile SingularAttribute<Commande, Adresse> adresseFacturation;
    public static volatile SingularAttribute<Commande, Double> fraisExpedition;
    public static volatile SingularAttribute<Commande, Double> totalGeneral;
    public static volatile SingularAttribute<Commande, Integer> id;
    public static volatile SingularAttribute<Commande, Double> totalRemise;
    public static volatile SingularAttribute<Commande, Adresse> adresseLivraison;
    public static volatile SingularAttribute<Commande, CartePaiement> cartePaiementDefaut;
    public static volatile ListAttribute<Commande, LigneDeCommande> ligneCommande;

}