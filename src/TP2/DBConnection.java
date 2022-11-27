package TP2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author ISSER TECH
 *
 */
public class DBConnection {


//String BDD = "tp2_archi";
	String url = "jdbc:mysql://localhost:3306/tp2_archi" ;
	String user = "root";
	String passwd = "";
    private Connection conn;

   
    public DBConnection() throws SQLException {
		conn=DriverManager.getConnection(url, user,passwd);
	}

    
    public Connection getConn() {
		return conn;
	}



}
