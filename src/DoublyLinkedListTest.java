import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class DoublyLinkedListTest {
    /**
     * Use this to toggle between using the DoublyLinkedList class and your broken classes
     * You may submit with either true or false.
     */
    boolean SHOULD_FAIL = true;

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
        if (SHOULD_FAIL) list = new GetAtIndex<>();

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
        if (SHOULD_FAIL) list = new GetNonNullFirst<>();

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
        if (SHOULD_FAIL) list = new GetFirstThrowsException<>();

        assertThrows(NoSuchElementException.class, () -> list.getFirst());
    }

    // Tests for getLast
    /**
     * @author Yiyu Qian
     * @see
     */
    @Test
    public void testGetNonNullLast() {
        if (SHOULD_FAIL) list = new GetNonNullLast<>();

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
        if (SHOULD_FAIL) list = new GetLastThrowsException<>();

        assertThrows(NoSuchElementException.class, () -> list.getLast());
    }

    // Tests for isEmpty
    /**
     * @author Yiyu Qian
     * @see
     */
    @Test
    public void testIsEmptyWhenCreated() {
        if (SHOULD_FAIL) list = new IsEmptyWhenCreated<>();

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
        if (SHOULD_FAIL) list = new AddAtIndexOutOfBoundsThrowsException<>();

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
        if (SHOULD_FAIL) list = new AddAtLegalIndex<>();

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
        if (SHOULD_FAIL) list = new AddFirstAddsElement<>();

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
        if (SHOULD_FAIL) list = new AddLastAddsElement<>();

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
        if (SHOULD_FAIL) list = new RemoveAtIndex<>();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);

        list.remove(2);

        assertEquals(2, list.removeLast());
    }

    /**
     * @author Yiyu Qian
     * @see
     */
    @Test
    public void testRemoveAtIndexOutOfBoundsException() {
        if (SHOULD_FAIL) list = new RemoveAtIndexOutOfBoundsException<>();

        list.addLast(1);
        list.addLast(2);

        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(2));
    }

    // Tests for removeFirst
    /**
     * @author Nathan Su
     * @see
     */
    @Test
    public void testRemoveFirst() {
        if (SHOULD_FAIL) list = new RemoveFirst<>();

        list.addLast(1);
        list.addLast(2);

        list.removeFirst();

        assertEquals(2, list.removeFirst());
    }

    /**
     * @author Yiyu Qian
     * @see
     */
    @Test
    public void testRemoveFirstThrowsException() {
        if (SHOULD_FAIL) list = new RemoveFirstThrowsException<>();

        assertThrows(NoSuchElementException.class, () -> list.removeFirst());
    }

    // Tests for removeLast
    /**
     * @author Nathan Su
     * @see
     */
    @Test
    public void testRemoveLast() {
        if (SHOULD_FAIL) list = new RemoveLast<>();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);

        list.removeLast();

        assertEquals(2, list.removeLast());
    }

    /**
     * @author Yiyu Qian
     * @see
     */
    @Test
    public void testRemoveLastThrowsException() {
        if (SHOULD_FAIL) list = new RemoveLastThrowsException<>();

        assertThrows(NoSuchElementException.class, () -> list.removeLast());
    }

    // Tests for size
    /**
     * @author Nathan Su
     * @see
     */
    @Test
    public void testSizeEmpty() {
        if (SHOULD_FAIL) list = new SizeEmpty<>();

        assertEquals(0, list.size());
    }

    /**
     * @author Yiyu Qian
     * @see
     */
    @Test
    public void testSizeAfterAdd() {
        if (SHOULD_FAIL) list = new SizeAfterAdd<>();

        list.addLast(1);

        assertEquals(1, list.size());
    }

    // Tests for set
    /**
     * @author Nathan Su
     * @see
     */
    @Test
    public void testSet() {
        if (SHOULD_FAIL) list = new Set<>();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);

        list.set(2, 4);

        assertEquals(4, list.get(2));
    }

    /**
     * @author Yiyu Qian
     * @see
     */
    @Test
    public void testSetOutOfBoundsException() {
        if (SHOULD_FAIL) list = new SetOutOfBoundsException<>();

        list.addLast(1);
        list.addLast(2);

        assertThrows(IndexOutOfBoundsException.class, () -> list.set(2, 4));
    }
}