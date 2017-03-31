/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.isima.iae.projetejb.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author User
 */

@Entity
public class RDV {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    
    @ManyToOne
    @JoinColumn(name = "idPatient")
    private Patient patient;
    
    @OneToOne
    @JoinColumn(name = "idCreneau")
    private Creneaux creneau;

    public RDV() {
    }

    public RDV(Creneaux creneau, Patient patient) {
        this.creneau = creneau;
        this.patient = patient;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Patient getPatient() {
        return patient;
    }
    
    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    public Creneaux getCreneau() {
        return creneau;
    }

    public void setCreneau(Creneaux creneau) {
        this.creneau = creneau;
    }
}
