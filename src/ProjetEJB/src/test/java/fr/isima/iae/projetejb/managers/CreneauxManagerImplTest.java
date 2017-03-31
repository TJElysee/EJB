/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.isima.iae.projetejb.managers;

import fr.isima.iae.projetejb.entities.Creneaux;
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
public class CreneauxManagerImplTest {
    
    public CreneauxManagerImplTest() {
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
     * Test of getAllCreneaux method, of class CreneauxManagerImpl.
     */
    @Test
    public void testGetAllCreneaux() throws Exception {
        System.out.println("getAllCreneaux");
        CreneauxManagerImpl instance = new CreneauxManagerImpl();
        List<Creneaux> expResult = null;
        List<Creneaux> result = instance.getAllCreneaux();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllFreeCreneaux method, of class CreneauxManagerImpl.
     */
    @Test
    public void testGetAllFreeCreneaux() throws Exception {
        System.out.println("getAllFreeCreneaux");
        CreneauxManagerImpl instance = new CreneauxManagerImpl();
        List<Creneaux> expResult = null;
        List<Creneaux> result = instance.getAllFreeCreneaux();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCreneau method, of class CreneauxManagerImpl.
     */
    @Test
    public void testAddCreneau() throws Exception {
        System.out.println("addCreneau");
        Date debut = null;
        Date fin = null;
        int idMedecin = 0;
        CreneauxManagerImpl instance = new CreneauxManagerImpl();
        int expResult = 0;
        int result = instance.addCreneau(debut, fin, idMedecin);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeCreneau method, of class CreneauxManagerImpl.
     */
    @Test
    public void testRemoveCreneau() throws Exception {
        System.out.println("removeCreneau");
        int id = 0;
        CreneauxManagerImpl instance = new CreneauxManagerImpl();
        instance.removeCreneau(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
