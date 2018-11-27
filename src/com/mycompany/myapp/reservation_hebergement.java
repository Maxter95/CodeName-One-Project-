/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myapp;

/**
 *
 * @author Maxter
 */
public class reservation_hebergement {
    private int id_res_h;
    private int idHebergement;
    private String nom_utilisateur_h;
    private int nbr_nuit_h  ;

    public reservation_hebergement() {
    }

    public reservation_hebergement(int id_res_h, int idHebergement, String nom_utilisateur_h, int nbr_nuit_h) {
        this.id_res_h = id_res_h;
        this.idHebergement = idHebergement;
        this.nom_utilisateur_h = nom_utilisateur_h;
        this.nbr_nuit_h = nbr_nuit_h;
    }

    public int getId_res_h() {
        return id_res_h;
    }

    public void setId_res_h(int id_res_h) {
        this.id_res_h = id_res_h;
    }

    public int getIdHebergement() {
        return idHebergement;
    }

    public void setIdHebergement(int idHebergement) {
        this.idHebergement = idHebergement;
    }

    public String getNom_utilisateur_h() {
        return nom_utilisateur_h;
    }

    public void setNom_utilisateur_h(String nom_utilisateur_h) {
        this.nom_utilisateur_h = nom_utilisateur_h;
    }

    public int getNbr_nuit_h() {
        return nbr_nuit_h;
    }

    public void setNbr_nuit_h(int nbr_nuit_h) {
        this.nbr_nuit_h = nbr_nuit_h;
    }

    @Override
    public String toString() {
        return "reservation_hebergement{" + "id_res_h=" + id_res_h + ", idHebergement=" + idHebergement + ", nom_utilisateur_h=" + nom_utilisateur_h + ", nbr_nuit_h=" + nbr_nuit_h + '}';
    }
    
    
    
}
