/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.isima.iae.projetejb.entities;

import java.util.Collection;
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
public class MedecinTest {
    
    public MedecinTest() {
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
     * Test of getId method, of class Medecin.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Medecin instance = new Medecin();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNom method, of class Medecin.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        Medecin instance = new Medecin();
        String expResult = "";
        String result = instance.getNom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrenom method, of class Medecin.
     */
    @Test
    public void testGetPrenom() {
        System.out.println("getPrenom");
        Medecin instance = new Medecin();
        String expResult = "";
        String result = instance.getPrenom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Medecin.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Medecin instance = new Medecin();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNom method, of class Medecin.
     */
    @Test
    public void testSetNom() {
        System.out.println("setNom");
        String nom = "";
        Medecin instance = new Medecin();
        instance.setNom(nom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrenom method, of class Medecin.
     */
    @Test
    public void testSetPrenom() {
        System.out.println("setPrenom");
        String prenom = "";
        Medecin instance = new Medecin();
        instance.setPrenom(prenom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCrenaux method, of class Medecin.
     */
    @Test
    public void testGetCrenaux() {
        System.out.println("getCrenaux");
        Medecin instance = new Medecin();
        Collection<Creneaux> expResult = null;
        Collection<Creneaux> result = instance.getCrenaux();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCrenaux method, of class Medecin.
     */
    @Test
    public void testSetCrenaux() {
        System.out.println("setCrenaux");
        Collection<Creneaux> crenaux = null;
        Medecin instance = new Medecin();
        instance.setCrenaux(crenaux);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
