/**
 * @author Yiyu Qian
 */
public class AddAtIndexOutOfBoundsThrowsException<E> extends DoublyLinkedList<E> {
  @Override
  public add(int index, E element) {
    super.add(0, element);
  }
}
