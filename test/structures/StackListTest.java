/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structures;

import Exceptions.EmptyException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Atif Hassan
 */
public class StackListTest {
    
    /**
     *
     */
    public StackListTest() {
    }
    
    /**
     *
     */
    @BeforeClass
    public static void setUpClass() {
    }
    
    /**
     *
     */
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     *
     */
    @Before
    public void setUp() {
    }
    
    /**
     *
     */
    @After
    public void tearDown() {
    }

    /**
     * Test of push method, of class StackList.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        StackList instance = new StackList();
        instance.push("greg");
        instance.push("ed");
        instance.push("matt");
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of top method, of class StackList.
     * @throws java.lang.Exception
     */
    @Test
    public void testTop() throws Exception {
        System.out.println("top");
        StackList instance = new StackList();
        instance.push("greg");
        instance.push("ed");
        instance.push("matt");
        Object expResult = "matt";
        Object result = instance.top();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of pop method, of class StackList.
     * @throws java.lang.Exception
     */
    @Test
    public void testPop() throws Exception {
        System.out.println("pop");
        StackList instance = new StackList();
        instance.push("greg");
        instance.push("ed");
        instance.push("matt");
        Object expResult = "matt";
        Object result = instance.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class StackList.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        StackList instance = new StackList();
        instance.push("greg");
        instance.push("ed");
        instance.push("matt");
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class StackList.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        StackList instance = new StackList();
        instance.push("greg");
        instance.push("ed");
        instance.push("matt");
        try {
            instance.pop();
        } catch (EmptyException ex) {
            Logger.getLogger(StackListTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        int expResult = 2;
        int result = instance.Size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class StackList.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        StackList instance = new StackList();
        instance.push("greg");
        String expResult = "greg";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isFull method, of class StackList.
     */
    @Test
    public void testIsFull() {
        System.out.println("isFull");
        StackList instance = new StackList();
        boolean expResult = false;
        boolean result = instance.isFull();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
