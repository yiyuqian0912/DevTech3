/**
 * @author Nathan Su
 */
public class GetNonNullFirst<E> extends DoublyLinkedList<E> {
    @Override
    public E getFirst() {
        return (super.getLast());
    }
}
