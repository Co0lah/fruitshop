package com.fruit.metier;

import com.fruit.metier.Article;
import com.fruit.metier.Commande;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-06-23T06:15:10")
@StaticMetamodel(LigneDeCommande.class)
public class LigneDeCommande_ { 

    public static volatile SingularAttribute<LigneDeCommande, Double> prixUnitaire;
    public static volatile SingularAttribute<LigneDeCommande, Double> remiseArticle;
    public static volatile SingularAttribute<LigneDeCommande, Integer> id;
    public static volatile SingularAttribute<LigneDeCommande, Commande> commande;
    public static volatile SingularAttribute<LigneDeCommande, Article> article;
    public static volatile SingularAttribute<LigneDeCommande, Integer> quantite;

}