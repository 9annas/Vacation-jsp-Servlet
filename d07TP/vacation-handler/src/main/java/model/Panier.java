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
public class Panier {
    private int panier_id;
    private int user_id;
    private Date date_paiement;

    public Panier(int panier_id, int user_id, Date date_paiement) {
        this.panier_id = panier_id;
        this.user_id = user_id;
        this.date_paiement = date_paiement;
    }

    public int getPanier_id() {
        return panier_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public Date getDate_paiement() {
        return date_paiement;
    }

    public void setPanier_id(int panier_id) {
        this.panier_id = panier_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setDate_paiement(Date date_paiement) {
        this.date_paiement = date_paiement;
    }
    
}
