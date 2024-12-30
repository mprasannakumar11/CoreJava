package com.corejava.Collections;

import java.io.IOException;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterfaceExample {

    public static void main(String[] args) throws IOException {

        /*A priority heap implementation of the Queue interface.
        It orders elements according to their natural order or a custom comparator. */
        Queue<String> priorityQueue = new PriorityQueue<>();

        priorityQueue.add("DD");
        priorityQueue.add("CC");
        priorityQueue.add("BB");
        priorityQueue.add("AA");

        System.out.println(priorityQueue);

        /*Can also be used as a Queue by utilizing methods like offer, poll, and peek.*/
        Queue<String> linkedListQueue = new LinkedList<>();
        linkedListQueue.add("DD");
        linkedListQueue.add("BB");
        linkedListQueue.add("CC");
        linkedListQueue.add("AA");

        System.out.println(linkedListQueue);



    }
}
