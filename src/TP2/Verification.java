package TP2;

public class Verification extends EtudiantService{

	public Verification(int matricule, String nom, String prenom, String email, String pwd, int id_universite,
			int nbLivreMensuel_Autorise, int nbLivreEmprunte) {
		super(matricule, nom, prenom, email, pwd, id_universite, nbLivreMensuel_Autorise, nbLivreEmprunte);
		// TODO Auto-generated constructor stub
	}
	
	
	private boolean verifier () {
	 if(email == null || email.length() == 0)
	    {
	    	return false;
	    }
	    
	    if (StudRep.Exists(matricule))
	    {
	        return false;
	    }
	    
		if (StudRep.Exists(email))
	    {
	        return false;
	    }
		
		
		
		 if (univ.getPack() == TypePackage.Standard)
	     {
	         nbLivreMensuel_Autorise=10;
	     }
	     else if (univ.getPack() == TypePackage.Premium)
	     {
	    	  nbLivreMensuel_Autorise=10*2;
	     }                           
	     
		 StudRep.add(stud);
		 System.out.println("Log: Fin de l'opération d'ajout de l'étudiant avec matricule "+matricule);
		 return true;
	}
}
}
