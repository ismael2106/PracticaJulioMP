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
public class OfertaTest {
    
    public OfertaTest() {
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
     * Test of crearOfertaArma method, of class Oferta.
     */
    @Test
    public void testCrearOfertaArma() {
        System.out.println("crearOfertaArma");
        Arma arma = null;
        Oferta instance = new Oferta();
        Oferta expResult = null;
        Oferta result = instance.crearOfertaArma(arma);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of crearOfertaArmadura method, of class Oferta.
     */
    @Test
    public void testCrearOfertaArmadura() {
        System.out.println("crearOfertaArmadura");
        Armadura armadura = null;
        Oferta instance = new Oferta();
        Oferta expResult = null;
        Oferta result = instance.crearOfertaArmadura(armadura);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of crearOfertaEsbirro method, of class Oferta.
     */
    @Test
    public void testCrearOfertaEsbirro() {
        System.out.println("crearOfertaEsbirro");
        Esbirro esbirro = null;
        Oferta instance = new Oferta();
        instance.crearOfertaEsbirro(esbirro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrecio method, of class Oferta.
     */
    @Test
    public void testSetPrecio() {
        System.out.println("setPrecio");
        float precio = 0.0F;
        Oferta instance = new Oferta();
        instance.setPrecio(precio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipoUsuario method, of class Oferta.
     */
    @Test
    public void testSetTipoUsuario() {
        System.out.println("setTipoUsuario");
        String tipoUsuario = "";
        Oferta instance = new Oferta();
        instance.setTipoUsuario(tipoUsuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaNombres method, of class Oferta.
     */
    @Test
    public void testGetListaNombres() {
        System.out.println("getListaNombres");
        Oferta instance = new Oferta();
        ArrayList expResult = null;
        ArrayList result = instance.getListaNombres();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isValidada method, of class Oferta.
     */
    @Test
    public void testIsValidada() {
        System.out.println("isValidada");
        Oferta instance = new Oferta();
        boolean expResult = false;
        boolean result = instance.isValidada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValidada method, of class Oferta.
     */
    @Test
    public void testSetValidada() {
        System.out.println("setValidada");
        boolean validada = false;
        Oferta instance = new Oferta();
        instance.setValidada(validada);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCateg method, of class Oferta.
     */
    @Test
    public void testGetCateg() {
        System.out.println("getCateg");
        Oferta instance = new Oferta();
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.getCateg();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLeal method, of class Oferta.
     */
    @Test
    public void testGetLeal() {
        System.out.println("getLeal");
        Oferta instance = new Oferta();
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.getLeal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValorAtaque method, of class Oferta.
     */
    @Test
    public void testGetValorAtaque() {
        System.out.println("getValorAtaque");
        Oferta instance = new Oferta();
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.getValorAtaque();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValorDefensa method, of class Oferta.
     */
    @Test
    public void testGetValorDefensa() {
        System.out.println("getValorDefensa");
        Oferta instance = new Oferta();
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.getValorDefensa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipoUsuario method, of class Oferta.
     */
    @Test
    public void testGetTipoUsuario() {
        System.out.println("getTipoUsuario");
        Oferta instance = new Oferta();
        String expResult = "";
        String result = instance.getTipoUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrecio method, of class Oferta.
     */
    @Test
    public void testGetPrecio() {
        System.out.println("getPrecio");
        Oferta instance = new Oferta();
        float expResult = 0.0F;
        float result = instance.getPrecio();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaElementos method, of class Oferta.
     */
    @Test
    public void testGetListaElementos() {
        System.out.println("getListaElementos");
        Oferta instance = new Oferta();
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.getListaElementos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isTipoEsbirro method, of class Oferta.
     */
    @Test
    public void testIsTipoEsbirro() {
        System.out.println("isTipoEsbirro");
        Oferta instance = new Oferta();
        boolean expResult = false;
        boolean result = instance.isTipoEsbirro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isTipoEquipo method, of class Oferta.
     */
    @Test
    public void testIsTipoEquipo() {
        System.out.println("isTipoEquipo");
        Oferta instance = new Oferta();
        boolean expResult = false;
        boolean result = instance.isTipoEquipo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
