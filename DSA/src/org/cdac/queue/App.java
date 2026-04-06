package org.cdac.queue;

public class App {
    public static void main(String[] args) {
        Queue q = new FixedSizeQueue(3);

        try {
            q.enqueue(10);
            q.enqueue(20);
            q.enqueue(30);

            System.out.println("Front element: " + q.peek());

            while (!q.isEmpty()) {
                System.out.println("Dequeued: " + q.dequeue());
            }

            // Uncomment to see exception
            // q.dequeue();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

