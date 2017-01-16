/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author soufiane
 */
public class VolTest {
    
    public VolTest() {
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
     * Test of toString method, of class Vol.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Vol instance = new Vol();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumVoyage method, of class Vol.
     */
    @Test
    public void testGetNumVoyage() {
        System.out.println("getNumVoyage");
        Vol instance = new Vol();
        int expResult = 0;
        int result = instance.getNumVoyage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateDepart method, of class Vol.
     */
    @Test
    public void testGetDateDepart() {
        System.out.println("getDateDepart");
        Vol instance = new Vol();
        int expResult = 0;
        int result = instance.getDateDepart();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHeureDepart method, of class Vol.
     */
    @Test
    public void testGetHeureDepart() {
        System.out.println("getHeureDepart");
        Vol instance = new Vol();
        int expResult = 0;
        int result = instance.getHeureDepart();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateArret method, of class Vol.
     */
    @Test
    public void testGetDateArret() {
        System.out.println("getDateArret");
        Vol instance = new Vol();
        int expResult = 0;
        int result = instance.getDateArret();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHeureArret method, of class Vol.
     */
    @Test
    public void testGetHeureArret() {
        System.out.println("getHeureArret");
        Vol instance = new Vol();
        int expResult = 0;
        int result = instance.getHeureArret();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ouvrirReservation method, of class Vol.
     */
    @Test
    public void testOuvrirReservation() {
        System.out.println("ouvrirReservation");
        Vol instance = new Vol();
        instance.ouvrirReservation();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fermerReservation method, of class Vol.
     */
    @Test
    public void testFermerReservation() {
        System.out.println("fermerReservation");
        Vol instance = new Vol();
        instance.fermerReservation();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
