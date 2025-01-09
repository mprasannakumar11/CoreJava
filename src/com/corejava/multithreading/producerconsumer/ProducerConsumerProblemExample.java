package com.corejava.multithreading.producerconsumer;


/* The Producer-Consumer problem is a classic example of a multi-threading synchronization problem.
It involves two types of threads, the producer and the consumer, which share a common bounded buffer.
The producer generates data and puts it into the buffer, while the consumer takes data from the buffer.
The challenge is to ensure that the producer does not add data to the buffer when it is full,
and the consumer does not take data from the buffer when it is empty.
 */
public class ProducerConsumerProblemExample {
    public static void main(String[] args) {
        Buffer buffer = new Buffer(5); // Buffer capacity of 5

        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();
    }
}

/*Key Points:
The Buffer class ensures synchronized access to the shared buffer, preventing race conditions.

The Producer and Consumer classes implement the Runnable interface, allowing them to be executed in separate threads.

The wait() and notifyAll() methods are used to manage synchronization between the producer and consumer threads.*/
