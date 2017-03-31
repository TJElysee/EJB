/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.isima.iae.projetejb.services;

import fr.isima.iae.projetejb.entities.Creneaux;
import java.util.List;
import junit.framework.TestCase;

/**
 *
 * @author Paul
 */
public class CreneauRestServiceTest extends TestCase {
    
    public CreneauRestServiceTest(String testName) {
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
     * Test of create method, of class CreneauRestService.
     */
    public void testCreate() {
        System.out.println("create");
        Creneaux c = null;
        CreneauRestService instance = new CreneauRestService();
        int expResult = 0;
        int result = instance.create(c);
        assertEquals(expResult, result);
    }

    /**
     * Test of getCreneaux method, of class CreneauRestService.
     */
    public void testGetCreneaux() {
        System.out.println("getCreneaux");
        CreneauRestService instance = new CreneauRestService();
        List<Creneaux> expResult = null;
        List<Creneaux> result = instance.getCreneaux();
        assertEquals(expResult, result);
    }
    
}
