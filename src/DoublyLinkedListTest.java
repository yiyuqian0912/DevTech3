import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class DoublyLinkedListTest {
    /**
     * Use this to toggle between using the DoublyLinkedList class and your broken classes
     * You may submit with either true or false.
     */
    boolean SHOULD_FAIL = false;

    private DoublyLinkedList<Integer> list;

    @BeforeEach
    public void setUp() {
        list = new DoublyLinkedList<>();
    }

    // Tests for get
    /**
     * @author Yiyu Qian
     * @see GetAtOutOfBoundsThrowsException
     */
    @Test
    public void testGetAtOutOfBoundsThrowsException() {
        if (SHOULD_FAIL) list = new GetAtOutOfBoundsThrowsException<>();

        list.addLast(1);
        list.addLast(2);
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(3));
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(-1));
    }

    /**
     * @author Nathan Su
     * @see
     */
    @Test
    public void testGetAtIndex() {
        list.addLast(1);
        list.addLast(2);
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
    }

    // Tests for getFirst
    /**
     * @author Yiyu Qian
     * @see
     */
    @Test
    public void testGetNonNullFirst() {
        list.addLast(1);
        list.addLast(2);
        assertEquals(1, list.getFirst());
    }

    /**
     * @author Nathan Su
     * @see
     */
    @Test
    public void testGetFirstThrowsException() {
        assertThrows(NoSuchElementException.class, () -> list.getFirst());
    }

    // Tests for getLast
    /**
     * @author Yiyu Qian
     * @see
     */
    @Test
    public void testGetNonNullLast() {
        list.addLast(1);
        list.addLast(2);
        assertEquals(2, list.getLast());
    }

    /**
     * @author Nathan Su
     * @see
     */
    @Test
    public void testGetLastThrowsException() {
        assertThrows(NoSuchElementException.class, () -> list.getLast());
    }

    // Tests for isEmpty
    /**
     * @author Yiyu Qian
     * @see
     */
    @Test
    public void testIsEmptyWhenCreated() {
        assertTrue(list.isEmpty());
        list.addLast(1);
        assertFalse(list.isEmpty());
    }

    // Tests for add
    /**
     * @author Nathan Su
     * @see
     */
    @Test
    public void testAddAtIndexOutOfBoundsThrowsException() {
        list.addLast(1);
        list.addLast(2);
        assertThrows(IndexOutOfBoundsException.class, () -> list.add(3, 1));
        assertThrows(IndexOutOfBoundsException.class, () -> list.add(-1, 5));
    }

    /**
     * @author Yiyu Qian
     * @see
     */
    @Test
    public void testAddAtLegalIndex() {
        list.add(0, 1);
        assertEquals(1, list.getFirst());
        list.add(1, 2);
        assertEquals(2, list.getLast());
        list.add(1, 5);
        assertEquals(5, list.get(1));
    }

    // Tests for addFirst
    /**
     * @author Nathan Su
     * @see
     */
    @Test
    public void testAddFirstAddsElement() {
        list.addFirst(1);
        list.addFirst(2);
        assertEquals(2, list.getFirst());
        assertEquals(1, list.getLast());
    }

    // Tests for addLast
    /**
     * @author Yiyu Qian
     * @see
     */
    @Test
    public void testAddLastAddsElement() {
        list.addLast(1);
        list.addLast(2);
        assertEquals(1, list.getFirst());
        assertEquals(2, list.getLast());
    }

    // Tests for remove

    /**
     * @author Nathan Su
     * @see
     */
    @Test
    public void testRemoveAtIndex() {
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);

        list.remove(2);

        assertEquals(2, list.getLast());
    }

    // Tests for removeFirst
    /**
     * @author Yiyu Qian
     * @see
     */
    @Test
    public void testRemoveFirst() {
        list.addLast(1);
        list.addLast(2);

        list.removeFirst();

        assertEquals(2, list.getFirst());
    }

    // Tests for removeLast
    /**
     * @author Nathan Su
     * @see
     */
    @Test
    public void testRemoveLast() {
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);

        list.removeLast();

        assertEquals(2, list.getLast());
    }

    // Tests for size
    /**
     * @author Yiyu Qian
     * @see
     */
    @Test
    public void testSizeEmpty() {
        assertEquals(0, list.size());
    }

    /**
     * @author Nathan Su
     * @see
     */
    @Test
    public void testSizeAfterAdd() {
        list.addLast(1);

        assertEquals(1, list.size());
    }

    // Tests for set
    /**
     * @author Yiyu Qian
     * @see
     */
    @Test
    public void testSet() {
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);

        list.set(2, 4);

        assertEquals(4, list.get(2));
    }
}
