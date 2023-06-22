import com.fruit.DaoImpl.UtilisateurDaoImpl;
import com.fruit.dao.DaoFactory;
import com.fruit.metier.Utilisateur;

public class Main {

	public static void main(String[] args) {
		
	//	DaoFactory dao = new DaoFactory();
                //dao.getInstance();
		
		UtilisateurDaoImpl u = new UtilisateurDaoImpl();
		Utilisateur user = u.findUser("micksabey@gmail.com", "12345");
              System.out.println(user );
	}

}
