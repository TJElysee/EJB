/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.isima.iae.projetejb.managers;

import fr.isima.iae.projetejb.entities.Patient;
import java.util.List;
import junit.framework.TestCase;

/**
 *
 * @author Paul
 */
public class PatientManagerImplTest extends TestCase {
    
    public PatientManagerImplTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of getAllPatients method, of class PatientManagerImpl.
     */
    public void testGetAllPatients() throws Exception {
        System.out.println("getAllPatients");
        PatientManagerImpl instance = new PatientManagerImpl();
        List<Patient> expResult = null;
        List<Patient> result = instance.getAllPatients();
        assertEquals(expResult, result);
    }

    /**
     * Test of addPatient method, of class PatientManagerImpl.
     */
    public void testAddPatient() throws Exception {
        System.out.println("addPatient");
        Patient patient = null;
        PatientManagerImpl instance = new PatientManagerImpl();
        int expResult = 0;
        int result = instance.addPatient(patient);
        assertEquals(expResult, result);
    }

    /**
     * Test of getPatient method, of class PatientManagerImpl.
     */
    public void testGetPatient() throws Exception {
        System.out.println("getPatient");
        int id = 0;
        PatientManagerImpl instance = new PatientManagerImpl();
        Patient expResult = null;
        Patient result = instance.getPatient(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of updatePatient method, of class PatientManagerImpl.
     */
    public void testUpdatePatient() throws Exception {
        System.out.println("updatePatient");
        int id = 0;
        Patient patient = null;
        PatientManagerImpl instance = new PatientManagerImpl();
        Patient expResult = null;
        Patient result = instance.updatePatient(id, patient);
        assertEquals(expResult, result);
    }

    /**
     * Test of deletePatient method, of class PatientManagerImpl.
     */
    public void testDeletePatient() throws Exception {
        System.out.println("deletePatient");
        int id = 0;
        PatientManagerImpl instance = new PatientManagerImpl();
        instance.deletePatient(id);
    }
    
}
