/**
 * @author Nathan Su
 */
public class RemoveAtIndexOutOfBoundsException<E> extends DoublyLinkedList<E> {
    @Override
    public E remove(int index) {
        // Forces all removes to be within the bounds of the list
        return super.remove(Math.min(super.size() - 1, Math.max(0, index)));
    }
}
