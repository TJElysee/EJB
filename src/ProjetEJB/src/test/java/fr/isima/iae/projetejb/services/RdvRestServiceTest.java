/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.isima.iae.projetejb.services;

import fr.isima.iae.projetejb.entities.RDV;
import java.util.List;
import junit.framework.TestCase;

/**
 *
 * @author Paul
 */
public class RdvRestServiceTest extends TestCase {
    
    public RdvRestServiceTest(String testName) {
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
     * Test of create method, of class RdvRestService.
     */
    public void testCreate() {
        System.out.println("create");
        RDV r = null;
        RdvRestService instance = new RdvRestService();
        int expResult = 0;
        int result = instance.create(r);
        assertEquals(expResult, result);
    }

    /**
     * Test of getAll method, of class RdvRestService.
     */
    public void testGetAll() {
        System.out.println("getAll");
        RdvRestService instance = new RdvRestService();
        List<RDV> expResult = null;
        List<RDV> result = instance.getAll();
        assertEquals(expResult, result);
    }

    /**
     * Test of update method, of class RdvRestService.
     */
    public void testUpdate() {
        System.out.println("update");
        int id = 0;
        RDV r = null;
        RdvRestService instance = new RdvRestService();
        instance.update(id, r);
    }

    /**
     * Test of delete method, of class RdvRestService.
     */
    public void testDelete() {
        System.out.println("delete");
        int id = 0;
        RdvRestService instance = new RdvRestService();
        instance.delete(id);
    }
    
}
