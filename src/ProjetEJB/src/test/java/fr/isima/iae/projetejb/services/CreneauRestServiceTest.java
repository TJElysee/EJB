/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.isima.iae.projetejb.services;

import fr.isima.iae.projetejb.entities.Creneaux;
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
public class CreneauRestServiceTest {
    
    public CreneauRestServiceTest() {
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
     * Test of create method, of class CreneauRestService.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Creneaux c = null;
        CreneauRestService instance = new CreneauRestService();
        int expResult = 0;
        int result = instance.create(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCreneaux method, of class CreneauRestService.
     */
    @Test
    public void testGetCreneaux() {
        System.out.println("getCreneaux");
        CreneauRestService instance = new CreneauRestService();
        List<Creneaux> expResult = null;
        List<Creneaux> result = instance.getCreneaux();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
