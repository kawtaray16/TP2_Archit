package TP2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UniversityRepository implements Universite{

	private int i_univ;
	private String nom;
	private TypePackage pack;
	
	

	
	
public Universite GetById(int universityId) throws SQLException {
		
		DBConnection BD= new DBConnection();
		Connection connect=BD.getConn(); 
		Statement stmt = connect.createStatement();
		System.out.println("LogBD : d�but recherche de id universit� dans la base de donn�e");
		
		String sql = "select * from universite where id_universite="+ universityId;
		ResultSet rs = stmt.executeQuery(sql);
		rs.next();	
		TypePackage p=TypePackage.valueOf(rs.getString(3));
		Universite u = new UniversityRepository (rs.getInt(1),rs.getString(2),p);
			
		System.out.println("LogBD : universit� r�cup�r�e");
		
		connect.close();
		return u;	
	
		
	}


@Override
public TypePackage getPack() {
	// TODO Auto-generated method stub
	return null;
}	

}
