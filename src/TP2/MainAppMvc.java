package TP2;

public class MainAppMvc {


	public static void main(String[] args) {
		Etudiant E= new EtudiantService("123", "Mohamed" , "BenMoh", "lksqmldqks@gmail.com"
				"dslmkfsdml" , "10" , "0", "15");
		Universite U = new Universite(15, "ALger", "standard");
		
		//Utiliser les fonctions d'affichage les messages avec une seule appel de la class Afficher message tout
		
		String message = "Le TP2 d'architecture logicielle";
		Afficher_tout();
		
		//Appler la fonction inscription
		E.Inscription();
		
		//Appler la fonction bounus
		E.bonus();
		
		E.viewInscription();
		E.ControleurInscription();
		
		//La variable university aide a implementer les fonctions de l'interface Etudiant
		
}
