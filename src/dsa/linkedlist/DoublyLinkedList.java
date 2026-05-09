package dsa.linkedlist;

public class DoublyLinkedList {
    private DoublyNode first;
    private DoublyNode last;

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int value) {
        DoublyNode newNode = new DoublyNode(value);
        if (isEmpty())
            last = newNode;
        else {
            newNode.next = first;

            first.previous = newNode;
        }

        first = newNode; 
    }

    public void insertLast(int value) {
        DoublyNode newNode = new DoublyNode(value);
        if (isEmpty())
            first = newNode;
        else {
            last.next = newNode;
            newNode.previous = last;
        }
        last = newNode;
    }

    public int deleteFirst() {
        if (isEmpty())
            throw new IllegalStateException("List is Empty!!");
        int temp = first.data;
        if (first.next == null)
            last = null;
        else {
            first.next.previous = null;
        }
        first = first.next;
        return temp;
    }

    public int deleteLast() {
        if (isEmpty())
            throw new IllegalStateException("List is Empty!!");
        int temp = last.data;
        if (last.previous == null)
            first = null;
        else {
            last.previous.next = null;
        }
        last = last.previous;
        return temp;
    }

    public boolean insertAfter(int key, int data) {
        DoublyNode current = first;
        while (current != null && current.data != key)
            current = current.next;
        if (current == null)
            return false;
        DoublyNode newNode = new DoublyNode(data);
        if (current == last) {
            last = newNode;
        }
        else {
            newNode.next = current.next;
            current.next.previous = newNode;
        }
        newNode.previous = current;
        current.next = newNode;
        return true;
    }

    public void displayForward() {
        DoublyNode current = first;
        System.out.print("List (First to Last): ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void displayBackward() {
        DoublyNode current = last;
        System.out.print("List (Last to First): ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.previous;
        }
        System.out.println("null");
    }
}
