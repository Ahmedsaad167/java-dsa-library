package dsa.queue.priorityqueue;

public class PriorityQueueArray {
    private int[] arr;
    private int size;
    private int maxSize;

    public PriorityQueueArray(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == maxSize;
    }

    public void insert(int value) {
        if (isFull())
            throw new IllegalStateException("Queue if full!");
        int i;
        for (i = size - 1; i >= 0 && arr[i] > value; i--) {
            arr[i+1] = arr[i];
        }
        arr[i+1] = value;
        size++;
    }

    public int remove() {
        if (isEmpty())
            throw new IllegalStateException("Queue is Empty!");
        return arr[--size];
    }

    public int peek() {
        if (isEmpty())
            throw new IllegalStateException("Queue is Empty!");
        return arr[size - 1];
    }

    public void display() {
        System.out.print("Priority Queue: ");
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + "  ");
        System.out.println();
    }

}
