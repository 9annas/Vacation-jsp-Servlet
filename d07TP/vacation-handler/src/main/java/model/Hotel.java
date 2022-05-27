/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author isi
 */
public class Hotel {
    private int hotel_id;
    private String nom_hotel;
    private String adresse;
    private int nb_etoiles;
    private double rating;
    private String telephone;
    private int ville_id;

    public Hotel(int hotel_id, String nom_hotel, String adresse, int nb_etoiles, double rating, String telephone, int ville_id) {
        this.hotel_id = hotel_id;
        this.nom_hotel = nom_hotel;
        this.adresse = adresse;
        this.nb_etoiles = nb_etoiles;
        this.rating = rating;
        this.telephone = telephone;
        this.ville_id = ville_id;
    }

    public int getHotel_id() {
        return hotel_id;
    }

    public String getNom_hotel() {
        return nom_hotel;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getNb_etoiles() {
        return nb_etoiles;
    }

    public double getRating() {
        return rating;
    }

    public String getTelephone() {
        return telephone;
    }

    public int getVille_id() {
        return ville_id;
    }

    public void setHotel_id(int hotel_id) {
        this.hotel_id = hotel_id;
    }

    public void setNom_hotel(String nom_hotel) {
        this.nom_hotel = nom_hotel;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setNb_etoiles(int nb_etoiles) {
        this.nb_etoiles = nb_etoiles;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setVille_id(int ville_id) {
        this.ville_id = ville_id;
    }
    
}
