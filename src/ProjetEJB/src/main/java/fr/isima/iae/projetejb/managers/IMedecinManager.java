/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.isima.iae.projetejb.managers;

import fr.isima.iae.projetejb.entities.Medecin;
import java.util.List;

/**
 *
 * @author User
 */
public interface IMedecinManager {
    
    public List<Medecin> getAllMedecins();
    
    public int addMedecin(Medecin medecin);    
    public Medecin getMedecin(int id);
    public Medecin updateMedecin(int id, Medecin medecin);
    public void deleteMedecin(int id);
}
