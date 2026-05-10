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

    public int remove() {
        if (size == 0)
            throw new IllegalStateException("Heap is empty!");
        int root = heapArray[0];
        heapArray[0] = heapArray[size-1];
        size--;
        trickleDown(0);
        return root;
    }

    private void trickleDown(int index) {
        int top = heapArray[index];
        while (index < size / 2) {
            int leftChild = 2 * index + 1;
            int rightChild = leftChild + 1;
            int largerChild;
            if (rightChild < size && heapArray[leftChild] < heapArray[rightChild]) 
                largerChild = rightChild;
            else
                largerChild = leftChild;
            if (top >= heapArray[largerChild])
                break;
            heapArray[index] = heapArray[largerChild];
            index = largerChild;
        }
        heapArray[index] = top;
    }

    public void display() {
        for (int i = 0; i < size; i++)
            System.out.print(heapArray[i] + " ");
        System.out.println();
    }
}
