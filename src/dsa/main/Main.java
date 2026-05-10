package dsa.main;

import dsa.sorting.MergeSort;

public class Main {

    public static void main(String[] args) {
        int[] arr = {8, 3, 5, 1, 9, 2};

        MergeSort.sort(arr);

        for (int num : arr)
            System.out.print(num + " ");
    }
}