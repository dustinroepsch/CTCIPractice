/**
 * Created by Dustin Ryan-Roepsch on 9/15/2016.
 */
public class Node<E> {
    public Node next;
    public Node prev;
    public E value;


    public Node(E value) {
        this.value = value;
    }
}
