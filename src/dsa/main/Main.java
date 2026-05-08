package dsa.main;

import dsa.linkedlist.SinglyLinkedList;

public class Main {

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);

        list.display();
    }
}