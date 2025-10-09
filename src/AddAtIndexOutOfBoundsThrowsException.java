/**
 * @author Yiyu Qian
 */
public class AddAtIndexOutOfBoundsThrowsException<E> extends DoublyLinkedList<E> {
  @Override
  public void add(int index, E element) {
    super.add(0, element);
  }
}
