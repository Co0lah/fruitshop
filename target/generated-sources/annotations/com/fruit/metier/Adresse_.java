package com.fruit.metier;

import com.fruit.metier.Utilisateur;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-06-22T22:31:31")
@StaticMetamodel(Adresse.class)
public class Adresse_ { 

    public static volatile SingularAttribute<Adresse, String> ville;
    public static volatile SingularAttribute<Adresse, String> rue;
    public static volatile SingularAttribute<Adresse, Integer> numero;
    public static volatile SingularAttribute<Adresse, Utilisateur> utilisateur;
    public static volatile SingularAttribute<Adresse, Integer> id;
    public static volatile SingularAttribute<Adresse, Integer> codePostal;

}