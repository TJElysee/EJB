/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.isima.iae.projetejb.managers;

import fr.isima.iae.projetejb.entities.Patient;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author User
 */

@Stateless(name = "Pat")
public class PatientManagerImpl implements IPatientManager {

    @PersistenceContext(unitName = "fr.isima.iae_ProjetEJB_PU_CabinetMedical")
    //@PersistenceContext
    private EntityManager em;
    
    @Override
    public List<Patient> getAllPatients() {
        Query q = em.createQuery("select p from Patient p");
        return q.getResultList(); 
    }

    @Override
    public int addPatient(Patient patient) {
        em.persist(patient);
        return patient.getId();
    }

    @Override
    public Patient getPatient(int id) {
        Patient p = em.find(Patient.class, id);
        /*
        if(m == null)
            throw new RuntimeException("Patient introuvable");
        //*/
        return p;
    }

    @Override
    public Patient updatePatient(int id, Patient patient) {
        Patient p = em.find(Patient.class, patient);
        if(p != null){
            p.setNom(patient.getNom());
            p.setPrenom(patient.getPrenom());
            p.setRdvs(patient.getRdvs());
        }
        
        return p;
    }

    @Override
    public void deletePatient(int id) {
         Patient p = em.find(Patient.class, id);
        em.remove(p);
    }
    
}
