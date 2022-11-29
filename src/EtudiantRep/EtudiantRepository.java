package EtudiantRep;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import DBC.DBConnection;
import UniversityRep.Universite;

public class EtudiantRepository implements Etudiant{

	private int matricule;
    private String nom;
    private String prenom;
    private String email ;
    private String pwd;
    private int nbLivreMensuel_Autorise;
    private int nbLivreEmprunte;
    private int id_universite;
    private Universite Univ;
    
   // int ID = Univ.getI_univ();
	public EtudiantRepository(int matricule, String nom, String prenom, String email, String pwd, int id_universite, int nbLivreMensuel_Autorise,
    int nbLivreEmprunte) {
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.pwd = pwd;
		this.id_universite = id_universite;
		this.nbLivreMensuel_Autorise=nbLivreMensuel_Autorise;
		this.nbLivreEmprunte = nbLivreEmprunte;
			}

	void add(Etudiant E) throws SQLException
	{

		DBConnection BD= new DBConnection();
		Connection connect=BD.getConn();
		
		Statement stmt = connect.createStatement();
		String sql = "INSERT into etudiant values (" + matricule + ",'" + nom + "','" + prenom + "','" + email + "'," +nbLivreMensuel_Autorise+ "," +nbLivreEmprunte + "," +id_universite+")";
		int rs = stmt.executeUpdate(sql);
		
		if (rs == 1){
			System.out.println("log : ajout dans la BD réussi de l'étudiant  du Matricule" + matricule);
			}else if (rs == 0){
				System.out.println("log : Echec de l'ajout dans la BD de l'étudiant  du Matricule" + matricule);
			}
		connect.close();
	 }


	public boolean Exists(String email) throws SQLException	
	{
		DBConnection BD= new DBConnection();
		Connection connect=BD.getConn();
		
		Statement stmt = connect.createStatement();
		String sql = "select * from etudiant where email='"+ email+"'";
		boolean rs = stmt.execute(sql);
		
		if (rs){
			System.out.println("logBD--- :email existe dans la BD  " + email);
			connect.close();
			return true;
			}
		System.out.println("logBD--- : email n'existe pas " + email);	
		connect.close();
		return false;
	}
	
	public boolean Exists(int mat) throws SQLException{
		DBConnection BD= new DBConnection();
		Connection connect=BD.getConn();
		
		Statement stmt = connect.createStatement();
		String sql = "select * from etudiant where matricule="+ mat;
		boolean rs = stmt.execute(sql);
		
		if (rs){
			System.out.println("logBD--- :etudiant avec ce matricule existe déja dans la BD  " + mat);
			connect.close();
			return true;
			}
		System.out.println("logBD----: etudiant avec ce matricule n'existe pas " + mat);	
		connect.close();
		return false;
	}

	@Override
	public void add(EtudiantRepository E) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean inscription(int matricule, String nom, String prenom,
			String email, String pwd, int nbLivreMensuel_Autorise,
			int nbLivreEmprunte, int id_universite) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Etudiant> GetEtudiantParUniversitye() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Etudiant> GetEtudiatparLivreEmprunte() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void Bonus_livre() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int Bonus_livre(int n) {
		return n;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewInscription() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bonus() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ControleurInscription() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Inscription() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Afficher_tout() {
		// TODO Auto-generated method stub
		
	}

}
