package dsa.main;

import dsa.stack.*;

public class Main {

    public static void main(String[] args) {

        DynamicStack stack = new DynamicStack(2);
        
        stack.push(12);
        stack.push(6);
        stack.push(55);
        stack.push(43);
        stack.push(1);
        System.out.println(stack.pop());;
    }
}