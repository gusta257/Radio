/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//cambio

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gustavo
 */
public class RadioTest {
    
    public RadioTest() {
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
     * Test of getEFrec method, of class Radio.
     */
    @Test
    public void testGetEFrec() {
        System.out.println("getEFrec");
        Radio instance = new Radio();
        String expResult = "";
        String result = instance.getEFrec();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEFrec method, of class Radio.
     */
    @Test
    public void testSetEFrec() {
        System.out.println("setEFrec");
        String eFrec = "";
        Radio instance = new Radio();
        instance.setEFrec(eFrec);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFrecA method, of class Radio.
     */
    @Test
    public void testGetFrecA() {
        System.out.println("getFrecA");
        Radio instance = new Radio();
        String expResult = "";
        String result = instance.getFrecA();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFrecA method, of class Radio.
     */
    @Test
    public void testSetFrecA() {
        System.out.println("setFrecA");
        String frecA = "";
        Radio instance = new Radio();
        instance.setFrecA(frecA);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cambioFrecuencia method, of class Radio.
     */
    @Test
    public void testCambioFrecuencia() {
        System.out.println("cambioFrecuencia");
        Radio instance = new Radio();
        String expResult = "";
        String result = instance.cambioFrecuencia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of frecAdelante method, of class Radio.
     */
    @Test
    public void testFrecAdelante() {
        System.out.println("frecAdelante");
        Radio instance = new Radio();
        String expResult = "";
        String result = instance.frecAdelante();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of frecAtras method, of class Radio.
     */
    @Test
    public void testFrecAtras() {
        System.out.println("frecAtras");
        Radio instance = new Radio();
        String expResult = "";
        String result = instance.frecAtras();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prender method, of class Radio.
     */
    @Test
    public void testPrender() {
        System.out.println("prender");
        Radio instance = new Radio();
        boolean expResult = false;
        boolean result = instance.prender();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of apagar method, of class Radio.
     */
    @Test
    public void testApagar() {
        System.out.println("apagar");
        Radio instance = new Radio();
        boolean expResult = false;
        boolean result = instance.apagar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of guardarEstacionActual method, of class Radio.
     */
    @Test
    public void testGuardarEstacionActual() {
        System.out.println("guardarEstacionActual");
        int pos = 0;
        Radio instance = new Radio();
        instance.guardarEstacionActual(pos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerEstacion method, of class Radio.
     */
    @Test
    public void testObtenerEstacion() {
        System.out.println("obtenerEstacion");
        int pos = 0;
        Radio instance = new Radio();
        String expResult = "";
        String result = instance.obtenerEstacion(pos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarEstacion method, of class Radio.
     */
    @Test
    public void testMostrarEstacion() {
        System.out.println("mostrarEstacion");
        Radio instance = new Radio();
        String expResult = "";
        String result = instance.mostrarEstacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estaPrendido method, of class Radio.
     */
    @Test
    public void testEstaPrendido() {
        System.out.println("estaPrendido");
        Radio instance = new Radio();
        boolean expResult = false;
        boolean result = instance.estaPrendido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerEstado method, of class Radio.
     */
    @Test
    public void testObtenerEstado() {
        System.out.println("obtenerEstado");
        Radio instance = new Radio();
        String expResult = "";
        String result = instance.obtenerEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
