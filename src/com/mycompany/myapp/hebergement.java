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
public class hebergement {
    private int id_hebergement;
    private String adresse_hebergement;
    private String type_hebergement;
    private String description;
    private float prix_hebergement;
    private int disponibilite;
    private String utilisateurs;

    public hebergement() {
    }

    public hebergement(int id_hebergement, String adresse_hebergement, String type_hebergement, String description, float prix_hebergement, int disponibilite, String utilisateurs) {
        this.id_hebergement = id_hebergement;
        this.adresse_hebergement = adresse_hebergement;
        this.type_hebergement = type_hebergement;
        this.description = description;
        this.prix_hebergement = prix_hebergement;
        this.disponibilite = disponibilite;
        this.utilisateurs = utilisateurs;
    }
     public hebergement(String adresse_hebergement) {
      
        this.adresse_hebergement = adresse_hebergement;
   
    }

    public int getId_hebergement() {
        return id_hebergement;
    }

    public void setId_hebergement(int id_hebergement) {
        this.id_hebergement = id_hebergement;
    }

    public String getAdresse_hebergement() {
        return adresse_hebergement;
    }

    public void setAdresse_hebergement(String adresse_hebergement) {
        this.adresse_hebergement = adresse_hebergement;
    }

    public String getType_hebergement() {
        return type_hebergement;
    }

    public void setType_hebergement(String type_hebergement) {
        this.type_hebergement = type_hebergement;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrix_hebergement() {
        return prix_hebergement;
    }

    public void setPrix_hebergement(float prix_hebergement) {
        this.prix_hebergement = prix_hebergement;
    }

    public int getDisponibilite() {
        return disponibilite;
    }

    public void setDisponibilite(int disponibilite) {
        this.disponibilite = disponibilite;
    }

    public String getUtilisateurs() {
        return utilisateurs;
    }

    public void setUtilisateurs(String utilisateurs) {
        this.utilisateurs = utilisateurs;
    }

    @Override
    public String toString() {
        return "hebergement{" + "id_hebergement=" + id_hebergement + ", adresse_hebergement=" + adresse_hebergement + ", type_hebergement=" + type_hebergement + ", description=" + description + ", prix_hebergement=" + prix_hebergement + ", disponibilite=" + disponibilite + ", utilisateurs=" + utilisateurs + '}';
    }
    
    
    
}
