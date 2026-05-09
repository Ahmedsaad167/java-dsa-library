package dsa.main;

import dsa.stack.LinkedStack;

public class Main {

    public static void main(String[] args) {
        LinkedStack stack = new LinkedStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        stack.pop();

        stack.display();
    }
}