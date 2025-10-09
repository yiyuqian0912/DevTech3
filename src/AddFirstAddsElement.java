/**
 * @author Yiyu Qian
 */
public class AddFirstAddsElement<E> extends DoublyLinkedList<E> {
  @Override
  public void addFirst(E element) {
    super.addLast(element);
  }
}
