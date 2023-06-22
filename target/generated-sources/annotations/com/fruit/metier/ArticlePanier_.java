package com.fruit.metier;

import com.fruit.metier.Article;
import com.fruit.metier.Utilisateur;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-06-22T23:03:56")
@StaticMetamodel(ArticlePanier.class)
public class ArticlePanier_ { 

    public static volatile SingularAttribute<ArticlePanier, Utilisateur> utilisateur;
    public static volatile SingularAttribute<ArticlePanier, Integer> id;
    public static volatile SingularAttribute<ArticlePanier, Article> article;
    public static volatile SingularAttribute<ArticlePanier, Integer> quantite;

}