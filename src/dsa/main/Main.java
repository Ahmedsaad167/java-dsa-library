package dsa.main;

import dsa.sorting.*;
import dsa.stack.StackArray;

public class Main {

    public static void main(String[] args) {

        StackArray stack = new StackArray(5);
        
        stack.push(12);
        stack.push(6);
        stack.push(55);
        System.out.println(stack.pop());
        stack.push(43);
        System.out.println(stack.peek());
        stack.push(1);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}