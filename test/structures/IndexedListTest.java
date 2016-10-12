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
public class IndexedListTest {
    
    public IndexedListTest() {
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
     * Test of add method, of class IndexedList.
     */
    @Test
    public void testAdd_0args() {
        System.out.println("add");
        IndexedList instance = new IndexedList();
        instance.add();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class IndexedList.
     */
    @Test
    public void testRemove_0args() {
        System.out.println("remove");
        IndexedList instance = new IndexedList();
        instance.remove();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contains method, of class IndexedList.
     */
    @Test
    public void testContains_0args() {
        System.out.println("contains");
        IndexedList instance = new IndexedList();
        instance.contains();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class IndexedList.
     */
    @Test
    public void testGet_0args() {
        System.out.println("get");
        IndexedList instance = new IndexedList();
        instance.get();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class IndexedList.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        IndexedList instance = new IndexedList();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reset method, of class IndexedList.
     */
    @Test
    public void testReset() {
        System.out.println("reset");
        IndexedList instance = new IndexedList();
        instance.reset();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class IndexedList.
     */
    @Test
    public void testAdd_GenericType() {
        System.out.println("add");
        Object element = null;
        IndexedList instance = new IndexedList();
        instance.add(element);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class IndexedList.
     */
    @Test
    public void testRemove_GenericType() throws Exception {
        System.out.println("remove");
        Object element = null;
        IndexedList instance = new IndexedList();
        Object expResult = null;
        Object result = instance.remove(element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contains method, of class IndexedList.
     */
    @Test
    public void testContains_GenericType() {
        System.out.println("contains");
        Object element = null;
        IndexedList instance = new IndexedList();
        boolean expResult = false;
        boolean result = instance.contains(element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class IndexedList.
     */
    @Test
    public void testGet_GenericType() {
        System.out.println("get");
        Object element = null;
        IndexedList instance = new IndexedList();
        Object expResult = null;
        Object result = instance.get(element);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hasNext method, of class IndexedList.
     */
    @Test
    public void testHasNext() {
        System.out.println("hasNext");
        IndexedList instance = new IndexedList();
        boolean expResult = false;
        boolean result = instance.hasNext();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNext method, of class IndexedList.
     */
    @Test
    public void testGetNext() {
        System.out.println("getNext");
        IndexedList instance = new IndexedList();
        Object expResult = null;
        Object result = instance.getNext();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class IndexedList.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        IndexedList instance = new IndexedList();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class IndexedList.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        IndexedList instance = new IndexedList();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
