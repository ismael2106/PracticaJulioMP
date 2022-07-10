/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package practicextraordinaria;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author paula
 */
public class EsbirroTest {
    
    public EsbirroTest() {
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
     * Test of getNombre method, of class Esbirro.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Esbirro instance = null;
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSalud method, of class Esbirro.
     */
    @Test
    public void testGetSalud() {
        System.out.println("getSalud");
        Esbirro instance = null;
        int expResult = 0;
        int result = instance.getSalud();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipoEsbirro method, of class Esbirro.
     */
    @Test
    public void testGetTipoEsbirro() {
        System.out.println("getTipoEsbirro");
        Esbirro instance = null;
        Esbirro.tipo expResult = null;
        Esbirro.tipo result = instance.getTipoEsbirro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHumano method, of class Esbirro.
     */
    @Test
    public void testGetHumano() {
        System.out.println("getHumano");
        Esbirro instance = null;
        Humano expResult = null;
        Humano result = instance.getHumano();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGhoul method, of class Esbirro.
     */
    @Test
    public void testGetGhoul() {
        System.out.println("getGhoul");
        Esbirro instance = null;
        Ghoul expResult = null;
        Ghoul result = instance.getGhoul();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDemonio method, of class Esbirro.
     */
    @Test
    public void testGetDemonio() {
        System.out.println("getDemonio");
        Esbirro instance = null;
        Demonio expResult = null;
        Demonio result = instance.getDemonio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
