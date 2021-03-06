/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.isima.iae.projetejb.managers;

import fr.isima.iae.projetejb.entities.Creneaux;
import java.util.Date;
import java.util.List;
import junit.framework.TestCase;

/**
 *
 * @author Paul
 */
public class CreneauxManagerImplTest extends TestCase {
    
    public CreneauxManagerImplTest(String testName) {
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
     * Test of getAllCreneaux method, of class CreneauxManagerImpl.
     */
    public void testGetAllCreneaux() throws Exception {
        System.out.println("getAllCreneaux");
        CreneauxManagerImpl instance = new CreneauxManagerImpl();
        List<Creneaux> expResult = null;
        List<Creneaux> result = instance.getAllCreneaux();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAllFreeCreneaux method, of class CreneauxManagerImpl.
     */
    public void testGetAllFreeCreneaux() throws Exception {
        System.out.println("getAllFreeCreneaux");
        CreneauxManagerImpl instance = new CreneauxManagerImpl();
        List<Creneaux> expResult = null;
        List<Creneaux> result = instance.getAllFreeCreneaux();
        assertEquals(expResult, result);
    }

    /**
     * Test of addCreneau method, of class CreneauxManagerImpl.
     */
    public void testAddCreneau() throws Exception {
        System.out.println("addCreneau");
        Date debut = null;
        Date fin = null;
        int idMedecin = 0;
        CreneauxManagerImpl instance = new CreneauxManagerImpl();
        int expResult = 0;
        int result = instance.addCreneau(debut, fin, idMedecin);
        assertEquals(expResult, result);
    }

    /**
     * Test of removeCreneau method, of class CreneauxManagerImpl.
     */
    public void testRemoveCreneau() throws Exception {
        System.out.println("removeCreneau");
        int id = 0;
        CreneauxManagerImpl instance = new CreneauxManagerImpl();
        instance.removeCreneau(id);
    }
    
}
