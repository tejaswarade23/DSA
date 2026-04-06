package org.cdac.queue;

import java.util.NoSuchElementException;

public class FixedSizeQueue implements Queue {
    private int[] arr;
    private int front;
    private int rear;
    private int size;

    public FixedSizeQueue(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be positive");
        }
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    @Override
    public void enqueue(int element) throws Exception {
        if (isFull()) {
            throw new Exception("Queue is full");
        }
        rear = (rear + 1) % arr.length;
        arr[rear] = element;
        size++;
    }

    @Override
    public int dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        int element = arr[front];
        front = (front + 1) % arr.length;
        size--;
        return element;
    }

    @Override
    public int peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return arr[front];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == arr.length;
    }
}
