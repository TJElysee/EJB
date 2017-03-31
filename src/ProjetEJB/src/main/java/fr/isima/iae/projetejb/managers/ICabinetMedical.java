/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.isima.iae.projetejb.managers;

import fr.isima.iae.projetejb.entities.Creneaux;
import fr.isima.iae.projetejb.entities.RDV;
import java.util.Date;
import java.util.List;

/**
 *
 * @author User
 */
public interface ICabinetMedical {
    public List<Creneaux> getAllCreneaux();
    public void addCreneau(Date debut, Date fin, int idMedecin);
    public void removeCreneau(int id);
    
    public List<RDV> getAllRDV();
    public void takeRDV(Date d, int idPatient, int idMedecin);
    public void editRDV(int id, Date newDate);
    public void cancelRDV(int id);
    
}
