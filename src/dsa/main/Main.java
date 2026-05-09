package dsa.main;

import dsa.recursion.RecursionExamples;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 11, 56, 90, 102, 500};
        System.out.println("Index: " + RecursionExamples.binarySearch(arr, 200));
    }
}