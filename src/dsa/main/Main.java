package dsa.main;

import dsa.linkedlist.DoublyLinkedList;
import dsa.linkedlist.SinglyLinkedList;

public class Main {

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insertFirst(10);
        list.insertLast(20);
        list.insertLast(30);

        list.displayForward();
        list.displayBackward();
    }
}