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

/**
 *
 * @author User
 */

@Entity
public class RDV {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private Date debut;
    
    private Date fin;
    
    @ManyToOne
    @JoinColumn(name = "idPatient")
    private Patient patient;
    
    @ManyToOne
    @JoinColumn(name = "idCreneau")
    private Creneaux creneau;

    public RDV() {
    }

    public RDV(Date debut, Date fin, Patient patient) {
        this.debut = debut;
        this.fin = fin;
        this.patient = patient;
    }
    
    public int getId() {
        return id;
    }

    public Date getDebut() {
        return debut;
    }

    public Date getFin() {
        return fin;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDebut(Date debut) {
        this.debut = debut;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }    

    public Patient getPatient() {
        return patient;
    }
}
