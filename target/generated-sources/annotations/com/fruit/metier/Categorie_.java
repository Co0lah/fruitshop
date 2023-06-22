package com.fruit.metier;

import com.fruit.metier.Article;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-06-22T22:31:31")
@StaticMetamodel(Categorie.class)
public class Categorie_ { 

    public static volatile SingularAttribute<Categorie, Boolean> isRemiseCumulable;
    public static volatile SingularAttribute<Categorie, String> photo;
    public static volatile SingularAttribute<Categorie, Integer> id;
    public static volatile SingularAttribute<Categorie, Integer> remise;
    public static volatile SingularAttribute<Categorie, String> nom;
    public static volatile ListAttribute<Categorie, Article> articles;

}