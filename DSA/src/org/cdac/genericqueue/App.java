package org.cdac.genericqueue;

public class App {
    public static void main(String[] args) {
        Queue<String> q = new ResizableArrayQueue<>(3);

        try {
			q.enqueue("A");
			q.enqueue("B");
	        q.enqueue("C");
	        q.enqueue("D");
		} catch (Exception e) {
			e.printStackTrace();
		}


        try {
			System.out.println("Front element: " + q.peek());
		} catch (Exception e) {
			e.printStackTrace();
		}

        while (!q.isEmpty()) {
            try {
				System.out.println("Dequeued: " + q.dequeue());
			} catch (Exception e) {
				e.printStackTrace();
			}
        }
    }
}
