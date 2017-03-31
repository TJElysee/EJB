/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.isima.iae.projetejb.managers;

import fr.isima.iae.projetejb.entities.RDV;
import java.util.Date;
import java.util.List;
import junit.framework.TestCase;

/**
 *
 * @author Paul
 */
public class IRDVManagerTest extends TestCase {
    
    public IRDVManagerTest(String testName) {
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
     * Test of getAllRDV method, of class IRDVManager.
     */
    public void testGetAllRDV() {
        System.out.println("getAllRDV");
        IRDVManager instance = new IRDVManagerImpl();
        List<RDV> expResult = null;
        List<RDV> result = instance.getAllRDV();
        assertEquals(expResult, result);
    }

    /**
     * Test of takeRDV method, of class IRDVManager.
     */
    public void testTakeRDV() {
        System.out.println("takeRDV");
        Date d = null;
        int idPatient = 0;
        int idMedecin = 0;
        IRDVManager instance = new IRDVManagerImpl();
        int expResult = 0;
        int result = instance.takeRDV(d, idPatient, idMedecin);
        assertEquals(expResult, result);
    }

    /**
     * Test of editRDV method, of class IRDVManager.
     */
    public void testEditRDV() {
        System.out.println("editRDV");
        int id = 0;
        Date newDate = null;
        IRDVManager instance = new IRDVManagerImpl();
        instance.editRDV(id, newDate);
    }

    /**
     * Test of cancelRDV method, of class IRDVManager.
     */
    public void testCancelRDV() {
        System.out.println("cancelRDV");
        int id = 0;
        IRDVManager instance = new IRDVManagerImpl();
        instance.cancelRDV(id);
    }

    public class IRDVManagerImpl implements IRDVManager {

        public List<RDV> getAllRDV() {
            return null;
        }

        public int takeRDV(Date d, int idPatient, int idMedecin) {
            return 0;
        }

        public void editRDV(int id, Date newDate) {
        }

        public void cancelRDV(int id) {
        }
    }
    
}
