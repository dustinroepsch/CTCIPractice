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
}