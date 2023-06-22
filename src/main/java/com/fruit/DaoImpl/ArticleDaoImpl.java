/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fruit.DaoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.fruit.dao.Dao;
import com.fruit.dao.DaoFactory;
import com.fruit.metier.Article;

public class ArticleDaoImpl implements Dao<Article>{
private DaoFactory daoFactory;
    
    public ArticleDaoImpl() {
        this.daoFactory = DaoFactory.getInstance();
    }
    
    @Override
    public void create(Article A) {
        EntityManager entityManager = null;
        EntityTransaction entityTransaction = null;
        
        try {
            entityManager = daoFactory.getEntityManager();
            
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();
            
            entityManager.persist(A);
            
            entityTransaction.commit();
            System.out.println("*** Création Success ! **");
        }catch(Exception e) {
            System.out.println("*** Erreur lors de la création d'un article !! ***");
            System.out.println("Message: " + e.getMessage());
            if(entityTransaction != null)
                entityTransaction.rollback();
        }finally {
            if(entityManager != null)
                entityManager.close();
        }
        
    }

    @Override
    public Article findBy(int id) {
        
        EntityManager entityManager = null;
        
        Article article = new Article();
        
        try{
            entityManager = daoFactory.getEntityManager();
            
            article = entityManager.find(Article.class, id);
            if(article == null)
                System.out.println("Erreur avec l'id "+id+ " n'existe pas en DB");
        }catch(Exception e) {
            System.out.println("Erreur de recherche id " + id+ " inexistant en DB");
            System.out.println("Message: " + e.getMessage());
         }finally {
            if(entityManager != null)
                entityManager.close();
        }
        return article;
    }

    @Override
    public void update(Article u, int id) {
        EntityManager entityManager = null;
        EntityTransaction entityTransaction = null;
        
        try {
            entityManager = daoFactory.getEntityManager();
            
            Article articleDB = entityManager.find(Article.class, id);
            if(articleDB == null) {
                System.out.println("L'article  avec l'id " + id + " est inexistant en base !");
            }else {
            	articleDB.setNom(u.getNom());
            	articleDB.setDescription(u.getDescription());
            	articleDB.setCategorie(u.getCategorie());
            	articleDB.setPrix(u.getPrix());
            	articleDB.setRemise(u.getRemise());
            	articleDB.setStock(u.getStock());
            	articleDB.setVendable(u.isVendable());
            	articleDB.setPhotos(u.getPhotos());
            	articleDB.setVideos(u.getVideos());
            	articleDB.setCommentaires(u.getCommentaires());
                
                entityTransaction = entityManager.getTransaction();
                entityTransaction.begin();
                
                entityManager.persist(articleDB);
                entityTransaction.commit();
            }
        }catch(Exception e) {
                System.out.println("Erreur mise à jour d'un article ");
                System.out.println("Message: " + e.getMessage());
                if(entityTransaction != null)
                    entityTransaction.rollback();
            }finally {
            if(entityManager != null)
                entityManager.close();
        }
    }

    @Override
    public void delete(int id) {
     EntityManager entityManager = null;
        EntityTransaction entityTransaction = null;

        try {
            entityManager = daoFactory.getEntityManager();
            Article userDB = entityManager.find(Article.class, id);
            if (userDB == null) {
                System.out.println("L'article avec id " + id + " inexistant !");
            } else {
                entityTransaction = entityManager.getTransaction();

                entityTransaction.begin();
                entityManager.remove(userDB);
                entityTransaction.commit();
                System.out.println("Suppression Success !");
            }
        } catch (Exception e) {
            System.out.println ("Erreur lors de la suppression d'un article avec l'id " + id);
            System.out.println("Message : " + e.getMessage());
            if (entityTransaction != null) {
                entityTransaction.rollback();
            }
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
    }

    @Override
    public List<Article> findAll() {
        EntityManager entityManager = null;
        List<Article> panier = new ArrayList<>();
        
        try {
            entityManager = daoFactory.getEntityManager();
            
            Query query = entityManager.createQuery("SELECT e FROM Article e");
            panier = query.getResultList();
            
        }catch(Exception e) {
            System.out.println("Erreur recherche liste articles !");
            System.out.println("Message: " + e.getMessage());
        }
        
        return panier;
    }

}
