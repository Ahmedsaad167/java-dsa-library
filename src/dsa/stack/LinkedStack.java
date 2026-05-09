package dsa.stack;

import dsa.linkedlist.SinglyLinkedList;

public class LinkedStack {
    private SinglyLinkedList list;

    public LinkedStack() {
        list = new SinglyLinkedList();
    }

    public void push(int data) {
        list.insertFirst(data);
    }

    public int pop() {
        return list.deleteFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void display() {
        list.display();
    }
}
