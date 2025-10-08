/**
 * @author Yiyu Qian
 */
public class RemoveAtIndex<E> extends DoublyLinkedList<E> {
  @Override
  public E remove(int index) {
    return super.removeFirst();
  }
}
