/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.isima.iae.projetejb.entities;

import junit.framework.TestCase;

/**
 *
 * @author Paul
 */
public class RDVTest extends TestCase {
    
    public RDVTest(String testName) {
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
     * Test of getId method, of class RDV.
     */
    public void testGetId() {
        System.out.println("getId");
        RDV instance = new RDV();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class RDV.
     */
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        RDV instance = new RDV();
        instance.setId(id);
    }

    /**
     * Test of getPatient method, of class RDV.
     */
    public void testGetPatient() {
        System.out.println("getPatient");
        RDV instance = new RDV();
        Patient expResult = null;
        Patient result = instance.getPatient();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPatient method, of class RDV.
     */
    public void testSetPatient() {
        System.out.println("setPatient");
        Patient patient = null;
        RDV instance = new RDV();
        instance.setPatient(patient);
    }

    /**
     * Test of getCreneau method, of class RDV.
     */
    public void testGetCreneau() {
        System.out.println("getCreneau");
        RDV instance = new RDV();
        Creneaux expResult = null;
        Creneaux result = instance.getCreneau();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCreneau method, of class RDV.
     */
    public void testSetCreneau() {
        System.out.println("setCreneau");
        Creneaux creneau = null;
        RDV instance = new RDV();
        instance.setCreneau(creneau);
    }
    
}
