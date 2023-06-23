import com.fruit.DaoImpl.ArticleDaoImpl;
import com.fruit.DaoImpl.CategorieDaoImpl;
import com.fruit.DaoImpl.UtilisateurDaoImpl;
import com.fruit.dao.DaoFactory;
import com.fruit.metier.Article;
import com.fruit.metier.Categorie;
import com.fruit.metier.Utilisateur;

public class Main {

	public static void main(String[] args) {
		
	//	DaoFactory dao = new DaoFactory();
                //dao.getInstance();
		
		createAdmin(); 
		createMagasinier();
		createCategoriesAndFruits();
            
	}

	
	public static void createAdmin() {
		
	UtilisateurDaoImpl u = new UtilisateurDaoImpl();
		
		Utilisateur utilisateur = new Utilisateur(); 
		utilisateur.setNom("John");
		utilisateur.setPrenom("Doe");
		utilisateur.setEmail("john@doe.com");
		utilisateur.setPassword("password");
		utilisateur.setProfil("Admin");
		
		try {
			 u.create(utilisateur);
			 
			
		}catch (Exception e) {
			// TODO: handle exception
		}
             System.out.println("User added" );
	}; 
	
	public static void createMagasinier() {
		UtilisateurDaoImpl u = new UtilisateurDaoImpl();

		Utilisateur utilisateur2 = new Utilisateur(); 
		utilisateur2.setNom("Doe");
		utilisateur2.setPrenom("Jeanne");
		utilisateur2.setEmail("jeanne@doe.com");
		utilisateur2.setPassword("password");
		utilisateur2.setProfil("Magasinier");
		
		
		try {
			 u.create(utilisateur2);
			
		}catch (Exception e) {
			// TODO: handle exception
		}
             System.out.println("User added" );
	}
	
	
	public static void createCategoriesAndFruits() {
		CategorieDaoImpl categorieDaoImpl = new CategorieDaoImpl();
		ArticleDaoImpl articleDaoImpl = new ArticleDaoImpl();
		
		
		
		Categorie fruit = new Categorie ();
		fruit.setNom("Fruits");
		
		Categorie legume = new Categorie(); 
		legume.setNom("Légumes");
		
		Article friase = new Article(); 
		friase.setNom("Fraise");
		friase.setCategorie(fruit);
		friase.setPrix(2);
		friase.setStock(200);
		
		Article citron = new Article(); 
		citron.setNom("Citron");
		citron.setCategorie(fruit);
		citron.setPrix(1);
		citron.setStock(150);
		
		Article carotte = new Article(); 
		carotte.setNom("Carotte");
		carotte.setCategorie(legume);
		carotte.setPrix(0.8);
		carotte.setStock(200);
		
		Article tomate = new Article(); 
		tomate.setNom("Tomate");
		tomate.setCategorie(legume);
		tomate.setPrix(1);
		tomate.setStock(100);
		
		
		try {
			 categorieDaoImpl.create(fruit);
			 categorieDaoImpl.create(legume);
			 
			 articleDaoImpl.create(tomate); 
			 articleDaoImpl.create(carotte);
			 articleDaoImpl.create(citron);
			 articleDaoImpl.create(friase);
		}catch (Exception e) {
			// TODO: handle exception
		}
            System.out.println("Categories added" );
	}
	
	
	
	
	
}
