/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.isima.iae.projetejb.managers;

import fr.isima.iae.projetejb.entities.RDV;
import java.util.Date;
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
public class RDVManagerImplTest {
    
    public RDVManagerImplTest() {
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
     * Test of getAllRDV method, of class RDVManagerImpl.
     */
    @Test
    public void testGetAllRDV() throws Exception {
        System.out.println("getAllRDV");
        RDVManagerImpl instance = new RDVManagerImpl();
        List<RDV> expResult = null;
        List<RDV> result = instance.getAllRDV();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of takeRDV method, of class RDVManagerImpl.
     */
    @Test
    public void testTakeRDV() throws Exception {
        System.out.println("takeRDV");
        Date date = null;
        int idPatient = 0;
        int idMedecin = 0;
        RDVManagerImpl instance = new RDVManagerImpl();
        int expResult = 0;
        int result = instance.takeRDV(date, idPatient, idMedecin);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editRDV method, of class RDVManagerImpl.
     */
    @Test
    public void testEditRDV() throws Exception {
        System.out.println("editRDV");
        int id = 0;
        Date date = null;
        RDVManagerImpl instance = new RDVManagerImpl();
        instance.editRDV(id, date);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cancelRDV method, of class RDVManagerImpl.
     */
    @Test
    public void testCancelRDV() throws Exception {
        System.out.println("cancelRDV");
        int id = 0;
        RDVManagerImpl instance = new RDVManagerImpl();
        instance.cancelRDV(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
