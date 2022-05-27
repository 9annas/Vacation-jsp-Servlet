/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.*;
import service.Connectiondb;

/**
 *
 * @author isi
 */
public class DestinationManager {
    
    public static ArrayList<Destination> getByTypeImage(int type) {
        ArrayList<Destination> destinations = new ArrayList<>();
        PreparedStatement requete = Connectiondb.getPs("select * from destinations where typeImage = ?");
        
        try {
            requete.setInt(1, type);
            ResultSet rs = requete.executeQuery();
            while (rs.next()) {
                Destination destination = new Destination();
                destination.setDestination_id(rs.getInt("destination_id"));
                destination.setNom(rs.getString("nom"));
                destination.setAdresse(rs.getString("adresse"));
                destination.setCout(rs.getDouble("cout"));
                destination.setDescription(rs.getString("description"));
                destination.setRating(rs.getDouble("rating"));
                destination.setVille_id(rs.getInt("ville_id"));
                
                destination.setCategorie_id(rs.getInt("categorie"));
                destination.setNomImage(rs.getString("nomImage"));
                destination.setTypeImageId(rs.getInt("typeImage"));
                destinations.add(destination);
            }
            Connectiondb.closeConnexion();
        } catch (SQLException ex) {
            Logger.getLogger(DestinationManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return destinations;
    }
    
    public static Destination getByid(int id) {
        Destination destination = null;
        try {
            String query = "select * from destinations as d inner join villes as v on d.ville_id = v.ville_id where destination_id = ?";
            // to change depending on the DB
            PreparedStatement ps = Connectiondb.getPs(query);
            ps.setInt(1, id);
            ResultSet result = ps.executeQuery();            
            if (result.next()) {
                destination = new Destination();
                Pays pays = PaysManager.getByid(result.getInt("pays_id"));
                Ville ville = VilleManager.getByid(result.getInt("ville_id"));
                ville.setPays(pays);
                ville.setVille_id(result.getInt("ville_id"));
                destination.setDestination_id(result.getInt("destination_id"));
                destination.setNom(result.getString("nom"));
                destination.setAdresse(result.getString("adresse"));
                destination.setCout(result.getInt("cout"));
                destination.setDescription(result.getString("description"));
                destination.setRating(result.getInt("rating"));
                destination.setVille_id(result.getInt("ville_id"));
                destination.setCategorie_id(result.getInt("categorie"));
                destination.setVille(ville);
                destination.setNomImage(result.getString("nomImage"));
                destination.setTypeImageId(result.getInt("typeImage"));
            }
            Connectiondb.closeConnexion();
            
        } catch (SQLException ex) {
            Logger.getLogger(DestinationManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return destination;
    }
    
    public static ArrayList<Destination> getByCategorie(int cat) {
        ArrayList<Destination> destinations = new ArrayList<Destination>();
        try {
            String query = "select * from destinations where categorie = ?";
            // to change depending on the DB
            PreparedStatement ps = Connectiondb.getPs(query);
            ps.setInt(1, cat);
            ResultSet result = ps.executeQuery();            
            while (result.next()) {
                Destination destination = new Destination();
                destination.setDestination_id(result.getInt("destination_id"));
                destination.setNom(result.getString("nom"));
                destination.setAdresse(result.getString("adresse"));
                destination.setCout(result.getInt("cout"));
                destination.setDescription(result.getString("description"));
                destination.setRating(result.getInt("rating"));
                destination.setVille_id(result.getInt("ville_id"));
                destination.setCategorie_id(result.getInt("categorie"));
                destinations.add(destination);
            }
            Connectiondb.closeConnexion();
            
        } catch (SQLException ex) {
            Logger.getLogger(DestinationManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return destinations;
    }

    public static ArrayList<Destination> getAll() {
        ArrayList<Destination> destinations = new ArrayList<Destination>();
        try {
            
            String query = "select * from destinations";
            PreparedStatement ps = Connectiondb.getPs(query);
            ResultSet result = ps.executeQuery();            
            while (result.next()) {
                Destination destination = new Destination();
                destination.setDestination_id(result.getInt("destination_id"));
                destination.setNom(result.getString("nom"));
                destination.setAdresse(result.getString("adresse"));
                destination.setCout(result.getInt("cout"));
                destination.setDescription(result.getString("description"));
                destination.setRating(result.getInt("rating"));
                destination.setVille_id(result.getInt("ville_id"));
                destination.setCategorie_id(result.getInt("categorie"));
                destinations.add(destination);
            }
            Connectiondb.closeConnexion();
            
        } catch (SQLException ex) {
            Logger.getLogger(DestinationManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return destinations;
    }

    public static ArrayList<Destination> getByName(String name) {
        ArrayList<Destination> destinations = new ArrayList<Destination>();
        try {
            // to change depending on the DB
            String query = "select * from Reservation where destination_name LIKE '?'";
            PreparedStatement ps = Connectiondb.getPs(query);
            ps.setString(1, name);
            ResultSet result = ps.executeQuery();            
            while (result.next()) {
                Destination destination = new Destination();
                destination.setDestination_id(result.getInt("destination_id"));
                destination.setNom(result.getString("nom"));
                destination.setAdresse(result.getString("adresse"));
                destination.setCout(result.getInt("cout"));
                destination.setDescription(result.getString("description"));
                destination.setRating(result.getInt("rating"));
                destination.setVille_id(result.getInt("ville_id"));
                destination.setCategorie_id(result.getInt("categorie_id"));
                destinations.add(destination);
            }
            Connectiondb.closeConnexion();
            
        } catch (SQLException ex) {
            Logger.getLogger(DestinationManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return destinations;
    }
}
