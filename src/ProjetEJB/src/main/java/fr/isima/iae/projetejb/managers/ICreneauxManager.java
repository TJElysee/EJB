/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.isima.iae.projetejb.managers;

import fr.isima.iae.projetejb.entities.Creneaux;
import java.util.Date;
import java.util.List;

/**
 *
 * @author User
 */
public interface ICreneauxManager {
    public List<Creneaux> getAllCreneaux();
    public List<Creneaux> getAllFreeCreneaux();
    public int addCreneau(Date debut, Date fin, int idMedecin);
    public void removeCreneau(int id); 
}
