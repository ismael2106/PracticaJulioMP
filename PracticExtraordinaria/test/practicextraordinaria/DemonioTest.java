/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package practicextraordinaria;

import java.util.HashSet;
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
public class DemonioTest {
    
    public DemonioTest() {
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
     * Test of getConjuntoEsbirros method, of class Demonio.
     */
    @Test
    public void testGetConjuntoEsbirros() {
        System.out.println("getConjuntoEsbirros");
        Demonio instance = null;
        HashSet<Esbirro> expResult = null;
        HashSet<Esbirro> result = instance.getConjuntoEsbirros();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
