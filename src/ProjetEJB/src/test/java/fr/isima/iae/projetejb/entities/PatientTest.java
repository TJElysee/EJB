/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.isima.iae.projetejb.entities;

import java.util.Collection;
import junit.framework.TestCase;

/**
 *
 * @author Paul
 */
public class PatientTest extends TestCase {
    
    public PatientTest(String testName) {
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
     * Test of getId method, of class Patient.
     */
    public void testGetId() {
        System.out.println("getId");
        Patient instance = new Patient();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNom method, of class Patient.
     */
    public void testGetNom() {
        System.out.println("getNom");
        Patient instance = new Patient("Elysee", "Jonas");
        String expResult = "Elysee";
        String result = instance.getNom();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPrenom method, of class Patient.
     */
    public void testGetPrenom() {
        System.out.println("getPrenom");
        Patient instance = new Patient("Elysee", "Jonas");
        String expResult = "Jonas";
        String result = instance.getPrenom();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Patient.
     */
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Patient instance = new Patient();
        instance.setId(id);
    }

    /**
     * Test of setNom method, of class Patient.
     */
    public void testSetNom() {
        System.out.println("setNom");
        String nom = "";
        Patient instance = new Patient();
        instance.setNom(nom);
    }

    /**
     * Test of setPrenom method, of class Patient.
     */
    public void testSetPrenom() {
        System.out.println("setPrenom");
        String prenom = "";
        Patient instance = new Patient();
        instance.setPrenom(prenom);
    }

    /**
     * Test of getRdvs method, of class Patient.
     */
    public void testGetRdvs() {
        System.out.println("getRdvs");
        Patient instance = new Patient();
        Collection<RDV> expResult = null;
        Collection<RDV> result = instance.getRdvs();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRdvs method, of class Patient.
     */
    public void testSetRdvs() {
        System.out.println("setRdvs");
        Collection<RDV> rdvs = null;
        Patient instance = new Patient();
        instance.setRdvs(rdvs);
    }
    
}
