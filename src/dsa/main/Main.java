package dsa.main;

import dsa.queue.LinkedQueue;

public class Main {

    public static void main(String[] args) {
        LinkedQueue queue = new LinkedQueue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.display();

        queue.dequeue();

        queue.display();
    }
}