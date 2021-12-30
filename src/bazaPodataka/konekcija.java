/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bazaPodataka;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Džejlana Ščulić
 */
public class konekcija {
 private static final String korisnik = "root";
    private static final String sifra = "u264ba";
    private static final String kon = "jdbc:mysql://localhost:3306/utrka?serverTimezone=UTC&useSSL=false";
    public Connection veza = null;
    
    public konekcija() throws SQLException, ClassNotFoundException{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            veza = DriverManager.getConnection(kon,korisnik,sifra);
            System.out.println("Konekcija uspješna!");
        }
        catch(SQLException e){
            System.err.println(e);
        }
    }
    
    public void unosVozila(String marka, String tip, String gorivo, String broj) throws SQLException{
        Statement upitBaza = (Statement) veza.createStatement();
        String upit = "INSERT INTO vozilo (marka,tip,gorivo,broj) VALUES ('"+marka+"','"+tip+"','"+gorivo+"','"+broj+"')";
        try{
            upitBaza.executeUpdate(upit);
        }
        catch(SQLException e){
            System.err.println(e);
        }
    }
    
    public void unosVozaca(String ime, String prezime, String godiste, int idVozilo) throws SQLException{
        Statement upitBaza = (Statement) veza.createStatement();
        String upit = "INSERT INTO vozac (ime, prezime ,godiste, idVozilo) VALUES ('"+ime+"','"+prezime+"','"+godiste+"','"+idVozilo+"')";
        try{
            upitBaza.executeUpdate(upit);
        }
        catch(SQLException e){
            System.err.println(e);
        }
    }
    
    public ResultSet ispisVozilo() throws SQLException{
        Statement upitBaza = (Statement) veza.createStatement();
        ResultSet rezultat = null;
        try{
            rezultat = upitBaza.executeQuery("Select * from vozilo");
            return rezultat;
        }
        catch(SQLException e){
            System.err.println(e);
        }
        return rezultat;
    }
    
    public ResultSet ispisVozac() throws SQLException{
        Statement upitBaza = (Statement) veza.createStatement();
        ResultSet rezultat = null;
        try{
            rezultat = upitBaza.executeQuery("Select * from vozac");
            return rezultat;
        }
        catch(SQLException e){
            System.err.println(e);
        }
        return rezultat;
    }
      
    public ResultSet ispisVozaca() throws SQLException{
        Statement upitBaza = (Statement) veza.createStatement();
        ResultSet rezultat = null;
        try{
            rezultat = upitBaza.executeQuery("Select godiste, ime, prezime, marka from vozilo inner join vozac on vozac.idVozilo = vozilo.id order by godiste");
            return rezultat;
        }
        catch(SQLException e){
            System.err.println(e);
        }
        return rezultat;
    }
    
    public ResultSet pretragaVozac(String godiste, String ime, String prezime) throws SQLException{
        Statement upitBaza = (Statement) veza.createStatement();
        ResultSet rezultat = null;
        try{
            rezultat = upitBaza.executeQuery("Select godiste, ime, prezime, marka from vozilo inner join vozac on vozac.idVozilo = vozilo.id where godiste ='"+godiste+"' or ime ='"+ime+"' or prezime ='"+prezime+"'");
            return rezultat;
        }
        catch(SQLException e){
            System.err.println(e);
        }
        return rezultat;
    }
}
