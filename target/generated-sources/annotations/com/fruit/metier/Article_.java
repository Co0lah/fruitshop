package com.fruit.metier;

import com.fruit.metier.Categorie;
import com.fruit.metier.Commentaire;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-06-22T20:01:01")
@StaticMetamodel(Article.class)
public class Article_ { 

    public static volatile SingularAttribute<Article, Boolean> isVendable;
    public static volatile SingularAttribute<Article, Categorie> categorie;
    public static volatile SingularAttribute<Article, Double> prix;
    public static volatile SingularAttribute<Article, String> description;
    public static volatile SingularAttribute<Article, String> videos;
    public static volatile ListAttribute<Article, Commentaire> commentaires;
    public static volatile SingularAttribute<Article, Integer> id;
    public static volatile SingularAttribute<Article, Integer> remise;
    public static volatile SingularAttribute<Article, Integer> stock;
    public static volatile SingularAttribute<Article, String> nom;
    public static volatile SingularAttribute<Article, String> photos;

}