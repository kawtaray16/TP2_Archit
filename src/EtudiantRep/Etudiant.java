package EtudiantRep;

import java.sql.SQLException;
import java.util.ArrayList;

public interface Etudiant {

	//ajouter un etudiant comme la classe Etudiant repository
	public void add(EtudiantRepository E) throws SQLException;
	
	//est-ce-que l'email existe déjà ou non
	public  boolean Exists(String email) throws SQLException;
	
	//est-ce-que la matricule existe déjà
	
	public 	boolean Exists(int mat) throws SQLException;
	
	//Les méthodes pour la class EtudiantService
	
	//Methode d'inscription pour le nouveau etudiant
	public boolean inscription (int matricule, String nom, String prenom, String email, String pwd, 
			int nbLivreMensuel_Autorise, int nbLivreEmprunte, int id_universite) throws SQLException;
	
	//Introduire les étudiants à une nouvelle liste 
	
	public ArrayList<Etudiant> GetEtudiantParUniversitye();
	
	//Introduire la liste des emprunts
	public ArrayList<Etudiant> GetEtudiatparLivreEmprunte();
	
	//Ajouter un bonus au forfait de bonus nombre de livres emprunter
	public void Bonus_livre();

	int Bonus_livre(int n);

	public void viewInscription();

	public void bonus();

	public void ControleurInscription();

	public void Inscription();

	public void Afficher_tout();


	
	

}
