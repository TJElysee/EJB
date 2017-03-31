/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.isima.iae.projetejb.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author User
 */
@Entity
public class Patient implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String nom;
    
    private String prenom;   

    @OneToMany(mappedBy="patient",fetch=FetchType.LAZY)
    private transient Collection<RDV> rdvs;
    
    public Patient() {
    }
    public Patient(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
    
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    
    public Collection<RDV> getRdvs() {
        return rdvs;
    }
    
    public void setRdvs(Collection<RDV> rdvs) {
        this.rdvs = rdvs;
    }
}
