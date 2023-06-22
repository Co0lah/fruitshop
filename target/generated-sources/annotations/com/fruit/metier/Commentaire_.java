package com.fruit.metier;

import com.fruit.metier.Article;
import com.fruit.metier.Utilisateur;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-06-22T20:01:01")
@StaticMetamodel(Commentaire.class)
public class Commentaire_ { 

    public static volatile SingularAttribute<Commentaire, Integer> note;
    public static volatile SingularAttribute<Commentaire, Utilisateur> utilisateur;
    public static volatile SingularAttribute<Commentaire, String> texte;
    public static volatile SingularAttribute<Commentaire, Integer> id;
    public static volatile SingularAttribute<Commentaire, Article> article;

}