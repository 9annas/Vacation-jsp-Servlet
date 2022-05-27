/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author isi
 */
public class User {
    private int user_id;
    private String email;
    private String pwd;
    private String nom;
    private String prenom;
    private Date date_naissance;
    private Date date_creation;
    private String telephone;

    public User(int user_id, String email, String pwd, String nom, String prenom, Date date_naissance, Date date_creation, String telephone) {
        this.user_id = user_id;
        this.email = email;
        this.pwd = pwd;
        this.nom = nom;
        this.prenom = prenom;
        this.date_naissance = date_naissance;
        this.date_creation = date_creation;
        this.telephone = telephone;
    }
    public User(String email, String pwd, String nom, String prenom, Date date_naissance, Date date_creation, String telephone) {
        this.email = email;
        this.pwd = pwd;
        this.nom = nom;
        this.prenom = prenom;
        this.date_naissance = date_naissance;
        this.date_creation = date_creation;
        this.telephone = telephone;
    }

    public int getUser_id() {
        return user_id;
    }

    public String getEmail() {
        return email;
    }

    public String getMdp() {
        return pwd;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Date getDate_naissance() {
        return date_naissance;
    }

    public Date getDate_creation() {
        return date_creation;
    }

    public String getTelephone() {
        return telephone;
    }


    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMdp(String pwd) {
        this.pwd = pwd;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setDate_naissance(Date date_naissance) {
        this.date_naissance = date_naissance;
    }

    public void setDate_creation(Date date_creation) {
        this.date_creation = date_creation;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

}
