/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structures;

import Exceptions.FullException;
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

//    /**
//     *
//     */
//    public QueueListTest() {
//    }
//
//    /**
//     *
//     */
//    @BeforeClass
//    public static void setUpClass() {
//    }
//
//    /**
//     *
//     */
//    @AfterClass
//    public static void tearDownClass() {
//    }
//
//    /**
//     *
//     */
//    @Before
//    public void setUp() {
//    }
//
//    /**
//     *
//     */
//    @After
//    public void tearDown() {
//    }

    /**
     * Test of Enqueue method, of class QueueList.
     * @throws java.lang.Exception
     */
    @Test
    public void testEnqueue() throws Exception {
        System.out.println("Enqueue");
        QueueList instance = new QueueList();
        instance.Enqueue("greg");
        instance.Enqueue("ed");
        instance.Enqueue("matt");
        String expResult = "[greg, ed, matt, null, null, null, null, null, null, null]";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Dequeue method, of class QueueList.
     * @throws java.lang.Exception
     */
    @Test
    public void testDequeue() throws Exception {
        System.out.println("Dequeue");
        QueueList instance = new QueueList();
        instance.Enqueue("greg");
        instance.Enqueue("ed");
        instance.Enqueue("matt");
        Object expResult = "greg";
        Object result = instance.Dequeue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class QueueList.
     * @throws java.lang.Exception
     */
    @Test
    public void testToString() throws Exception {
        System.out.println("toString");
        QueueList instance = new QueueList();
        instance.Enqueue("greg");
        instance.Enqueue("ed");
        instance.Enqueue("matt");
        instance.Dequeue();
        String expResult = "[null, ed, matt, null, null, null, null, null, null, null]";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isFull method, of class QueueList.
     * @throws Exceptions.FullException
     */
    @Test
    public void testIsFull() throws FullException {
        System.out.println("isFull");
        QueueList instance = new QueueList();
        instance.Enqueue("greg");
        instance.Enqueue("ed");
        instance.Enqueue("matt");
        boolean expResult = false;
        boolean result = instance.isFull();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class QueueList.
     * @throws Exceptions.FullException
     */
    @Test
    public void testIsEmpty() throws FullException {
        System.out.println("isEmpty");
        QueueList instance = new QueueList();
        instance.Enqueue("greg");
        instance.Enqueue("ed");
        instance.Enqueue("matt");
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class QueueList.
     * @throws Exceptions.FullException
     */
    @Test
    public void testSize() throws FullException {
        System.out.println("size");
        QueueList instance = new QueueList();
        instance.Enqueue("greg");
        instance.Enqueue("ed");
        instance.Enqueue("matt");
        int expResult = 3;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
