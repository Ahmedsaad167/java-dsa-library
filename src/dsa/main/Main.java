package dsa.main;

import dsa.queue.*;

public class Main {

    public static void main(String[] args) {
        CircularQueueArray q = new CircularQueueArray(3);

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        q.dequeue();
        q.enqueue(4);

        System.out.println(q.peek());
    }
}