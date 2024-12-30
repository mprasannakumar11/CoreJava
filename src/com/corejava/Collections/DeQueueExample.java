package com.corejava.Collections;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DeQueueExample {

    public static void main(String[] args) throws IOException {

        /*A resizable array implementation of the Deque interface.*/
        Deque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.addFirst("DD");
        arrayDeque.addLast("CC");
        arrayDeque.addLast("BB");
        arrayDeque.addLast("AA");
        System.out.println("ArrayDeque " + arrayDeque);

        /*Can also be used as a Deque by utilizing methods like addFirst, addLast, removeFirst, and removeLast.*/
        Deque<String> linkedListDeque = new LinkedList<>();
        linkedListDeque.addFirst("DD");
        linkedListDeque.addLast("CC");
        linkedListDeque.addLast("BB");
        linkedListDeque.addLast("AA");
        System.out.println("LinkedList " + linkedListDeque);

    }
}
