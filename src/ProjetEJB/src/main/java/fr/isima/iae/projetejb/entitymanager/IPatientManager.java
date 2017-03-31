/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.isima.iae.projetejb.entitymanager;

import fr.isima.iae.projetejb.entities.Patient;
import java.util.List;

/**
 *
 * @author User
 */
public interface IPatientManager {
    public List<Patient> getAllPatients();
    
    public int addPatient(Patient patient);    
    public Patient getPatient(int id);
    public Patient updatePatient(int id, Patient patient);
    public void deletePatient(int id);
}
