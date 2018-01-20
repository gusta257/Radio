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
     * Test of prender method, of class Radio.
     */
    @Test
    public void testPrender() {
        System.out.println("prender");
        Radio instance = new Radio();
        boolean expResult = true;
        boolean result = instance.prender();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult=false){
            fail("The test case is a prototype.");
        }
    }
    /**
     * Test of estaPrendido method, of class Radio.
     */
    @Test
    public void testEstaPrendido() {
        System.out.println("estaPrendido");
        Radio instance = new Radio();
        boolean expResult = true;
        boolean result = instance.estaPrendido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult=false){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of obtenerEstado method, of class Radio.
     */
    @Test
    public void testObtenerEstado() {
        System.out.println("obtenerEstado");
        Radio instance = new Radio();
        String expResult = "fm";
        String result = instance.obtenerEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(!result.equals(expResult)){
            fail("The test case is a prototype.");
        }
        
    }
    
}
