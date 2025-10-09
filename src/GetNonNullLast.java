/**
 * @author Nathan Su
 */
public class GetNonNullLast<E> extends DoublyLinkedList<E> {
    @Override
    public E getLast() {
        return (super.getFirst());
    }
}
