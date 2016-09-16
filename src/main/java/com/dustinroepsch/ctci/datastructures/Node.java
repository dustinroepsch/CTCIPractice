package com.dustinroepsch.ctci.datastructures;

/**
 * Created by Dustin Ryan-Roepsch on 9/15/2016.
 */
public class Node<E> {
    public Node<E> next;
    public Node<E> prev;
    public E value;


    public Node(E value) {
        this.value = value;
    }
}
