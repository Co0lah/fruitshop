package com.fruit.metier;

import com.fruit.metier.Utilisateur;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-06-23T06:15:10")
@StaticMetamodel(CartePaiement.class)
public class CartePaiement_ { 

    public static volatile SingularAttribute<CartePaiement, String> numero;
    public static volatile SingularAttribute<CartePaiement, String> cryptogramme;
    public static volatile SingularAttribute<CartePaiement, Utilisateur> utilisateur;
    public static volatile SingularAttribute<CartePaiement, Integer> id;
    public static volatile SingularAttribute<CartePaiement, LocalDateTime> dateFinValidite;
    public static volatile SingularAttribute<CartePaiement, String> nomProprietaire;
    public static volatile SingularAttribute<CartePaiement, String> prenomProprietaire;

}