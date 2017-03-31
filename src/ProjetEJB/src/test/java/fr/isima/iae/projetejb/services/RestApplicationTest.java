/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.isima.iae.projetejb.services;

import java.util.Set;
import junit.framework.TestCase;

/**
 *
 * @author Paul
 */
public class RestApplicationTest extends TestCase {
    
    public RestApplicationTest(String testName) {
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
     * Test of getClasses method, of class RestApplication.
     */
    public void testGetClasses() {
        System.out.println("getClasses");
        RestApplication instance = new RestApplication();
        Set<Class<?>> expResult = null;
        Set<Class<?>> result = instance.getClasses();
        assertEquals(expResult, result);
    }
    
}
