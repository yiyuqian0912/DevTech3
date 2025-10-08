/**
 * @author Yiyu Qian
 */
public class AddFirstAddsElement<E> extends DoublyLinkedList<E> {
  @Override
  public addFirst(E element) {
    super.addLast(element);
  }
}
