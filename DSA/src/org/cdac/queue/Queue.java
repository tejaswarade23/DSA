package org.cdac.queue;

public interface Queue {
    void enqueue(int element) throws Exception;
    int dequeue() throws Exception;
    int peek() throws Exception;
    boolean isEmpty();
    boolean isFull();
}
