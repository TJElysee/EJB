/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.isima.iae.projetejb.managers;

import fr.isima.iae.projetejb.entities.Creneaux;
import fr.isima.iae.projetejb.entities.Medecin;
import fr.isima.iae.projetejb.entities.Patient;
import fr.isima.iae.projetejb.entities.RDV;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author User
 */
@Stateless(name="rdvous")
public class RDVManagerImpl implements IRDVManager{

    @PersistenceContext(unitName = "fr.isima.iae_ProjetEJB_PU_CabinetMedical")
    private EntityManager em;
    

    @Override
    public List<RDV> getAllRDV() {
        Query q = em.createQuery("select r from RDV r");
        return q.getResultList();
    }

    @Override
    public int takeRDV(Date date, int idPatient, int idMedecin) {
        Query q = em.createQuery("select c from Creneaux c where c.debut = :d and c.medecin.id = :m");
        q.setParameter("d", date);
        q.setParameter("m", idMedecin);
        List<Creneaux> crens = q.getResultList();
        /*
        if(crens.isEmpty())
            throw new RuntimeException("Créneau inexistant");
        //*/
        
        if(!crens.isEmpty() && crens.get(0).getRdv()!= null){
            Patient p = em.find(Patient.class, idPatient);
            if(p != null){
                RDV rdv = new RDV(crens.get(0) ,p );
                crens.get(0).setRdv(rdv);
                
                em.persist(rdv);
                return rdv.getId();
            }
            
        }
        return -1;
    }

    @Override
    public void editRDV(int id, Date date) {
        
        RDV rdv = em.find(RDV.class, id);
        int medecinId = rdv.getCreneau().getMedecin().getId();
        
        Query q = em.createQuery("select c from Creneaux c where c.debut = :d and c.medecin.id = :m");
        q.setParameter("d", date);
        q.setParameter("m", medecinId );
        List<Creneaux> crens = q.getResultList();
        
        //il y a un creneau existant
        if(!crens.isEmpty()){
            Creneaux newCreneau = crens.get(0); 
            
            // le nouveau creneau est disponible
            if(newCreneau.getRdv()!= null){
                
                Query q2 = em.createQuery("select c from Creneaux c where c.debut = :d and c.medecin.id = :m");
                q2.setParameter("d", rdv.getCreneau().getDebut());
                q2.setParameter("m", medecinId );
                Creneaux oldCreneau = (Creneaux) q.getResultList().get(0);
                
                oldCreneau.setRdv(null);
                rdv.setCreneau(newCreneau);
                newCreneau.setRdv(rdv);
            }
                
        }
    }

    @Override
    public void cancelRDV(int id) {
        RDV rdv = em.find(RDV.class, id);
        
        int idCren = rdv.getCreneau().getId();
        Creneaux cren = em.find(Creneaux.class, idCren);
        cren.setRdv(null);
        
        em.remove(rdv);
    }
    
}
