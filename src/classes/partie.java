/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.Serializable;

/**
 *
 * @author oden
 */
public class partie implements Serializable{
    private static int id_partie = 0;
    private String nom_partie;
    private int combinaison;
    private boolean resolut;

    public partie() {
    }

    public partie(String nom_partie, int combinaison) {
        id_partie++;
        this.nom_partie = nom_partie;
        this.combinaison = combinaison;
        resolut = false;
        
    }

    public static int getId_partie() {
        return id_partie;
    }

    public static void setId_partie(int id_partie) {
        partie.id_partie = id_partie;
    }

    public String getNom_partie() {
        return nom_partie;
    }

    public void setNom_partie(String nom_partie) {
        this.nom_partie = nom_partie;
    }

    public int getCombinaison() {
        return combinaison;
    }

    public void setCombinaison(int combinaison) {
        this.combinaison = combinaison;
    }

    public boolean isResolut() {
        return resolut;
    }

    public void setResolut(boolean resolut) {
        this.resolut = resolut;
    }

    public void incrementTries() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getNumberOfTries() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getPlayerId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
