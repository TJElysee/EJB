/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.isima.iae.projetejb.services;

import fr.isima.iae.projetejb.entities.Medecin;
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
public class MedecinRestServiceTest {
    
    public MedecinRestServiceTest() {
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
     * Test of create method, of class MedecinRestService.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Medecin m = null;
        MedecinRestService instance = new MedecinRestService();
        int expResult = 0;
        int result = instance.create(m);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class MedecinRestService.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        MedecinRestService instance = new MedecinRestService();
        List<Medecin> expResult = null;
        List<Medecin> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOne method, of class MedecinRestService.
     */
    @Test
    public void testGetOne() {
        System.out.println("getOne");
        int id = 0;
        MedecinRestService instance = new MedecinRestService();
        Medecin expResult = null;
        Medecin result = instance.getOne(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class MedecinRestService.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        int id = 0;
        Medecin m = null;
        MedecinRestService instance = new MedecinRestService();
        instance.update(id, m);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class MedecinRestService.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int id = 0;
        MedecinRestService instance = new MedecinRestService();
        instance.delete(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
