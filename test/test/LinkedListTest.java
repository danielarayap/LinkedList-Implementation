package test;

import minitarea1.*;
import org.junit.*;

import static org.junit.Assert.*;

public class LinkedListTest {
    private ILinkedList l;

    @Before
    public void setUp() throws Exception {
        l = new LinkedList();
    }

    @Test
    public void testDefault(){
        assertTrue(l.isEmpty());
        assertEquals(0, l.size());
    }


    @Test
    public void adding() {
        l.addFirst(42);
        l.addFirst("Happy World");
        l.addFirst('c');
        l.addFirst(Math.PI);
        assertEquals(3,l.indexOf(42));
        assertFalse(l.isEmpty());
        assertEquals(4, l.size());
        assertTrue(l.includes("Happy World"));
        assertTrue(l.includes(42));
        assertFalse(l.includes(43));
        l.addLast(43);
        l.addLast('k');
        assertEquals(4, l.indexOf(43));
        assertEquals(6, l.size());
    }

}
