package com.dustinroepsch.ctci.datastructures;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

/**
 * Created by Dustin Ryan-Roepsch on 9/16/2016.
 */
public class LinkedListDRRTest {
    @Test
    public void testInitialSize() {
        LinkedListDRR<Integer> list = new LinkedListDRR<Integer>();
        assertEquals(0, list.size());
    }

    @Test
    public void testSize5Elements() {
        LinkedListDRR<Integer> list = new LinkedListDRR<Integer>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        assertEquals(5, list.size());
    }

    @Test
    public void testSize5ElementsAfterRemoval() {
        LinkedListDRR<Integer> list = new LinkedListDRR<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        for (int i = 0; i < 5; i++) {
            list.remove(0);
        }
        assertEquals(5, list.size());
    }

    @Test
    public void testAdd() {
        LinkedListDRR<String> list = new LinkedListDRR<String>();
        list.add("Hello");
        assertEquals("Hello", list.get(0));
    }

    @Test
    public void testAddMultiple() {
        LinkedListDRR<String> list = new LinkedListDRR<String>();
        list.add("Hello");
        list.add("World");
        assertTrue(list.get(0).equals("Hello") && list.get(1).equals("World"));
    }

    @Test
    public void testRemove() {
        LinkedListDRR<String> list = new LinkedListDRR<String>();
        list.add("Hello");
        list.remove(0);
        assertEquals(0, list.size());
    }

    @Test
    public void testRemoveMultiple() {
        LinkedListDRR<String> list = new LinkedListDRR<String>();
        list.add("Hello");
        list.add("My");
        list.add("Name");
        list.add("is");
        list.add("Dustin");
        list.remove(0);
        list.remove(2);
        assertTrue(
                list.get(0).equals("My") &&
                        list.get(1).equals("Name") &&
                        list.get(2).equals("Dustin") &&
                        list.size() == 3
        );
    }

}