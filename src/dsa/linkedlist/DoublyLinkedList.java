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
