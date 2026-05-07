package dsa.queue;

public class QueueArray {

    private int[] arr;
    private int front;
    private int rear;
    private int maxSize;

    public QueueArray(int size) {
        this.maxSize = size;
        arr = new int[maxSize];
        front = 0;
        rear = -1;
    }

    public void enqueue(int value) {
        if (isFull())
            throw new IllegalThreadStateException("Queue is full!!");
        arr[++rear] = value;
    }

    public int dequeue() {
        if (isEmpty())
            throw new IllegalThreadStateException("Queue is Empty!!");
        return arr[front++];
    }
    
    public int peek() {
        if (isEmpty())
            throw new IllegalThreadStateException("Queue is Empty!!");
        return arr[front];
    }

    public boolean isEmpty() {
        return front > rear;
    }

    public boolean isFull() {
        return rear == maxSize - 1;
    }

}