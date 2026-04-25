package dsa.sorting;
import dsa.utils.*;

public class BubbleSort {
    public static void sort(int[] arr) {
        for (int i = arr.length;i > 0;i--) 
            for (int j = 1;j < i;j++)
                if (arr[j] < arr[j-1])
                   ArrayUtils.swap(arr, j, j-1); 
    }
}