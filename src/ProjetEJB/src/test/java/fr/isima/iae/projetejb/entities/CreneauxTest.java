/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.isima.iae.projetejb.entities;

import java.util.Date;
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
public class CreneauxTest {
    
    public CreneauxTest() {
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
     * Test of getId method, of class Creneaux.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Creneaux instance = new Creneaux();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDebut method, of class Creneaux.
     */
    @Test
    public void testGetDebut() {
        System.out.println("getDebut");
        Creneaux instance = new Creneaux();
        Date expResult = null;
        Date result = instance.getDebut();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFin method, of class Creneaux.
     */
    @Test
    public void testGetFin() {
        System.out.println("getFin");
        Creneaux instance = new Creneaux();
        Date expResult = null;
        Date result = instance.getFin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMedecin method, of class Creneaux.
     */
    @Test
    public void testGetMedecin() {
        System.out.println("getMedecin");
        Creneaux instance = new Creneaux();
        Medecin expResult = null;
        Medecin result = instance.getMedecin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Creneaux.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Creneaux instance = new Creneaux();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDebut method, of class Creneaux.
     */
    @Test
    public void testSetDebut() {
        System.out.println("setDebut");
        Date debut = null;
        Creneaux instance = new Creneaux();
        instance.setDebut(debut);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFin method, of class Creneaux.
     */
    @Test
    public void testSetFin() {
        System.out.println("setFin");
        Date fin = null;
        Creneaux instance = new Creneaux();
        instance.setFin(fin);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMedecin method, of class Creneaux.
     */
    @Test
    public void testSetMedecin() {
        System.out.println("setMedecin");
        Medecin medecin = null;
        Creneaux instance = new Creneaux();
        instance.setMedecin(medecin);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRdv method, of class Creneaux.
     */
    @Test
    public void testGetRdv() {
        System.out.println("getRdv");
        Creneaux instance = new Creneaux();
        RDV expResult = null;
        RDV result = instance.getRdv();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRdv method, of class Creneaux.
     */
    @Test
    public void testSetRdv() {
        System.out.println("setRdv");
        RDV rdv = null;
        Creneaux instance = new Creneaux();
        instance.setRdv(rdv);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
