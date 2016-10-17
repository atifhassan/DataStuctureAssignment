/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structures;

import Exceptions.EmptyException;
import Exceptions.NullElementException;
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
public class LinkedListTest {

    /**
     *
     */
    public LinkedListTest() {
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
     * Test of add method, of class LinkedList.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        LinkedList<String> tester = new LinkedList<>();
        tester.add("C");
        tester.add("A");
        tester.add("D");
        tester.add("B");
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class LinkedList.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        LinkedList<String> tester = new LinkedList<>();
        tester.add("C");
        tester.add("A");
        tester.add("D");
        tester.add("B");
        boolean expResult = false;
        boolean result = tester.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class LinkedList.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        LinkedList<String> tester = new LinkedList<>();
        tester.add("C");
        tester.add("A");
        tester.add("D");
        tester.add("B");
        String expResult = "A B C D ";
        String result = tester.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class LinkedList.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testRemove() throws Exception {
        System.out.println("remove");
        LinkedList<String> tester = new LinkedList<>();
        tester.add("C");
        tester.add("A");
        tester.add("D");
        tester.add("B");
        Object expResult = "B";
        Object result = tester.remove("B");
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of contains method, of class LinkedList.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        LinkedList<String> tester = new LinkedList<>();
        tester.add("C");
        tester.add("A");
        tester.add("D");
        tester.add("B");
        boolean expResult = true;
        boolean result = tester.contains("C");
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class LinkedList.
     *
     * @throws Exceptions.EmptyException
     * @throws Exceptions.NullElementException
     */
    @Test
    public void testGet() throws EmptyException, NullElementException {
        System.out.println("get");
        LinkedList<String> tester = new LinkedList<>();
        tester.add("C");
        tester.add("A");
        tester.add("D");
        tester.add("B");
        Object expResult = "D";
        Object result = tester.get("D");
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class LinkedList.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        LinkedList<String> tester = new LinkedList<>();
        tester.add("C");
        tester.add("A");
        tester.add("D");
        tester.add("B");
        int expResult = 4;
        int result = tester.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of reset method, of class LinkedList.
     */
    @Test
    public void testReset() {
        System.out.println("reset");
        LinkedList instance = new LinkedList();
        instance.reset();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNext method, of class LinkedList.
     */
    @Test
    public void testGetNext() {
        System.out.println("getNext");
         LinkedList<String> tester = new LinkedList<>();
        tester.add("C");
        tester.add("A");
        tester.add("D");
        tester.add("B");
        Object expResult = "D";
        Object result = tester.getNext();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of hasNext method, of class LinkedList.
     */
    @Test
    public void testHasNext() {
        System.out.println("hasNext");
         LinkedList<String> tester = new LinkedList<>();
        tester.add("C");
        tester.add("A");
        tester.add("D");
        boolean expResult = false;
        boolean result = tester.hasNext();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
