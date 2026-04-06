package org.cdac.genericqueue;

import java.util.NoSuchElementException;

public class ResizableArrayQueue<T> implements Queue<T> {
    private T[] arr;
    private int front;
    private int rear;
    private int size;

    @SuppressWarnings("unchecked")
    public ResizableArrayQueue(int initialCapacity) {
        if (initialCapacity <= 0) {
            throw new IllegalArgumentException("Capacity must be positive");
        }
        arr = (T[]) new Object[initialCapacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    @Override
    public void enqueue(T element) {
        if (isFull()) {
            resize();
        }
        rear = (rear + 1) % arr.length;
        arr[rear] = element;
        size++;
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        T element = arr[front];
        arr[front] = null; // optional: helps garbage collection
        front = (front + 1) % arr.length;
        size--;
        return element;
    }

    @Override
    public T peek() {
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

    @SuppressWarnings("unchecked")
    private void resize() {
        int newCapacity = arr.length * 2;
        T[] newArr = (T[]) new Object[newCapacity];

        // Copy elements in correct order
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[(front + i) % arr.length];
        }

        arr = newArr;
        front = 0;
        rear = size - 1;
    }
}
