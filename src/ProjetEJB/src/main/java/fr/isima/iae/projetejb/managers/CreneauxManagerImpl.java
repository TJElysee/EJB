/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.isima.iae.projetejb.managers;

import fr.isima.iae.projetejb.entities.Creneaux;
import fr.isima.iae.projetejb.entities.Medecin;
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
@Stateless(name="Crens")
public class CreneauxManagerImpl implements ICreneauxManager {
    @PersistenceContext(unitName = "fr.isima.iae_ProjetEJB_PU_CabinetMedical")
    private EntityManager em;
    
    @Override
    public List<Creneaux> getAllCreneaux() {
        Query q = em.createQuery("select c from Creneaux c");
        return q.getResultList();
    }
    
    @Override
    public List<Creneaux> getAllFreeCreneaux(){
        List<Creneaux> crens = getAllCreneaux();
        List<Creneaux> res = null; 
        if(!crens.isEmpty()){
            res = new ArrayList<>();
        
            for( Creneaux cren : crens){
                if(cren.getRdv() != null) {
                } else {
                    res.add(cren);
                }
            }
        }
        return res;
    }

    @Override
    public int addCreneau(Date debut, Date fin, int idMedecin) {
        Medecin med = em.find(Medecin.class, idMedecin);
        Creneaux cren = null;
        cren = new Creneaux(debut, fin, med);
        
        em.persist(cren);
        /*
        if( m == null)
            throw new RuntimeException("Médecin inexistant");
        //*/

        return cren.getId();
        
    }

    @Override
    public void removeCreneau(int id) {
        Creneaux creneau = em.find(Creneaux.class, id);
        em.remove(creneau);
    }
}
