/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package practicextraordinaria;

import java.io.File;
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
public class OperadorTest {
    
    public OperadorTest() {
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
     * Test of mostrarMenu method, of class Operador.
     */
    @Test
    public void testMostrarMenu() throws Exception {
        System.out.println("mostrarMenu");
        Operador instance = null;
        instance.mostrarMenu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validarOferta method, of class Operador.
     */
    @Test
    public void testValidarOferta() throws Exception {
        System.out.println("validarOferta");
        Operador instance = null;
        instance.validarOferta();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deserializar method, of class Operador.
     */
    @Test
    public void testDeserializar() throws Exception {
        System.out.println("deserializar");
        File fichero = null;
        Operador instance = null;
        instance.deserializar(fichero);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of serializarOfertas method, of class Operador.
     */
    @Test
    public void testSerializarOfertas() throws Exception {
        System.out.println("serializarOfertas");
        String file = "";
        ListaDeOfertas lista = null;
        Operador instance = null;
        instance.serializarOfertas(file, lista);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of volcarFichero method, of class Operador.
     */
    @Test
    public void testVolcarFichero() throws Exception {
        System.out.println("volcarFichero");
        String ficheroEscogido = "";
        ArrayList lista = null;
        Operador instance = null;
        instance.volcarFichero(ficheroEscogido, lista);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultarVentas method, of class Operador.
     */
    @Test
    public void testConsultarVentas() throws Exception {
        System.out.println("consultarVentas");
        Operador instance = null;
        instance.consultarVentas();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of banear method, of class Operador.
     */
    @Test
    public void testBanear() throws Exception {
        System.out.println("banear");
        Operador instance = null;
        instance.banear();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of desbanear method, of class Operador.
     */
    @Test
    public void testDesbanear() throws Exception {
        System.out.println("desbanear");
        Operador instance = null;
        instance.desbanear();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
