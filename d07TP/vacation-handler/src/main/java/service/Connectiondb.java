/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author isi
 */
public class Connectiondb {
    static String urlServeur = "jdbc:mariadb://localhost:3306/travels";
    static String identifiant = "root";
    static String motDePasse = "abc123...";
    static Connection connection = null;

    public static PreparedStatement getPs(String query) {
        PreparedStatement ps = null;
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            connection = DriverManager.getConnection(urlServeur, identifiant, motDePasse);
            ps = connection.prepareStatement(query);

        } catch (SQLException ex) {
            Logger.getLogger(Connectiondb.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Connectiondb.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ps;
    }

    //fermeture de la connexion
    public static void closeConnexion() {
        try {
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(Connectiondb.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
