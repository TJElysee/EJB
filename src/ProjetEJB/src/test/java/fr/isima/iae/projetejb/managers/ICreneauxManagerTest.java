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
public class ICreneauxManagerTest extends TestCase {
    
    public ICreneauxManagerTest(String testName) {
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
     * Test of getAllCreneaux method, of class ICreneauxManager.
     */
    public void testGetAllCreneaux() {
        System.out.println("getAllCreneaux");
        ICreneauxManager instance = new ICreneauxManagerImpl();
        List<Creneaux> expResult = null;
        List<Creneaux> result = instance.getAllCreneaux();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAllFreeCreneaux method, of class ICreneauxManager.
     */
    public void testGetAllFreeCreneaux() {
        System.out.println("getAllFreeCreneaux");
        ICreneauxManager instance = new ICreneauxManagerImpl();
        List<Creneaux> expResult = null;
        List<Creneaux> result = instance.getAllFreeCreneaux();
        assertEquals(expResult, result);
    }

    /**
     * Test of addCreneau method, of class ICreneauxManager.
     */
    public void testAddCreneau() {
        System.out.println("addCreneau");
        Date debut = null;
        Date fin = null;
        int idMedecin = 0;
        ICreneauxManager instance = new ICreneauxManagerImpl();
        int expResult = 0;
        int result = instance.addCreneau(debut, fin, idMedecin);
        assertEquals(expResult, result);
    }

    /**
     * Test of removeCreneau method, of class ICreneauxManager.
     */
    public void testRemoveCreneau() {
        System.out.println("removeCreneau");
        int id = 0;
        ICreneauxManager instance = new ICreneauxManagerImpl();
        instance.removeCreneau(id);
    }

    public class ICreneauxManagerImpl implements ICreneauxManager {

        public List<Creneaux> getAllCreneaux() {
            return null;
        }

        public List<Creneaux> getAllFreeCreneaux() {
            return null;
        }

        public int addCreneau(Date debut, Date fin, int idMedecin) {
            return 0;
        }

        public void removeCreneau(int id) {
        }
    }
    
}
