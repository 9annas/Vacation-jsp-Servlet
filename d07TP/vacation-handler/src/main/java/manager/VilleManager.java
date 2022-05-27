/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Pays;
import model.Ville;
import service.Connectiondb;

/**
 *
 * @author isi
 */
public class VilleManager {
    public static Ville getByid(int id){
        Ville ville = null;
        try {
            String query = "select * from villes where ville_id = ?";
            // to change depending on the DB
            PreparedStatement ps = Connectiondb.getPs(query);
            ps.setInt(1, id);
            ResultSet result = ps.executeQuery();            
            if (result.next()) {
                ville = new Ville();
                ville.setVille_id(result.getInt("ville_id"));
                ville.setNom_ville(result.getString("nom"));
                ville.setPays_id(result.getInt("pays_id"));
            }
            Connectiondb.closeConnexion();
            
        } catch (SQLException ex) {
            Logger.getLogger(DestinationManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ville;
    }
}
