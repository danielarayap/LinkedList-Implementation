package test;

import minitarea1.*;
import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by Daniel Araya on 18-09-2017.
 */
public class LinkListTest {
    private ILinkList l;

    @Before
    public void setUp() throws Exception {
        l = new LinkList();
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
        assertEquals(2, l.size());
        assertTrue(l.includes("Happy World"));
        assertTrue(l.includes(42));
        assertFalse(l.includes(43));
    }


}
