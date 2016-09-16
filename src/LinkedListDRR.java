/**
 * Created by Dustin Ryan-Roepsch on 9/15/2016.
 */
public class LinkedListDRR<E extends Comparable<E>> {
    private Node<E> head;
    private int size;

    public LinkedListDRR() {
        head = null;
        size = 0;
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
        size++;
    }

    public E get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
    }

    public void remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        if (current.prev == null && current.next == null) {
            head = null;
        } else if (current.prev == null) {
            head = current.next;
            head.prev = null;
        } else if (current.next == null) {
            current.prev.next = null;
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
        size--;
    }

    public int size() {
        return size;
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
