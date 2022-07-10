/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package practicextraordinaria;

import java.util.ArrayList;
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
public class ListaDePersonajesTest {
    
    public ListaDePersonajesTest() {
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
     * Test of getListaPersonajes method, of class ListaDePersonajes.
     */
    @Test
    public void testGetListaPersonajes() {
        System.out.println("getListaPersonajes");
        ListaDePersonajes instance = null;
        ArrayList<Personaje> expResult = null;
        ArrayList<Personaje> result = instance.getListaPersonajes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
