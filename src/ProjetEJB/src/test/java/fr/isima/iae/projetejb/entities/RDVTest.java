/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.isima.iae.projetejb.entities;

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
public class RDVTest {
    
    public RDVTest() {
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
     * Test of getId method, of class RDV.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        RDV instance = new RDV();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class RDV.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        RDV instance = new RDV();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPatient method, of class RDV.
     */
    @Test
    public void testGetPatient() {
        System.out.println("getPatient");
        RDV instance = new RDV();
        Patient expResult = null;
        Patient result = instance.getPatient();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPatient method, of class RDV.
     */
    @Test
    public void testSetPatient() {
        System.out.println("setPatient");
        Patient patient = null;
        RDV instance = new RDV();
        instance.setPatient(patient);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCreneau method, of class RDV.
     */
    @Test
    public void testGetCreneau() {
        System.out.println("getCreneau");
        RDV instance = new RDV();
        Creneaux expResult = null;
        Creneaux result = instance.getCreneau();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCreneau method, of class RDV.
     */
    @Test
    public void testSetCreneau() {
        System.out.println("setCreneau");
        Creneaux creneau = null;
        RDV instance = new RDV();
        instance.setCreneau(creneau);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
