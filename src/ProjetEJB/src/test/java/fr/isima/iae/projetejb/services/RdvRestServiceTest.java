/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.isima.iae.projetejb.services;

import fr.isima.iae.projetejb.entities.RDV;
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
public class RdvRestServiceTest {
    
    public RdvRestServiceTest() {
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
     * Test of create method, of class RdvRestService.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        RDV r = null;
        RdvRestService instance = new RdvRestService();
        int expResult = 0;
        int result = instance.create(r);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class RdvRestService.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        RdvRestService instance = new RdvRestService();
        List<RDV> expResult = null;
        List<RDV> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class RdvRestService.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        int id = 0;
        RDV r = null;
        RdvRestService instance = new RdvRestService();
        instance.update(id, r);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class RdvRestService.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int id = 0;
        RdvRestService instance = new RdvRestService();
        instance.delete(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
