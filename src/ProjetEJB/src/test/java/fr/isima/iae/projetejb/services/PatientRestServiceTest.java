/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.isima.iae.projetejb.services;

import fr.isima.iae.projetejb.entities.Patient;
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
public class PatientRestServiceTest {
    
    public PatientRestServiceTest() {
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
     * Test of create method, of class PatientRestService.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Patient p = null;
        PatientRestService instance = new PatientRestService();
        int expResult = 0;
        int result = instance.create(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class PatientRestService.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        PatientRestService instance = new PatientRestService();
        List<Patient> expResult = null;
        List<Patient> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOne method, of class PatientRestService.
     */
    @Test
    public void testGetOne() {
        System.out.println("getOne");
        int id = 0;
        PatientRestService instance = new PatientRestService();
        Patient expResult = null;
        Patient result = instance.getOne(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class PatientRestService.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        int id = 0;
        Patient p = null;
        PatientRestService instance = new PatientRestService();
        instance.update(id, p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class PatientRestService.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int id = 0;
        PatientRestService instance = new PatientRestService();
        instance.delete(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
