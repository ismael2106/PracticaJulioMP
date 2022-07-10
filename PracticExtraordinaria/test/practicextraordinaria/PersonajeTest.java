/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package practicextraordinaria;

import java.io.File;
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
public class PersonajeTest {
    
    public PersonajeTest() {
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
     * Test of suscribirse method, of class Personaje.
     */
    @Test
    public void testSuscribirse() {
        System.out.println("suscribirse");
        Personaje instance = null;
        instance.suscribirse();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registrarPersonaje method, of class Personaje.
     */
    @Test
    public void testRegistrarPersonaje() throws Exception {
        System.out.println("registrarPersonaje");
        Personaje instance = null;
        instance.registrarPersonaje();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultarOro method, of class Personaje.
     */
    @Test
    public void testConsultarOro() {
        System.out.println("consultarOro");
        Personaje instance = null;
        instance.consultarOro();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOro method, of class Personaje.
     */
    @Test
    public void testGetOro() {
        System.out.println("getOro");
        Personaje instance = null;
        float expResult = 0.0F;
        float result = instance.getOro();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOro method, of class Personaje.
     */
    @Test
    public void testSetOro() {
        System.out.println("setOro");
        float oro = 0.0F;
        Personaje instance = null;
        instance.setOro(oro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFicheroPersonajes method, of class Personaje.
     */
    @Test
    public void testGetFicheroPersonajes() {
        System.out.println("getFicheroPersonajes");
        Personaje instance = null;
        File expResult = null;
        File result = instance.getFicheroPersonajes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFicheroPersonajes method, of class Personaje.
     */
    @Test
    public void testSetFicheroPersonajes() {
        System.out.println("setFicheroPersonajes");
        File ficheroPersonajes = null;
        Personaje instance = null;
        instance.setFicheroPersonajes(ficheroPersonajes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipo method, of class Personaje.
     */
    @Test
    public void testSetTipo() {
        System.out.println("setTipo");
        String tipo = "";
        Personaje instance = null;
        instance.setTipo(tipo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipo method, of class Personaje.
     */
    @Test
    public void testGetTipo() {
        System.out.println("getTipo");
        Personaje instance = null;
        String expResult = "";
        String result = instance.getTipo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEquipo method, of class Personaje.
     */
    @Test
    public void testGetEquipo() {
        System.out.println("getEquipo");
        Personaje instance = null;
        Equipo expResult = null;
        Equipo result = instance.getEquipo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Personaje.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Personaje instance = null;
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Personaje.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Personaje instance = null;
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEquipo method, of class Personaje.
     */
    @Test
    public void testSetEquipo() {
        System.out.println("setEquipo");
        Personaje instance = null;
        instance.setEquipo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNick method, of class Personaje.
     */
    @Test
    public void testGetNick() {
        System.out.println("getNick");
        Personaje instance = null;
        String expResult = "";
        String result = instance.getNick();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isTipoEsbirro method, of class Personaje.
     */
    @Test
    public void testIsTipoEsbirro() {
        System.out.println("isTipoEsbirro");
        Personaje instance = null;
        boolean expResult = false;
        boolean result = instance.isTipoEsbirro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isTipoEquipo method, of class Personaje.
     */
    @Test
    public void testIsTipoEquipo() {
        System.out.println("isTipoEquipo");
        Personaje instance = null;
        boolean expResult = false;
        boolean result = instance.isTipoEquipo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isCategoriaLegendario method, of class Personaje.
     */
    @Test
    public void testIsCategoriaLegendario() {
        System.out.println("isCategoriaLegendario");
        Personaje instance = null;
        boolean expResult = false;
        boolean result = instance.isCategoriaLegendario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isCategoriaEpico method, of class Personaje.
     */
    @Test
    public void testIsCategoriaEpico() {
        System.out.println("isCategoriaEpico");
        Personaje instance = null;
        boolean expResult = false;
        boolean result = instance.isCategoriaEpico();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isCategoriaComun method, of class Personaje.
     */
    @Test
    public void testIsCategoriaComun() {
        System.out.println("isCategoriaComun");
        Personaje instance = null;
        boolean expResult = false;
        boolean result = instance.isCategoriaComun();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isLealtadAlta method, of class Personaje.
     */
    @Test
    public void testIsLealtadAlta() {
        System.out.println("isLealtadAlta");
        Personaje instance = null;
        boolean expResult = false;
        boolean result = instance.isLealtadAlta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isLealtadMedia method, of class Personaje.
     */
    @Test
    public void testIsLealtadMedia() {
        System.out.println("isLealtadMedia");
        Personaje instance = null;
        boolean expResult = false;
        boolean result = instance.isLealtadMedia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isLealtadBaja method, of class Personaje.
     */
    @Test
    public void testIsLealtadBaja() {
        System.out.println("isLealtadBaja");
        Personaje instance = null;
        boolean expResult = false;
        boolean result = instance.isLealtadBaja();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipoModAtaque method, of class Personaje.
     */
    @Test
    public void testGetTipoModAtaque() {
        System.out.println("getTipoModAtaque");
        Personaje instance = null;
        String expResult = "";
        String result = instance.getTipoModAtaque();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipoModDefensa method, of class Personaje.
     */
    @Test
    public void testGetTipoModDefensa() {
        System.out.println("getTipoModDefensa");
        Personaje instance = null;
        String expResult = "";
        String result = instance.getTipoModDefensa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipoNombreUsuario method, of class Personaje.
     */
    @Test
    public void testGetTipoNombreUsuario() {
        System.out.println("getTipoNombreUsuario");
        Personaje instance = null;
        String expResult = "";
        String result = instance.getTipoNombreUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrecioMin method, of class Personaje.
     */
    @Test
    public void testGetPrecioMin() {
        System.out.println("getPrecioMin");
        Personaje instance = null;
        float expResult = 0.0F;
        float result = instance.getPrecioMin();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrecioMax method, of class Personaje.
     */
    @Test
    public void testGetPrecioMax() {
        System.out.println("getPrecioMax");
        Personaje instance = null;
        float expResult = 0.0F;
        float result = instance.getPrecioMax();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipoEsbirro method, of class Personaje.
     */
    @Test
    public void testSetTipoEsbirro() {
        System.out.println("setTipoEsbirro");
        boolean tipoEsbirro = false;
        Personaje instance = null;
        instance.setTipoEsbirro(tipoEsbirro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipoEquipo method, of class Personaje.
     */
    @Test
    public void testSetTipoEquipo() {
        System.out.println("setTipoEquipo");
        boolean tipoEquipo = false;
        Personaje instance = null;
        instance.setTipoEquipo(tipoEquipo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCategoriaLegendario method, of class Personaje.
     */
    @Test
    public void testSetCategoriaLegendario() {
        System.out.println("setCategoriaLegendario");
        boolean categoriaLegendario = false;
        Personaje instance = null;
        instance.setCategoriaLegendario(categoriaLegendario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCategoriaRaro method, of class Personaje.
     */
    @Test
    public void testSetCategoriaRaro() {
        System.out.println("setCategoriaRaro");
        boolean categoriaRaro = false;
        Personaje instance = null;
        instance.setCategoriaRaro(categoriaRaro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCategoriaEpico method, of class Personaje.
     */
    @Test
    public void testSetCategoriaEpico() {
        System.out.println("setCategoriaEpico");
        boolean categoriaEpico = false;
        Personaje instance = null;
        instance.setCategoriaEpico(categoriaEpico);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCategoriaComun method, of class Personaje.
     */
    @Test
    public void testSetCategoriaComun() {
        System.out.println("setCategoriaComun");
        boolean categoriaComun = false;
        Personaje instance = null;
        instance.setCategoriaComun(categoriaComun);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLealtadAlta method, of class Personaje.
     */
    @Test
    public void testSetLealtadAlta() {
        System.out.println("setLealtadAlta");
        boolean lealtadAlta = false;
        Personaje instance = null;
        instance.setLealtadAlta(lealtadAlta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLealtadMedia method, of class Personaje.
     */
    @Test
    public void testSetLealtadMedia() {
        System.out.println("setLealtadMedia");
        boolean lealtadMedia = false;
        Personaje instance = null;
        instance.setLealtadMedia(lealtadMedia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLealtadBaja method, of class Personaje.
     */
    @Test
    public void testSetLealtadBaja() {
        System.out.println("setLealtadBaja");
        boolean lealtadBaja = false;
        Personaje instance = null;
        instance.setLealtadBaja(lealtadBaja);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipoModAtaque method, of class Personaje.
     */
    @Test
    public void testSetTipoModAtaque() {
        System.out.println("setTipoModAtaque");
        String tipoModAtaque = "";
        Personaje instance = null;
        instance.setTipoModAtaque(tipoModAtaque);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipoModDefensa method, of class Personaje.
     */
    @Test
    public void testSetTipoModDefensa() {
        System.out.println("setTipoModDefensa");
        String tipoModDefensa = "";
        Personaje instance = null;
        instance.setTipoModDefensa(tipoModDefensa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipoNombreUsuario method, of class Personaje.
     */
    @Test
    public void testSetTipoNombreUsuario() {
        System.out.println("setTipoNombreUsuario");
        String tipoNombreUsuario = "";
        Personaje instance = null;
        instance.setTipoNombreUsuario(tipoNombreUsuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrecioMin method, of class Personaje.
     */
    @Test
    public void testSetPrecioMin() {
        System.out.println("setPrecioMin");
        float precioMin = 0.0F;
        Personaje instance = null;
        instance.setPrecioMin(precioMin);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrecioMax method, of class Personaje.
     */
    @Test
    public void testSetPrecioMax() {
        System.out.println("setPrecioMax");
        float precioMax = 0.0F;
        Personaje instance = null;
        instance.setPrecioMax(precioMax);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
