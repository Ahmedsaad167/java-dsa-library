package dsa.linkedlist;

public class SinglyLinkedList {
    private Node first;

    public void insertFirst(int data) {
        Node newData = new Node(data);
        newData.next = first;
        first = newData;
    }

    public int deleteFirst() {
        if (isEmpty())
            throw new IllegalStateException("List is Empty!!");
        int temp = first.data;
        first = first.next;
        return temp;
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
