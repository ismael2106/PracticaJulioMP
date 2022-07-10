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
public class ArmaduraTest {
    
    public ArmaduraTest() {
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
     * Test of getCat method, of class Armadura.
     */
    @Test
    public void testGetCat() {
        System.out.println("getCat");
        Armadura instance = null;
        Armadura.categoria expResult = null;
        Armadura.categoria result = instance.getCat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModDefensa method, of class Armadura.
     */
    @Test
    public void testGetModDefensa() {
        System.out.println("getModDefensa");
        Armadura instance = null;
        String expResult = "";
        String result = instance.getModDefensa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModAtaque method, of class Armadura.
     */
    @Test
    public void testGetModAtaque() {
        System.out.println("getModAtaque");
        Armadura instance = null;
        String expResult = "";
        String result = instance.getModAtaque();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Armadura.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Armadura instance = null;
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
