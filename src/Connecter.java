
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dell
 */
public class Connecter {
     Connection con;
    public Connecter(){
    try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    }catch(ClassNotFoundException e){
    System.err.println(e);
//pour afficher l erreur
    }
    try{
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emploidutemps_db","root","root");
    }catch(SQLException e){System.err.println(e);}
    }
    Connection obtenirconnexion(){return con;}
    
}
