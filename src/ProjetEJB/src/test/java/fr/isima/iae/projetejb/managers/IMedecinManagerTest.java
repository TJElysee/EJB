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
public class IMedecinManagerTest extends TestCase {
    
    public IMedecinManagerTest(String testName) {
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
     * Test of getAllMedecins method, of class IMedecinManager.
     */
    public void testGetAllMedecins() {
        System.out.println("getAllMedecins");
        IMedecinManager instance = new IMedecinManagerImpl();
        List<Medecin> expResult = null;
        List<Medecin> result = instance.getAllMedecins();
        assertEquals(expResult, result);
    }

    /**
     * Test of addMedecin method, of class IMedecinManager.
     */
    public void testAddMedecin() {
        System.out.println("addMedecin");
        Medecin medecin = null;
        IMedecinManager instance = new IMedecinManagerImpl();
        int expResult = 0;
        int result = instance.addMedecin(medecin);
        assertEquals(expResult, result);
    }

    /**
     * Test of getMedecin method, of class IMedecinManager.
     */
    public void testGetMedecin() {
        System.out.println("getMedecin");
        int id = 0;
        IMedecinManager instance = new IMedecinManagerImpl();
        Medecin expResult = null;
        Medecin result = instance.getMedecin(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of updateMedecin method, of class IMedecinManager.
     */
    public void testUpdateMedecin() {
        System.out.println("updateMedecin");
        int id = 0;
        Medecin medecin = null;
        IMedecinManager instance = new IMedecinManagerImpl();
        Medecin expResult = null;
        Medecin result = instance.updateMedecin(id, medecin);
        assertEquals(expResult, result);
    }

    /**
     * Test of deleteMedecin method, of class IMedecinManager.
     */
    public void testDeleteMedecin() {
        System.out.println("deleteMedecin");
        int id = 0;
        IMedecinManager instance = new IMedecinManagerImpl();
        instance.deleteMedecin(id);
    }

    public class IMedecinManagerImpl implements IMedecinManager {

        public List<Medecin> getAllMedecins() {
            return null;
        }

        public int addMedecin(Medecin medecin) {
            return 0;
        }

        public Medecin getMedecin(int id) {
            return null;
        }

        public Medecin updateMedecin(int id, Medecin medecin) {
            return null;
        }

        public void deleteMedecin(int id) {
        }
    }
    
}
