/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.isima.iae.projetejb.managers;

import fr.isima.iae.projetejb.entities.Medecin;
import java.util.List;
import junit.framework.TestCase;

/**
 *
 * @author Paul
 */
public class MedecinManagerImplTest extends TestCase {
    
    public MedecinManagerImplTest(String testName) {
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
     * Test of getAllMedecins method, of class MedecinManagerImpl.
     */
    public void testGetAllMedecins() throws Exception {
        System.out.println("getAllMedecins");
        MedecinManagerImpl instance = new MedecinManagerImpl();
        List<Medecin> expResult = null;
        List<Medecin> result = instance.getAllMedecins();
        assertEquals(expResult, result);
    }

    /**
     * Test of addMedecin method, of class MedecinManagerImpl.
     */
    public void testAddMedecin() throws Exception {
        System.out.println("addMedecin");
        Medecin medecin = null;
        MedecinManagerImpl instance = new MedecinManagerImpl();
        int expResult = 0;
        int result = instance.addMedecin(medecin);
        assertEquals(expResult, result);
    }

    /**
     * Test of getMedecin method, of class MedecinManagerImpl.
     */
    public void testGetMedecin() throws Exception {
        System.out.println("getMedecin");
        int id = 0;
        MedecinManagerImpl instance = new MedecinManagerImpl();
        Medecin expResult = null;
        Medecin result = instance.getMedecin(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of updateMedecin method, of class MedecinManagerImpl.
     */
    public void testUpdateMedecin() throws Exception {
        System.out.println("updateMedecin");
        int id = 0;
        Medecin medecin = null;
        MedecinManagerImpl instance = new MedecinManagerImpl();
        Medecin expResult = null;
        Medecin result = instance.updateMedecin(id, medecin);
        assertEquals(expResult, result);
    }

    /**
     * Test of deleteMedecin method, of class MedecinManagerImpl.
     */
    public void testDeleteMedecin() throws Exception {
        System.out.println("deleteMedecin");
        int id = 0;
        MedecinManagerImpl instance = new MedecinManagerImpl();
        instance.deleteMedecin(id);
    }
    
}
