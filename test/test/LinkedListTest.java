package test;

import linkedList.*;
import org.junit.*;

import static org.junit.Assert.*;

public class LinkedListTest {
    private ILinkedList l;

    @Before
    public void setUp() throws Exception {
        l = new LinkedList();
    }

    @Test
    public void testListCreation(){
        assertEquals(0, l.size());
        assertTrue(l.isEmpty());
    }

    @Test
    public void testAddElementAtStart(){
        l.addFirst("abc");
        l.addFirst(3.4);
        assertEquals(0, l.indexOf(3.4));
        assertEquals(1, l.indexOf("abc"));
    }

    @Test
    public void testAddElementAtEnd(){
        l.addLast("abc");
        l.addLast(3.4);
        assertEquals(1, l.indexOf(3.4));
        assertEquals(0, l.indexOf("abc"));
    }

    @Test
    public void testInclude(){
        l.addFirst("abc");
        assertTrue(l.includes("abc"));
        assertFalse(l.includes(1));
    }

    @Test
    public void testExtractElementFromStart(){
        l.addFirst("abc");
        l.addFirst(3.4);
        Object anObject = l.extractFirst();
        assertEquals(3.4, anObject);
    }

    @Test
    public void testExtractElementFromEnd(){
        l.addFirst("abc");
        l.addFirst(3.4);
        Object anObject = l.extractLast();
        assertEquals("abc", anObject);
    }
}