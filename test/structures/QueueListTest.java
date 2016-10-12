/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structures;

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
public class QueueListTest {
    
    public QueueListTest() {
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
     * Test of Enqueue method, of class QueueList.
     */
    @Test
    public void testEnqueue() throws Exception {
        System.out.println("Enqueue");
        Object element = null;
        QueueList instance = new QueueList();
        instance.Enqueue(element);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Dequeue method, of class QueueList.
     */
    @Test
    public void testDequeue() throws Exception {
        System.out.println("Dequeue");
        QueueList instance = new QueueList();
        Object expResult = null;
        Object result = instance.Dequeue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class QueueList.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        QueueList instance = new QueueList();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isFull method, of class QueueList.
     */
    @Test
    public void testIsFull() {
        System.out.println("isFull");
        QueueList instance = new QueueList();
        boolean expResult = false;
        boolean result = instance.isFull();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class QueueList.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        QueueList instance = new QueueList();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class QueueList.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        QueueList instance = new QueueList();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
