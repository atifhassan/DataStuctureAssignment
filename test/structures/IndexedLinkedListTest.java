/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structures;

import Exceptions.OutOfBoundsException;
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
public class IndexedLinkedListTest {
    
    /**
     *
     */
    public IndexedLinkedListTest() {
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
     * Test of add method, of class IndexedLinkedList.
     * @throws java.lang.Exception
     */
    @Test
    public void testAdd() throws Exception {
        System.out.println("add");
        IndexedLinkedList tester = new IndexedLinkedList();
        tester.add("Ed", 0);
        tester.add("Matt", 0);
        tester.add("Pete", 1);
        tester.add("John", 2);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of set method, of class IndexedLinkedList.
     * @throws java.lang.Exception
     */
    @Test
    public void testSet() throws Exception {
        System.out.println("set");
        IndexedLinkedList tester = new IndexedLinkedList();
        tester.add("Ed", 0);
        tester.add("Matt", 0);
        tester.add("Pete", 1);
        tester.add("John", 2);
        tester.set("Greg", 2);
        Object expResult = "Matt Pete Greg Ed ";
        Object result = tester.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class IndexedLinkedList.
     * @throws java.lang.Exception
     */
    @Test
    public void testRemove() throws Exception {
        System.out.println("remove");
        IndexedLinkedList tester = new IndexedLinkedList();
        tester.add("Ed", 0);
        tester.add("Matt", 0);
        tester.add("Pete", 1);
        tester.add("John", 2);
        tester.set("Greg", 2);
        Object expResult = "Greg";
        Object result = tester.remove(2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of indexOf method, of class IndexedLinkedList.
     * @throws java.lang.Exception
     */
    @Test
    public void testIndexOf() throws Exception {
        System.out.println("indexOf");
        String element = null;
         IndexedLinkedList tester = new IndexedLinkedList();
        tester.add("Ed", 0);
        tester.add("Matt", 0);
        tester.add("Pete", 1);
        tester.add("John", 2);
        tester.set("Greg", 2);
        int expResult = 2;
        int result = tester.indexOf("Greg");
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class IndexedLinkedList.
     * @throws java.lang.Exception
     */
    @Test
    public void testGet() throws Exception {
        System.out.println("get");
        IndexedLinkedList tester = new IndexedLinkedList();
        tester.add("Ed", 0);
        tester.add("Matt", 0);
        tester.add("Pete", 1);
        tester.add("John", 2);
        tester.set("Greg", 2);
        Object expResult = "Greg";
        Object result = tester.get(2);
        System.out.print(tester.toString());
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of contains method, of class IndexedLinkedList.
     * @throws Exceptions.OutOfBoundsException
     */
    @Test
    public void testContains() throws OutOfBoundsException {
        System.out.println("contains");
        IndexedLinkedList tester = new IndexedLinkedList();
        tester.add("Ed", 0);
        tester.add("Matt", 0);
        tester.add("Pete", 1);
        tester.add("John", 2);
        boolean expResult = true;
        boolean result = tester.contains("John");
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class IndexedLinkedList.
     * @throws Exceptions.OutOfBoundsException
     */
    @Test
    public void testIsEmpty() throws OutOfBoundsException {
        System.out.println("isEmpty");
        IndexedLinkedList tester = new IndexedLinkedList();
        tester.add("Ed", 0);
        tester.add("Matt", 0);
        tester.add("Pete", 1);
        tester.add("John", 2);
        boolean expResult = false;
        boolean result = tester.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class IndexedLinkedList.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        IndexedLinkedList instance = new IndexedLinkedList();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of reset method, of class IndexedLinkedList.
     * @throws Exceptions.OutOfBoundsException
     */
    @Test
    public void testReset() throws OutOfBoundsException {
        System.out.println("reset");
        IndexedLinkedList tester = new IndexedLinkedList();
        tester.add("Ed", 0);
        tester.add("Matt", 0);
        tester.add("Pete", 1);
        tester.add("John", 2);
        tester.reset();
        String expResult = "";
        String result = tester.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNext method, of class IndexedLinkedList.
     * @throws java.lang.Exception
     */
    @Test
    public void testGetNext() throws Exception {
        System.out.println("getNext");
        IndexedLinkedList tester = new IndexedLinkedList();
        tester.add("Ed", 0);
        tester.add("Matt", 0);
        tester.add("Pete", 1);
        tester.add("John", 0);
        Object expResult = "Pete";
        Object result = tester.getNext();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of hasNext method, of class IndexedLinkedList.
     */
    @Test
    public void testHasNext() {
        System.out.println("hasNext");
        IndexedLinkedList instance = new IndexedLinkedList();
        boolean expResult = false;
        boolean result = instance.hasNext();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class IndexedLinkedList.
     * @throws Exceptions.OutOfBoundsException
     */
    @Test
    public void testToString() throws OutOfBoundsException {
        System.out.println("toString");
        IndexedLinkedList tester = new IndexedLinkedList();
        tester.add("Ed", 0);
        tester.add("Matt", 0);
        tester.add("Pete", 1);
        tester.add("John", 2);
        String expResult = "Matt Pete John Ed ";
        String result = tester.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
