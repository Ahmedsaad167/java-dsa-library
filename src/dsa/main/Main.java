package dsa.main;

import dsa.queue.*;

public class Main {

    public static void main(String[] args) {

        QueueArray que = new QueueArray(5);
        que.enqueue(5);
        que.enqueue(12);
        que.enqueue(3);
        que.enqueue(4);
        que.enqueue(66);
        System.out.println(que.dequeue());
        System.out.println(que.peek());
        System.out.println(que.dequeue());
    }
}