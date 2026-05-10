package dsa.main;

import dsa.sorting.HeapSort;

public class Main {

    public static void main(String[] args) {
        int[] arr = {70, 40, 50, 90, 20};

        HeapSort.sort(arr);

        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }
}