package org.cdac.genericqueue;

public interface Queue<T> {
    void enqueue(T element) throws Exception;
    T dequeue() throws Exception;
    T peek() throws Exception;
    boolean isEmpty();
    boolean isFull();
}
