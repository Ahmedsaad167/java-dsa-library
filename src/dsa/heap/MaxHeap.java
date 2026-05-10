package dsa.heap;

public class MaxHeap {
    private int[] heapArray;
    private int size;
    private int maxSize;

    public MaxHeap(int maxSize) {
        this.maxSize = maxSize;
        heapArray = new int[maxSize];
        size = 0;
    }

    public void insert(int value) {
        if (size == maxSize)
            throw new IllegalStateException("Heap is full");
        heapArray[size] = value;
        trickleUp(size);
        size++;
    }

    private void trickleUp(int index) {
        int parent = (index - 1) / 2;
        int bottom = heapArray[index];
        while (index > 0 && heapArray[parent] < bottom) {
            heapArray[index] = heapArray[parent];
            index = parent;
            parent = (parent - 1) / 2;
        }
        heapArray[index] = bottom;
    }

    public void display() {
        for (int i = 0; i < size; i++)
            System.out.print(heapArray[i] + " ");
        System.out.println();
    }
}
