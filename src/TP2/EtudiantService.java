package TP2;

import java.sql.SQLException;
import java.util.ArrayList;

public class EtudiantService implements Etudiant{

	protected int matricule;
    private String nom;
    private String prenom;
    protected String email ;
    private String pwd;
    protected int nbLivreMensuel_Autorise;
    private int nbLivreEmprunte;
    private int id_universite;
    private EtudiantRepository E;
    

	public EtudiantService(int matricule, String nom, String prenom, String email, String pwd, int id_universite, int nbLivreMensuel_Autorise,
		    int nbLivreEmprunte) {
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.pwd = pwd;
		this.id_universite = id_universite;
		this.id_universite = id_universite;
		this.nbLivreMensuel_Autorise=nbLivreMensuel_Autorise;
		this.nbLivreEmprunte = nbLivreEmprunte;
	}

public EtudiantService(String string, String string2, String string3,
			String string4, String string5, String string6, String string7) {
		// TODO Auto-generated constructor stub
	}

public ArrayList<Etudiant> GetEtudiantParUniversitye()
{
    //...
	return new ArrayList<>(4);
}

public ArrayList<Etudiant> GetEtudiatparLivreEmprunte()
{
    //...
	return new ArrayList<>(4);
	
}
public void add(Etudiant E) throws SQLException {
	// TODO Auto-generated method stub
	
}
@Override
public boolean Exists(String email) throws SQLException {
	// TODO Auto-generated method stub
	return false;
}




@Override
public boolean Exists(int mat) throws SQLException {
	// TODO Auto-generated method stub
	return false;
}




@Override
public boolean inscription(int matricule, String nom, String prenom, String email, String pwd,
		int nbLivreMensuel_Autorise, int nbLivreEmprunte, int id_universite) throws SQLException {
	EtudiantRepository StudRep= new EtudiantRepository(id_universite, pwd, pwd, pwd, pwd, id_universite, id_universite, id_universite);
    UniversityRepository UnivRep= new UniversityRepository();
    Etudiant stud = new EtudiantService(matricule, nom, prenom, email,pwd,id_universite, id_universite, id_universite);
    Universite univ=UnivRep.GetById(id_universite);
    
    System.out.println("Log: début de l'opération d'ajout de l'étudiant avec matricule "+matricule);
    
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
		 
         nbLivreMensuel_Autorise=Bonus_livre(10);
     }
     else if (univ.getPack() == TypePackage.Premium)
     {
    	  nbLivreMensuel_Autorise=Bonus_livre(10)*2;
     }                           
     
	 StudRep.add(stud);
	 System.out.println("Log: Fin de l'opération d'ajout de l'étudiant avec matricule "+matricule);
	 return true;
    
}


@Override
public int Bonus_livre(int n) {
	int s;
	s=nbLivreMensuel_Autorise+n;
	return s;
}

@Override
public void add(EtudiantRepository E) throws SQLException {
	// TODO Auto-generated method stub
	
}

@Override
public void Bonus_livre() {
	// TODO Auto-generated method stub
	
}



}
