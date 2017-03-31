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
public class MedecinTest extends TestCase {
    
    public MedecinTest(String testName) {
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
     * Test of getId method, of class Medecin.
     */
    public void testGetId() {
        System.out.println("getId");
        Medecin instance = new Medecin();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNom method, of class Medecin.
     */
    public void testGetNom() {
        System.out.println("getNom");
        Medecin instance = new Medecin();
        String expResult = "";
        String result = instance.getNom();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPrenom method, of class Medecin.
     */
    public void testGetPrenom() {
        System.out.println("getPrenom");
        Medecin instance = new Medecin();
        String expResult = "";
        String result = instance.getPrenom();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Medecin.
     */
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Medecin instance = new Medecin();
        instance.setId(id);
    }

    /**
     * Test of setNom method, of class Medecin.
     */
    public void testSetNom() {
        System.out.println("setNom");
        String nom = "";
        Medecin instance = new Medecin();
        instance.setNom(nom);
    }

    /**
     * Test of setPrenom method, of class Medecin.
     */
    public void testSetPrenom() {
        System.out.println("setPrenom");
        String prenom = "";
        Medecin instance = new Medecin();
        instance.setPrenom(prenom);
    }

    /**
     * Test of getCrenaux method, of class Medecin.
     */
    public void testGetCrenaux() {
        System.out.println("getCrenaux");
        Medecin instance = new Medecin();
        Collection<Creneaux> expResult = null;
        Collection<Creneaux> result = instance.getCrenaux();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCrenaux method, of class Medecin.
     */
    public void testSetCrenaux() {
        System.out.println("setCrenaux");
        Collection<Creneaux> crenaux = null;
        Medecin instance = new Medecin();
        instance.setCrenaux(crenaux);
    }
    
}
