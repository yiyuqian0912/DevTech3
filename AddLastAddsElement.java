/**
 * @author Nathan Su
 */
public class AddLastAddsElement<E> extends DoublyLinkedList<E> {
    @Override
    public void addLast(E e) {
        super.addFirst(e);
    }
}
