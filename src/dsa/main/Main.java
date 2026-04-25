package dsa.main;

import dsa.sorting.BubbleSort;

public class Main {

    public static void main(String[] args) {

        int[] arr = {5, 1, 4, 2};

        BubbleSort.sort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}