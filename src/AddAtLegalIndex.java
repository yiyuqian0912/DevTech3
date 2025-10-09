/**
 * @author Nathan Su
 */
public class AddAtLegalIndex<E> extends DoublyLinkedList<E> {
    @Override
    public void add(int index, E element) {
        super.addFirst(element);
    }
}
