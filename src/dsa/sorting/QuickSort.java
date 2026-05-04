package dsa.sorting;
import dsa.utils.ArrayUtils;

public class QuickSort {
    public static void sort(int[] arr) {
        recQuickSort(arr, 0, arr.length-1);
    }
    
    private static void recQuickSort(int[] arr, int left, int right) {
        if (right <= left)
            return;
        else {
            int pivot = arr[right];
            int partition = partitionIt(arr, left, right, pivot);
            recQuickSort(arr, left, partition-1);
            recQuickSort(arr, partition+1, right);
        }
    }

    private static int partitionIt(int[] arr, int left, int right, int pivot) {
        int leftPtr = left - 1;
        int rightPtr = right;
        while (true) {
            while(arr[++leftPtr] < pivot);
            while(rightPtr > 0 && arr[--rightPtr] > pivot);

            if (leftPtr >= rightPtr)
                break;
            else
                ArrayUtils.swap(arr, leftPtr, rightPtr);
        }
        ArrayUtils.swap(arr, leftPtr, right);
        return leftPtr;
    }

    
}