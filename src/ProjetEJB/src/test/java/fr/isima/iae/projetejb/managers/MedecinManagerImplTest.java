/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.isima.iae.projetejb.managers;

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
public class MedecinManagerImplTest {
    
    public MedecinManagerImplTest() {
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
     * Test of getAllMedecins method, of class MedecinManagerImpl.
     */
    @Test
    public void testGetAllMedecins() throws Exception {
        System.out.println("getAllMedecins");
        MedecinManagerImpl instance = new MedecinManagerImpl();
        List<Medecin> expResult = null;
        List<Medecin> result = instance.getAllMedecins();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addMedecin method, of class MedecinManagerImpl.
     */
    @Test
    public void testAddMedecin() throws Exception {
        System.out.println("addMedecin");
        Medecin medecin = null;
        MedecinManagerImpl instance = new MedecinManagerImpl();
        int expResult = 0;
        int result = instance.addMedecin(medecin);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMedecin method, of class MedecinManagerImpl.
     */
    @Test
    public void testGetMedecin() throws Exception {
        System.out.println("getMedecin");
        int id = 0;
        MedecinManagerImpl instance = new MedecinManagerImpl();
        Medecin expResult = null;
        Medecin result = instance.getMedecin(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateMedecin method, of class MedecinManagerImpl.
     */
    @Test
    public void testUpdateMedecin() throws Exception {
        System.out.println("updateMedecin");
        int id = 0;
        Medecin medecin = null;
        MedecinManagerImpl instance = new MedecinManagerImpl();
        Medecin expResult = null;
        Medecin result = instance.updateMedecin(id, medecin);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteMedecin method, of class MedecinManagerImpl.
     */
    @Test
    public void testDeleteMedecin() throws Exception {
        System.out.println("deleteMedecin");
        int id = 0;
        MedecinManagerImpl instance = new MedecinManagerImpl();
        instance.deleteMedecin(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
