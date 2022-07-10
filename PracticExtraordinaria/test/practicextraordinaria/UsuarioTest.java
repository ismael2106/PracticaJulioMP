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
public class UsuarioTest {
    
    public UsuarioTest() {
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
     * Test of comprobarPersonajes method, of class Usuario.
     */
    @Test
    public void testComprobarPersonajes() throws Exception {
        System.out.println("comprobarPersonajes");
        Usuario instance = null;
        boolean expResult = false;
        boolean result = instance.comprobarPersonajes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of serializarPersonajes method, of class Usuario.
     */
    @Test
    public void testSerializarPersonajes() throws Exception {
        System.out.println("serializarPersonajes");
        Usuario instance = null;
        instance.serializarPersonajes();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarMenu method, of class Usuario.
     */
    @Test
    public void testMostrarMenu() throws Exception {
        System.out.println("mostrarMenu");
        Usuario instance = null;
        instance.mostrarMenu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isFileEmpty method, of class Usuario.
     */
    @Test
    public void testIsFileEmpty() {
        System.out.println("isFileEmpty");
        File file = null;
        Usuario instance = null;
        boolean expResult = false;
        boolean result = instance.isFileEmpty(file);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarOferta method, of class Usuario.
     */
    @Test
    public void testMostrarOferta() {
        System.out.println("mostrarOferta");
        Integer i = null;
        Usuario instance = null;
        instance.mostrarOferta(i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarOfertasSuscritas method, of class Usuario.
     */
    @Test
    public void testMostrarOfertasSuscritas() throws Exception {
        System.out.println("mostrarOfertasSuscritas");
        Usuario instance = null;
        instance.mostrarOfertasSuscritas();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of comprarOferta method, of class Usuario.
     */
    @Test
    public void testComprarOferta() throws Exception {
        System.out.println("comprarOferta");
        Usuario instance = null;
        instance.comprarOferta();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ofertarArma method, of class Usuario.
     */
    @Test
    public void testOfertarArma() throws Exception {
        System.out.println("ofertarArma");
        Usuario instance = null;
        instance.ofertarArma();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ofertarArmadura method, of class Usuario.
     */
    @Test
    public void testOfertarArmadura() throws Exception {
        System.out.println("ofertarArmadura");
        Usuario instance = null;
        instance.ofertarArmadura();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ofertarEsbirro method, of class Usuario.
     */
    @Test
    public void testOfertarEsbirro() throws Exception {
        System.out.println("ofertarEsbirro");
        Usuario instance = null;
        instance.ofertarEsbirro();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deserializar method, of class Usuario.
     */
    @Test
    public void testDeserializar() throws Exception {
        System.out.println("deserializar");
        File fichero = null;
        Usuario instance = null;
        instance.deserializar(fichero);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of serializarOfertas method, of class Usuario.
     */
    @Test
    public void testSerializarOfertas() throws Exception {
        System.out.println("serializarOfertas");
        String file = "";
        ListaDeOfertas lista = null;
        Usuario instance = null;
        instance.serializarOfertas(file, lista);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaOfertas method, of class Usuario.
     */
    @Test
    public void testGetListaOfertas() {
        System.out.println("getListaOfertas");
        Usuario instance = null;
        ArrayList<Oferta> expResult = null;
        ArrayList<Oferta> result = instance.getListaOfertas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPersonaje method, of class Usuario.
     */
    @Test
    public void testGetPersonaje() {
        System.out.println("getPersonaje");
        Usuario instance = null;
        Personaje expResult = null;
        Personaje result = instance.getPersonaje();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNick method, of class Usuario.
     */
    @Test
    public void testSetNick() {
        System.out.println("setNick");
        String nick = "";
        Usuario instance = null;
        instance.setNick(nick);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Usuario.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Usuario instance = null;
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setContraseña method, of class Usuario.
     */
    @Test
    public void testSetContraseña() {
        System.out.println("setContrase\u00f1a");
        String contraseña = "";
        Usuario instance = null;
        instance.setContraseña(contraseña);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumReg method, of class Usuario.
     */
    @Test
    public void testSetNumReg() {
        System.out.println("setNumReg");
        String numReg = "";
        Usuario instance = null;
        instance.setNumReg(numReg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFicheroUsuario method, of class Usuario.
     */
    @Test
    public void testSetFicheroUsuario() {
        System.out.println("setFicheroUsuario");
        File ficheroUsuario = null;
        Usuario instance = null;
        instance.setFicheroUsuario(ficheroUsuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFicheroOfertas method, of class Usuario.
     */
    @Test
    public void testGetFicheroOfertas() {
        System.out.println("getFicheroOfertas");
        Usuario instance = null;
        File expResult = null;
        File result = instance.getFicheroOfertas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNick method, of class Usuario.
     */
    @Test
    public void testGetNick() {
        System.out.println("getNick");
        Usuario instance = null;
        String expResult = "";
        String result = instance.getNick();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Usuario.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Usuario instance = null;
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContraseña method, of class Usuario.
     */
    @Test
    public void testGetContraseña() {
        System.out.println("getContrase\u00f1a");
        Usuario instance = null;
        String expResult = "";
        String result = instance.getContraseña();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumReg method, of class Usuario.
     */
    @Test
    public void testGetNumReg() {
        System.out.println("getNumReg");
        Usuario instance = null;
        String expResult = "";
        String result = instance.getNumReg();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFicheroUsuario method, of class Usuario.
     */
    @Test
    public void testGetFicheroUsuario() {
        System.out.println("getFicheroUsuario");
        Usuario instance = null;
        File expResult = null;
        File result = instance.getFicheroUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of darDeBajaPersonaje method, of class Usuario.
     */
    @Test
    public void testDarDeBajaPersonaje() {
        System.out.println("darDeBajaPersonaje");
        Usuario instance = null;
        instance.darDeBajaPersonaje();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultarOfertas method, of class Usuario.
     */
    @Test
    public void testConsultarOfertas() throws Exception {
        System.out.println("consultarOfertas");
        Usuario instance = null;
        instance.consultarOfertas();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of elegirEquipo method, of class Usuario.
     */
    @Test
    public void testElegirEquipo() {
        System.out.println("elegirEquipo");
        Usuario instance = null;
        instance.elegirEquipo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of salir method, of class Usuario.
     */
    @Test
    public void testSalir() {
        System.out.println("salir");
        Usuario instance = null;
        instance.salir();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
