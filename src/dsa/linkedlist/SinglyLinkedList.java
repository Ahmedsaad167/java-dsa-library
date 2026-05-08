package dsa.linkedlist;

public class SinglyLinkedList {
    private Node first;

    public void insertFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = first;
        first = newNode;
    }

    public int deleteFirst() {
        if (isEmpty())
            throw new IllegalStateException("List is Empty!!");
        int temp = first.data;
        first = first.next;
        return temp;
    }

    public void insertLast(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            first = newNode;
            return;
        }

        Node current = first;
        while (current.next != null)
            current = current.next;
        current.next = newNode;
    }

    public Node find(int key) {
        Node current = first;
        while (current != null) {
            if (current.data == key)
                return current;
            current = current.next;
        }
        return null;
    }

    public Node delete(int key) {
        if (isEmpty())
            return null;
        Node previous = first;
        Node current = first;
        while (current.data != key) {
            if (current.next == null)
                return null;
            previous = current;
            current = current.next;
        }
        if (current == first)
            first = first.next;
        else
            previous.next = current.next;
        return current;

        
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void display() {
        System.out.print("List: ");
        Node current = first;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
