/**
 * @author Yiyu Qian
 */
public class GetAtIndex<E> extends DoublyLinkedList<E> {
  @Override
  public E get(int index) {
    // Forces all gets to be within the bounds of the list
    return super.getFirst();
  }
}
