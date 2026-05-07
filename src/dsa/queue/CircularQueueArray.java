package dsa.queue;

public class CircularQueueArray {
    private int[] arr;
    private int front;
    private int rear;
    private int size;
    private int maxSize;

    public CircularQueueArray(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isFull() {
        return size == maxSize;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int value) {
        if (isFull())
            throw new IllegalStateException("Queue is full!!");
        rear = (rear + 1) % maxSize;
        arr[rear] = value;
        size++;
    }

    public int dequeue() {
        if (isEmpty())
            throw new IllegalStateException("Queue is Empty!!");
        int temp = arr[front];
        front = (front + 1) % maxSize;
        size--;
        return temp;
    }

    public int peek() {
        if (isEmpty())
            throw new IllegalStateException("Queue is Empty!!");
        return arr[front];
    }

    public int size() {
        return size;
    }
}
