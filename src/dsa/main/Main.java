package dsa.main;

import dsa.linkedlist.SinglyLinkedList;

public class Main {

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.insertLast(10);
        list.insertLast(20);
        list.insertLast(30);

        list.delete(20);

        list.display();
    }
}