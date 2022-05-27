/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author isi
 */
public class Pays {
    private int pays_id;
    private String nom_pays;

    public Pays() {
    }

    public Pays(int pays_id, String nom_pays) {
        this.pays_id = pays_id;
        this.nom_pays = nom_pays;
    }

    public int getPays_id() {
        return pays_id;
    }

    public String getNom_pays() {
        return nom_pays;
    }

    public void setPays_id(int pays_id) {
        this.pays_id = pays_id;
    }

    public void setNom_pays(String nom_pays) {
        this.nom_pays = nom_pays;
    }
    
    
}
