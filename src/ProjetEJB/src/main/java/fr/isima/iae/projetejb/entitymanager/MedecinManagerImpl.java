/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.isima.iae.projetejb.entitymanager;

import fr.isima.iae.projetejb.entities.Medecin;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author User
 */
public class MedecinManagerImpl implements IMedecinManager{

    @PersistenceContext(unitName = "UP")
    private EntityManager em;
    
    @Override
    public List<Medecin> getAllMedecins() {
        Query q = em.createQuery("select m from Medecin");
        return q.getResultList(); 
    }

    @Override
    public int addMedecin(Medecin medecin) {
        em.persist(medecin);
        return medecin.getId();
    }

    @Override
    public Medecin getMedecin(int id) {
        Medecin m = em.find(Medecin.class, id);
        /*
        if(m == null)
            throw new RuntimeException("Médecin introuvable");
        //*/
        return m;
    }

    @Override
    public Medecin updateMedecin(int id, Medecin medecin) {
        Medecin m = em.find(Medecin.class, id);
        if(m != null){
            m.setNom(medecin.getNom());
            m.setPrenom(medecin.getPrenom());
            m.setCrenaux( medecin.getCrenaux());
        }
        
        return m;
    }

    @Override
    public void deleteMedecin(int id) {
        Medecin m = em.find(Medecin.class, id);
        em.remove(m);
    }
    
}
