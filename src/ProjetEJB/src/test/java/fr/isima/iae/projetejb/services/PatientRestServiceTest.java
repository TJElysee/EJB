/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.isima.iae.projetejb.services;

import fr.isima.iae.projetejb.entities.Patient;
import java.util.List;
import junit.framework.TestCase;

/**
 *
 * @author Paul
 */
public class PatientRestServiceTest extends TestCase {
    
    public PatientRestServiceTest(String testName) {
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
     * Test of create method, of class PatientRestService.
     */
    public void testCreate() {
        System.out.println("create");
        Patient p = null;
        PatientRestService instance = new PatientRestService();
        int expResult = 0;
        int result = instance.create(p);
        assertEquals(expResult, result);
    }

    /**
     * Test of getAll method, of class PatientRestService.
     */
    public void testGetAll() {
        System.out.println("getAll");
        PatientRestService instance = new PatientRestService();
        List<Patient> expResult = null;
        List<Patient> result = instance.getAll();
        assertEquals(expResult, result);
    }

    /**
     * Test of getOne method, of class PatientRestService.
     */
    public void testGetOne() {
        System.out.println("getOne");
        int id = 0;
        PatientRestService instance = new PatientRestService();
        Patient expResult = null;
        Patient result = instance.getOne(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of update method, of class PatientRestService.
     */
    public void testUpdate() {
        System.out.println("update");
        int id = 0;
        Patient p = null;
        PatientRestService instance = new PatientRestService();
        instance.update(id, p);
    }

    /**
     * Test of delete method, of class PatientRestService.
     */
    public void testDelete() {
        System.out.println("delete");
        int id = 0;
        PatientRestService instance = new PatientRestService();
        instance.delete(id);
    }
    
}
