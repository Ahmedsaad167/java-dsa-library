package dsa.queue;

import dsa.linkedlist.DoublyLinkedList;

public class LinkedQueue {
    private DoublyLinkedList list;

    public LinkedQueue() {
        list = new DoublyLinkedList();
    }

    public void enqueue(int value) {
        list.insertLast(value);
    }

    public int dequeue() {
        return list.deleteFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void display() {
        list.displayForward();
    }
}
