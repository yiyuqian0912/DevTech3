/**
 * @author Nathan Su
 */
public class SetOutOfBoundsException<E> extends DoublyLinkedList<E> {
    @Override
    public E set(int index, E element) {
        return super.set(0, element);
    }
}
