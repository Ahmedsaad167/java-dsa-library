package dsa.hash.chain;

public class SortedList {
    private HashNode first;

    public boolean isEmpty() {
        return first == null;
    }

    public void insert(int value) {
        HashNode newNode = new HashNode(value);
        HashNode previous = null;
        HashNode current = first;
        while (current != null && value > current.data) {
            previous = current;
            current = current.next;
        }
        if (previous == null)
            first = newNode;
        else
            previous.next = newNode;
        newNode.next = current;
    }

    public boolean delete(int key) {
        if (isEmpty())
            return false;
        HashNode previous = null;
        HashNode current = first;
        while (current != null && current.data != key) {
            previous = current;
            current = current.next;
        }
        if (current == null)
            return false;
        if (previous == null)
            first = first.next;
        else
            previous.next = current.next;
        return true;
    }

    public boolean find(int key) {
        HashNode current = first;
        while (current != null && current.data <= key) {
            if (current.data == key)
                return true;
            current = current.next;
        }
        return false;
    }

    public void display() {
        HashNode current = first;
        System.out.print("List: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
