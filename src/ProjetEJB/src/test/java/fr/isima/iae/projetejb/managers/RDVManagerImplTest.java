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
public class RDVManagerImplTest extends TestCase {
    
    public RDVManagerImplTest(String testName) {
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
     * Test of getAllRDV method, of class RDVManagerImpl.
     */
    public void testGetAllRDV() throws Exception {
        System.out.println("getAllRDV");
        RDVManagerImpl instance = new RDVManagerImpl();
        List<RDV> expResult = null;
        List<RDV> result = instance.getAllRDV();
        assertEquals(expResult, result);
    }

    /**
     * Test of takeRDV method, of class RDVManagerImpl.
     */
    public void testTakeRDV() throws Exception {
        System.out.println("takeRDV");
        Date date = null;
        int idPatient = 0;
        int idMedecin = 0;
        RDVManagerImpl instance = new RDVManagerImpl();
        int expResult = 0;
        int result = instance.takeRDV(date, idPatient, idMedecin);
        assertEquals(expResult, result);
    }

    /**
     * Test of editRDV method, of class RDVManagerImpl.
     */
    public void testEditRDV() throws Exception {
        System.out.println("editRDV");
        int id = 0;
        Date date = null;
        RDVManagerImpl instance = new RDVManagerImpl();
        instance.editRDV(id, date);
    }

    /**
     * Test of cancelRDV method, of class RDVManagerImpl.
     */
    public void testCancelRDV() throws Exception {
        System.out.println("cancelRDV");
        int id = 0;
        RDVManagerImpl instance = new RDVManagerImpl();
        instance.cancelRDV(id);
    }
    
}
