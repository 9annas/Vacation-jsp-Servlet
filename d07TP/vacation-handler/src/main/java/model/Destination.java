/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author isi
 */
public class Destination {
    private int destination_id;
    private String nom;
    private String adresse;
    private double cout;
    private String description;
    private double rating;
    private int ville_id;
    private Ville ville;
    private int categorie_id;
    private String nomImage;
    private int typeImageId;
    private TypeImage typeImage;

    public Destination() {
    }

    public Destination(int destination_id, String nom, String adresse, double cout, String description, int rating, int ville_id, int categorie_id) {
        this.destination_id = destination_id;
        this.nom = nom;
        this.adresse = adresse;
        this.cout = cout;
        this.description = description;
        this.rating = rating;
        this.ville_id = ville_id;
        this.categorie_id = categorie_id;
    }

    /***
     * 
     * @param destination_id
     * @param nom
     * @param adresse
     * @param cout
     * @param description
     * @param rating
     * @param ville_id
     * @param categorie_id
     * @param nomImage
     * @param typeImageId
     * @param typeImage 
     * nom image et type image ajoutes par jeetic
     */
    public Destination(int destination_id, String nom, String adresse, double cout, String description, int rating, int ville_id, Ville ville, int categorie_id, String nomImage, int typeImageId, TypeImage typeImage) {
        this.destination_id = destination_id;
        this.nom = nom;
        this.adresse = adresse;
        this.cout = cout;
        this.description = description;
        this.rating = rating;
        this.ville_id = ville_id;
        this.ville = ville;
        this.categorie_id = categorie_id;
        this.nomImage = nomImage;
        this.typeImageId = typeImageId;
        this.typeImage = typeImage;
    }

    public int getDestination_id() {
        return destination_id;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public double getCout() {
        return cout;
    }

    public String getDescription() {
        return description;
    }

    public double getRating() {
        return rating;
    }

    public int getVille_id() {
        return ville_id;
    }

    public int getCategorie_id() {
        return categorie_id;
    }

    public void setDestination_id(int destination_id) {
        this.destination_id = destination_id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setCout(double cout) {
        this.cout = cout;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setVille_id(int ville_id) {
        this.ville_id = ville_id;
    }

    public Ville getVille() {
        return ville;
    }

    public void setVille(Ville ville) {
        this.ville = ville;
    }

    public void setCategorie_id(int categorie_id) {
        this.categorie_id = categorie_id;
    } 

    public String getNomImage() {
        return nomImage;
    }

    public void setNomImage(String nomImage) {
        this.nomImage = nomImage;
    }

    public int getTypeImageId() {
        return typeImageId;
    }

    public void setTypeImageId(int typeImageId) {
        this.typeImageId = typeImageId;
    }

    public TypeImage getTypeImage() {
        return typeImage;
    }

    public void setTypeImage(TypeImage typeImage) {
        this.typeImage = typeImage;
    }
}
