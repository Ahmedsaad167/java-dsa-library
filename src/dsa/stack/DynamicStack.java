package dsa.stack;

public class DynamicStack {

    private int[] arr;
    private int top;
    private int maxSize;

    public DynamicStack(int size) {
        this.maxSize = size;
        arr = new int[maxSize];
        top = -1;
    }

    private void resize() {
        maxSize *= 2;
        int[] newArr = new int[maxSize];
        for (int i = 0; i <= top; i++)
            newArr[i] = arr[i];
        arr = newArr;
    }

    public void push(int value) {
        if (isFull())
            resize();
        arr[++top] = value;
    }

    public int pop() {
        if (isEmpty()) 
            throw new IllegalStateException("Stack is empty");
        return arr[top--];
    }

    public int peek() {
        if (isEmpty())
            throw new IllegalStateException("Stack is empty");
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }
}