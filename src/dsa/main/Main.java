package dsa.main;

import dsa.linkedlist.DoublyLinkedList;

public class Main {

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insertLast(10);
        list.insertLast(20);
        list.insertLast(30);

        list.insertAfter(30, 25);

        list.displayForward();
        list.displayBackward();
    }
}