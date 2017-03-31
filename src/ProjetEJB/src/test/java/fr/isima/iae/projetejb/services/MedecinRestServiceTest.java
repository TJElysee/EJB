/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.isima.iae.projetejb.services;

import fr.isima.iae.projetejb.entities.Medecin;
import java.util.List;
import junit.framework.TestCase;

/**
 *
 * @author Paul
 */
public class MedecinRestServiceTest extends TestCase {
    
    public MedecinRestServiceTest(String testName) {
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
     * Test of create method, of class MedecinRestService.
     */
    public void testCreate() {
        System.out.println("create");
        Medecin m = null;
        MedecinRestService instance = new MedecinRestService();
        int expResult = 0;
        int result = instance.create(m);
        assertEquals(expResult, result);
    }

    /**
     * Test of getAll method, of class MedecinRestService.
     */
    public void testGetAll() {
        System.out.println("getAll");
        MedecinRestService instance = new MedecinRestService();
        List<Medecin> expResult = null;
        List<Medecin> result = instance.getAll();
        assertEquals(expResult, result);
    }

    /**
     * Test of getOne method, of class MedecinRestService.
     */
    public void testGetOne() {
        System.out.println("getOne");
        int id = 0;
        MedecinRestService instance = new MedecinRestService();
        Medecin expResult = null;
        Medecin result = instance.getOne(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of update method, of class MedecinRestService.
     */
    public void testUpdate() {
        System.out.println("update");
        int id = 0;
        Medecin m = null;
        MedecinRestService instance = new MedecinRestService();
        instance.update(id, m);
    }

    /**
     * Test of delete method, of class MedecinRestService.
     */
    public void testDelete() {
        System.out.println("delete");
        int id = 0;
        MedecinRestService instance = new MedecinRestService();
        instance.delete(id);
    }
    
}
