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
import model.Destination;
import model.Pays;
import service.Connectiondb;

/**
 *
 * @author isi
 */
public class PaysManager {
    public static Pays getByid(int id){
        Pays pays = null;
        try {
            String query = "select * from pays where pays_id = ?";
            // to change depending on the DB
            PreparedStatement ps = Connectiondb.getPs(query);
            ps.setInt(1, id);
            ResultSet result = ps.executeQuery();            
            if (result.next()) {
                pays = new Pays();
                pays.setPays_id(result.getInt("pays_id"));
                pays.setNom_pays(result.getString("nom"));
            }
            Connectiondb.closeConnexion();
            
        } catch (SQLException ex) {
            Logger.getLogger(DestinationManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pays;
    }
}
