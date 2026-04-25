package dsa.sorting;

import dsa.utils.*;

public class SelectionSort {
    public static void sort(int[] arr) {
        int minIndex;
        for (int i = 0;i < arr.length-1;i++) {
            minIndex = i;
            for (int j = i+1;j < arr.length;j++)
                if (arr[minIndex] > arr[j])
                    minIndex = j;
            
            if (minIndex != i)
                ArrayUtils.swap(arr, minIndex, i);
        }
    }
}
