package dsa.main;

import dsa.queue.priorityqueue.PriorityQueueArray;

public class Main {

    public static void main(String[] args) {
        PriorityQueueArray pq = new PriorityQueueArray(10);

        pq.insert(30);
        pq.insert(10);
        pq.insert(50);
        pq.insert(20);

        pq.display();

        System.out.println(pq.remove());

        pq.display();
    }
}