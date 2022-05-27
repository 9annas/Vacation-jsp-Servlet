/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author isi
 */
public class Ville {
    private int ville_id;
    private String nom_ville;
    private int pays_id;
    private Pays pays;

    public Ville() {
    }

    public Ville(int ville_id, String nom_ville, int pays_id, Pays pays) {
        this.ville_id = ville_id;
        this.nom_ville = nom_ville;
        this.pays_id = pays_id;
        this.pays = pays;
    }

    public int getVille_id() {
        return ville_id;
    }

    public String getNom_ville() {
        return nom_ville;
    }

    public int getPays_id() {
        return pays_id;
    }

    public void setVille_id(int ville_id) {
        this.ville_id = ville_id;
    }

    public void setNom_ville(String nom_ville) {
        this.nom_ville = nom_ville;
    }

    public void setPays_id(int pays_id) {
        this.pays_id = pays_id;
    }

    public Pays getPays() {
        return pays;
    }

    public void setPays(Pays pays) {
        this.pays = pays;
    }
    
}
