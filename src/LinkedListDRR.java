/**
 * Created by Dustin Ryan-Roepsch on 9/15/2016.
 */
public class LinkedListDRR<E extends Comparable<E>> {
    Node<E> head;

    public LinkedListDRR() {
        head = null;
    }

    public void add(E element) {
        if (head == null) {
            head = new Node<E>(element);
        } else {
            Node<E> current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node<E> elementNode = new Node<E>(element);
            current.next = elementNode;
            elementNode.prev = current;
        }
    }

    @Override
    public String toString() {
        if (head == null) return "[]";
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        Node<E> current = head;
        while (current.next != null) {
            sb.append(current.value.toString());
            sb.append(',');
            current = current.next;
        }
        sb.append(current.value.toString());
        sb.append(']');
        return sb.toString();
    }
}
