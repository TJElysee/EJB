/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.isima.iae.projetejb.managers;

import fr.isima.iae.projetejb.entities.Patient;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Paul
 */
public class PatientManagerImplTest {
    
    public PatientManagerImplTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAllPatients method, of class PatientManagerImpl.
     */
    @org.junit.Test
    public void testGetAllPatients() throws Exception {
        System.out.println("getAllPatients");
        PatientManagerImpl instance = new PatientManagerImpl();
        List<Patient> expResult = null;
        List<Patient> result = instance.getAllPatients();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addPatient method, of class PatientManagerImpl.
     */
    @org.junit.Test
    public void testAddPatient() throws Exception {
        System.out.println("addPatient");
        Patient patient = null;
        PatientManagerImpl instance = new PatientManagerImpl();
        int expResult = 0;
        int result = instance.addPatient(patient);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPatient method, of class PatientManagerImpl.
     */
    @org.junit.Test
    public void testGetPatient() throws Exception {
        System.out.println("getPatient");
        int id = 0;
        PatientManagerImpl instance = new PatientManagerImpl();
        Patient expResult = null;
        Patient result = instance.getPatient(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updatePatient method, of class PatientManagerImpl.
     */
    @org.junit.Test
    public void testUpdatePatient() throws Exception {
        System.out.println("updatePatient");
        int id = 0;
        Patient patient = null;
        PatientManagerImpl instance = new PatientManagerImpl();
        Patient expResult = null;
        Patient result = instance.updatePatient(id, patient);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deletePatient method, of class PatientManagerImpl.
     */
    @org.junit.Test
    public void testDeletePatient() throws Exception {
        System.out.println("deletePatient");
        int id = 0;
        PatientManagerImpl instance = new PatientManagerImpl();
        instance.deletePatient(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
