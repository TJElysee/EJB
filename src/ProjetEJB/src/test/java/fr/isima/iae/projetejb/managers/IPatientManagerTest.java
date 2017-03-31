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
public class IPatientManagerTest extends TestCase {
    
    public IPatientManagerTest(String testName) {
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
     * Test of getAllPatients method, of class IPatientManager.
     */
    public void testGetAllPatients() {
        System.out.println("getAllPatients");
        IPatientManager instance = new IPatientManagerImpl();
        List<Patient> expResult = null;
        List<Patient> result = instance.getAllPatients();
        assertEquals(expResult, result);
    }

    /**
     * Test of addPatient method, of class IPatientManager.
     */
    public void testAddPatient() {
        System.out.println("addPatient");
        Patient patient = null;
        IPatientManager instance = new IPatientManagerImpl();
        int expResult = 0;
        int result = instance.addPatient(patient);
        assertEquals(expResult, result);
    }

    /**
     * Test of getPatient method, of class IPatientManager.
     */
    public void testGetPatient() {
        System.out.println("getPatient");
        int id = 0;
        IPatientManager instance = new IPatientManagerImpl();
        Patient expResult = null;
        Patient result = instance.getPatient(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of updatePatient method, of class IPatientManager.
     */
    public void testUpdatePatient() {
        System.out.println("updatePatient");
        int id = 0;
        Patient patient = null;
        IPatientManager instance = new IPatientManagerImpl();
        Patient expResult = null;
        Patient result = instance.updatePatient(id, patient);
        assertEquals(expResult, result);
    }

    /**
     * Test of deletePatient method, of class IPatientManager.
     */
    public void testDeletePatient() {
        System.out.println("deletePatient");
        int id = 0;
        IPatientManager instance = new IPatientManagerImpl();
        instance.deletePatient(id);
    }

    public class IPatientManagerImpl implements IPatientManager {

        public List<Patient> getAllPatients() {
            return null;
        }

        public int addPatient(Patient patient) {
            return 0;
        }

        public Patient getPatient(int id) {
            return null;
        }

        public Patient updatePatient(int id, Patient patient) {
            return null;
        }

        public void deletePatient(int id) {
        }
    }
    
}
