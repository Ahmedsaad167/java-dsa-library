package dsa.stack;

public class StackArray {
    private int[] arr;
    private int top;
    private int maxSize;

    public StackArray(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (isFull())
            throw new RuntimeException("Stack is full!!");
        arr[++top] = value;
    }

    public int pop() {
        if (isEmpty())
            throw new RuntimeException("Stack is empty");
        return arr[top--];
    }

    public int peek() {
        if(isEmpty())
            throw new RuntimeException("Stack is empty");
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize-1;
    }
}
