package dsa.main;

import dsa.heap.MaxHeap;

public class Main {

    public static void main(String[] args) {
        MaxHeap heap = new MaxHeap(10);

        heap.insert(70);
        heap.insert(40);
        heap.insert(50);

        heap.display();
    }
}