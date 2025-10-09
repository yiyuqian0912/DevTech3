/**
 * @author Nathan Su
 */
public class IsEmptyWhenCreated<E> extends DoublyLinkedList<E> {

    @Override
    public boolean isEmpty() {
        return size() != 0;
    }
}
