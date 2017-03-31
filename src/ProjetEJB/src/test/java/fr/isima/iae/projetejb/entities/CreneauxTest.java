/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.isima.iae.projetejb.entities;

import java.util.Date;
import junit.framework.TestCase;

/**
 *
 * @author Paul
 */
public class CreneauxTest extends TestCase {
    
    public CreneauxTest(String testName) {
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
     * Test of getId method, of class Creneaux.
     */
    public void testGetId() {
        System.out.println("getId");
        Creneaux instance = new Creneaux();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDebut method, of class Creneaux.
     */
    public void testGetDebut() {
        System.out.println("getDebut");
        Creneaux instance = new Creneaux();
        Date expResult = null;
        Date result = instance.getDebut();
        assertEquals(expResult, result);
    }

    /**
     * Test of getFin method, of class Creneaux.
     */
    public void testGetFin() {
        System.out.println("getFin");
        Creneaux instance = new Creneaux();
        Date expResult = null;
        Date result = instance.getFin();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMedecin method, of class Creneaux.
     */
    public void testGetMedecin() {
        System.out.println("getMedecin");
        Creneaux instance = new Creneaux();
        Medecin expResult = null;
        Medecin result = instance.getMedecin();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Creneaux.
     */
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Creneaux instance = new Creneaux();
        instance.setId(id);
    }

    /**
     * Test of setDebut method, of class Creneaux.
     */
    public void testSetDebut() {
        System.out.println("setDebut");
        Date debut = null;
        Creneaux instance = new Creneaux();
        instance.setDebut(debut);
    }

    /**
     * Test of setFin method, of class Creneaux.
     */
    public void testSetFin() {
        System.out.println("setFin");
        Date fin = null;
        Creneaux instance = new Creneaux();
        instance.setFin(fin);
    }

    /**
     * Test of setMedecin method, of class Creneaux.
     */
    public void testSetMedecin() {
        System.out.println("setMedecin");
        Medecin medecin = null;
        Creneaux instance = new Creneaux();
        instance.setMedecin(medecin);
    }

    /**
     * Test of getRdv method, of class Creneaux.
     */
    public void testGetRdv() {
        System.out.println("getRdv");
        Creneaux instance = new Creneaux();
        RDV expResult = null;
        RDV result = instance.getRdv();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRdv method, of class Creneaux.
     */
    public void testSetRdv() {
        System.out.println("setRdv");
        RDV rdv = null;
        Creneaux instance = new Creneaux();
        instance.setRdv(rdv);
    }
    
}
